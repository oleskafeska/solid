package sr.good;

import java.util.HashMap;
import java.util.Map;

public class PostService {

    private static Map<String, String> posts = new HashMap<>();

    public void addPost(Post post) {

        posts.put(post.getUserId(), post.getPost());
    }

    public String getPost(String userId) {

        return posts.getOrDefault(userId, "no posts");
    }
}
