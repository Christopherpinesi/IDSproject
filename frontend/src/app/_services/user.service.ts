import { Event } from './../_shared/event-model';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

const API_URL = 'http://localhost:8080/api/';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  // getPublicContent(): Observable<any> {
  //   return this.http.get(API_URL + 'all', { responseType: 'text' });
  // }

  getPublicContent(): Observable<any> {
    return this.http.get(API_URL + 'events/published', { responseType: 'json' });
  }

  getUserBoard(): Observable<any> {
    return this.http.get(API_URL  + 'test/' +  'user', { responseType: 'text' });
  }

  getModeratorBoard(): Observable<any> {
    return this.http.get(API_URL  + 'event');
  }

  putModeratorBoard(id: number, published: boolean): Observable<any> {
    return this.http.put( API_URL + 'events/' + id , { published });
  }

  deleteModeratorBoard(id: number): Observable<any> {
    return this.http.delete( API_URL + 'events/' + id );
  }

  getAdminBoard(): Observable<any> {
    return this.http.get(API_URL + 'events/'  + 'admin', { responseType: 'text' });
  }
}
