package solid.repsonsibility.bad;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SuperUser {

    private static Map<String, String> posts = new HashMap<>();
    private String userId;
    private String name;
    private String post;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost(String userId) {

        return posts.get(userId);
    }

    public void editPost(String post, String userId) {
        String existingPost = posts.get(userId);

        if (Objects.nonNull(existingPost)) {
            posts.put(userId, post);
        } else throw new IllegalArgumentException("Post not found!");
    }

    public void setPost(String post, String userId) {
        posts.put(userId, post);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
