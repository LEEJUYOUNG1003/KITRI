package kr.re.kitri.springposts.controller;


import kr.re.kitri.springposts.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }


    @GetMapping("/posts")
    public String posts(){
        return postService.viewAllPosts();
    }

    @GetMapping("/posts/id")
    public String detail() {
        return "Detail";
    }

    @PostMapping("/posts")
    public String Register(){

        return "Register";
    }

    @PutMapping("/posts")
    public String Update(){

        return "Update";
    }

    @DeleteMapping("/posts/id")
    public String Delete(){
        return "Delete";
    }

    @PatchMapping("/posts/id")
    public String Patch(){
        return "Patch";
    }

}
