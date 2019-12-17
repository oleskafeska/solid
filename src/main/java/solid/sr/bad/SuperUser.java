package solid.sr.bad;

import java.util.HashMap;
import java.util.Map;

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
