import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Router} from "@angular/router";
import {Seller} from "../class/seller";

@Injectable({
  providedIn: 'root'
})
export class SellerService {
  seller:Seller;
  constructor(private http: HttpClient,public router: Router) {
    this.seller = new Seller();
  }

  addItem(item:any){
    const httpOptions = {
      headers: new HttpHeaders({ "Content-Type": "application/json" })
    };
    this.http.post("/apiseller/addItem",item,httpOptions).subscribe( val => {
        // this.router.navigateByUrl("code200Page/signup");
      },
      error => {
        this.router.navigateByUrl("errPage");
      }
    );
  }
}
