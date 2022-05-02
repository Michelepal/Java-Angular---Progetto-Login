

import { AfterViewInit, Component, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTable } from '@angular/material/table';

import { ListausersDataSource, ListausersItem } from './listausers-datasource';

@Component({
  selector: 'app-listausers',
  templateUrl: './listausers.component.html',
  styleUrls: ['./listausers.component.css']
})
export class ListausersComponent implements AfterViewInit {
  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;
  @ViewChild(MatTable) table!: MatTable<ListausersItem>;
  dataSource: ListausersDataSource;

  /** Columns displayed in the table. Columns IDs can be added, removed, or reordered. */
  /*aggiungere le colonne da visualizzare in corrispondenza dei dati della entity*/ 
  displayedColumns = ['id', 'user', 'password', 'matricola', 'nome', 'anno'];

  constructor() {
    
    this.dataSource = new ListausersDataSource();

  }

  ngAfterViewInit(): void {
    this.dataSource.sort = this.sort;
    this.dataSource.paginator = this.paginator;
    this.table.dataSource = this.dataSource;
  }
}
