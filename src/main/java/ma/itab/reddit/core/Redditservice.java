package ma.itab.reddit.core;

import java.util.ArrayList;
import java.util.List;

public class Redditservice {
    private List<Post> posts = new ArrayList<>();
    public void addPost(Post post) {
        posts.add(post);
    }

    public List<Post> getAllPosts() {
        return posts;
    }
}
