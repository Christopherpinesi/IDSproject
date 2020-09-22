import { Component, OnInit } from '@angular/core';
import { UserService } from '../_services/user.service';
import { PostModel } from '../_shared/post-model';
import { PostService } from '../_shared/post.service';
import { TokenStorageService } from '../_services/token-storage.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  

  posts: Array<PostModel> = [];
  content: any = [];
  currentUser: any;

  constructor(
    private userService: UserService, 
    private postService: PostService,
    private token: TokenStorageService
    ) {
    this.postService.getAllPosts().subscribe(post => {
      this.posts= post;
    });
   }

  ngOnInit(): void {
    this.userService.getPublicContent().subscribe(
      data => {
        this.content = data;
        console.log(this.content);
      },
      err => {
        this.content = JSON.parse(err.error).message;
      }
    );
    this.currentUser=this.token.getUser()
    }
    
}

