package kr.re.kitri.springposts.controller;

import kr.re.kitri.springposts.model.Post;
import kr.re.kitri.springposts.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }


    //글 전체보기
    @GetMapping("/posts")
    public List<Post> allPosts() {
        return postService.viewAllPosts();
    }


    // 글 상세보기  ,  localhost:8080/posts/2
    @GetMapping("/posts/{postId}")
    public Post viewPostById(@PathVariable long postId) {
        return postService.viewPostById(postId);
    }

    // 글 등록하기
    @PostMapping("/posts")
    public Post addPost(@RequestBody Post post) {

        return postService.registerPost(post);

    }


    @PatchMapping("/posts/{postId}/likes")
    public Post dolike(@PathVariable long postId) {
        return postService.updateLikesPlusOne(postId);
    }

}