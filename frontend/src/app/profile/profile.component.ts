import { Component, OnInit } from '@angular/core';
import { TokenStorageService } from '../_services/token-storage.service';
import { PostService } from '../_shared/post.service';
import { ActivatedRoute } from '@angular/router';
import { CommentService } from '../comment/comment.service';
import { PostModel } from '../_shared/post-model';
import { CommentPayload } from '../comment/comment.payload';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  name: string;
  posts: PostModel[];
  comments: CommentPayload[];
  postLength: number;
  commentLength: number;
  currentUser: any;

  constructor(private token: TokenStorageService, private activatedRoute: ActivatedRoute, private postService: PostService,
             private commentService: CommentService) {
               this.name = this.activatedRoute.snapshot.params.name;

               this.postService.getAllPostsByUser(this.name).subscribe(data => {
                 this.posts = data;
                 this.postLength = data.length;
               });
               this.commentService.getAllCommentsByUser(this.name).subscribe(data => {
                 this.comments = data;
                 this.commentLength = data.length;
               });
              }

  ngOnInit(): void {
    this.currentUser = this.token.getUser();
  }

}
