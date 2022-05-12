package com.spring.restapi.security;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebSecurity
/*
 * la classe che fa da configurazione per Spring Security deve estendere la
 * classe WebSecurityConfigurerAdapter
 */
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		/* Configurazione Authorization */
		// TODO Auto-generated method stub
		http.authorizeRequests().antMatchers("/**").permitAll().antMatchers("/studenti").hasRole("*").and()
				.formLogin().loginPage("/login").usernameParameter("username").passwordParameter("password").and()
				.cors().and().csrf().disable();

	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/* Configurazione Authentication */
		/*
		 * uso l'auth builder per definire un'autenticazione direttamente in memoria,
		 * definendo user, password e ruolo
		 */
		auth.inMemoryAuthentication().withUser("user").password("user").roles("USER").and().withUser("admin")
				.password("password").roles("ADMIN");
		
//		http.httpBasic().and().authorizeRequests().antMatchers("/").permitAll().and().authorizeRequests()
//				.antMatchers("/studenti").permitAll().anyRequest().authenticated().and().csrf().disable()
//				.cors(cors -> cors.disable());
//
//		http.build();
//		http.httpBasic().and().authorizeRequests().antMatchers("/**").permitAll().and().formLogin()
//				.loginPage("/").permitAll().and().csrf().disable().cors(cors->cors.disable());
//		http.build();
//		http.formLogin().loginPage("/login")
//				.usernameParameter("username").passwordParameter("password").and().cors(cors -> cors.disable()).csrf()
//				.disable();
	}

	@Bean
	public PasswordEncoder getPasswordencoder() {
		return NoOpPasswordEncoder.getInstance();
	}

//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("admin").password("{noop}password").roles("ADMIN");
//		auth.inMemoryAuthentication().withUser("user").password("{noop}user").roles("USER");
//	}

//	@Bean
//	@Override
//	protected UserDetailsService userDetailsService() {
//		UserDetails user1 = User.withUsername("user").password("user").roles("USER").build();
//		UserDetails user2 = User.withUsername("admin").password("password").roles("ADMIN").build();
//
//		return new InMemoryUserDetailsManager(user1, user2);
//	}

	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowedOrigins(Arrays.asList("*"));
		// or any domain that you want to restrict to
		configuration.setAllowedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization"));
		configuration.setAllowedMethods(Arrays.asList("GET", "POST"));
		// Add the method support as you like
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
	}

}
