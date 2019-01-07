import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-contact-create',
  templateUrl: './contact-create.component.html',
  styleUrls: ['./contact-create.component.css']
})
export class ContactCreateComponent implements OnInit {

  contact = {};

  constructor(private http: HttpClient, private router: Router) {
  }

  ngOnInit() {
  }

  saveContact() {
    this.http.post('/contacts', this.contact)
      .subscribe(res => {
          // this.router.navigate(['/contact-detail', res]);
          let id = res['id'];
          this.router.navigate(['/contact-detail', id]);
        }, (err) => {
          console.log(err);
        }
      );
  }

}
