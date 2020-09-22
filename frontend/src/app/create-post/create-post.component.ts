import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { throwError } from 'rxjs';
import { PostService } from '../_shared/post.service';
import { CreatePostPayload} from './create.post.payload';
import { TokenStorageService } from '../_services/token-storage.service';

@Component({
  selector: 'app-create-post',
  templateUrl: './create-post.component.html',
  styleUrls: ['./create-post.component.css']
})
export class CreatePostComponent implements OnInit {
  createPostForm: FormGroup;
  postPayload: CreatePostPayload;

  constructor(private router: Router, private postService: PostService, private token: TokenStorageService) {
    this.postPayload = {
      title: '',
      description:'',
      location:'',
      category:'',
      date:'',
      user:''
    }
   }

  ngOnInit(){
    this.createPostForm = new FormGroup({
      title: new FormControl(''),
      description: new FormControl(''),
      location: new FormControl(''),
      category: new FormControl(''),
      date: new FormControl(''),
      user: new FormControl('')
      });
    }

  createPost() {
    this.postPayload.title = this.createPostForm.get('title').value;
    this.postPayload.description = this.createPostForm.get('description').value;
    this.postPayload.location = this.createPostForm.get('location').value;
    this.postPayload.category = this.createPostForm.get('category').value;
    this.postPayload.date = this.createPostForm.get('date').value;
    // this.postPayload.user = this.token.getUser('username').value;
    
    this.postService.createPost(this.postPayload).subscribe((data) => {
      this.router.navigateByUrl('/event');
      console.log(data);
    }, error => {
      throwError(error);
    })
  }

  discardPost() {
    this.router.navigateByUrl('/');
  }
}
