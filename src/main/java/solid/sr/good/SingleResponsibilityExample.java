package solid.sr.good;

import java.util.UUID;

public class SingleResponsibilityExample {

    public static void main(String[] args) {

        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("John");

        Post post = new Post();
        post.setUserId(user.getId());
        post.setPost("Hello! This is my very first post here");

        // Still not so good, but much better
        PostService postService = new PostService();

        postService.addPost(post);

        System.out.println(postService.getPost(user.getId()));

    }
}
