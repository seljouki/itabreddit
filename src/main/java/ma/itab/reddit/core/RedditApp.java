package ma.itab.reddit.core;

import java.util.List;

public class RedditApp {
    public static void main(String[] args) {



    Redditservice redditservice = new Redditservice();
        Post post = new Post("omar","Bi-color finiss ducunt ad candidatus.",50);
        Post post1 = new Post("donnie","The species is oddly futile.",100);
        redditservice.addPost(post);
        redditservice.addPost(post1);
        post.like();
        post.like();
        post.dislike();
        post1.like();
        post1.like();
    System.out.println(redditservice.getAllPosts());
    List<Post> allPosts = redditservice.getAllPosts();
        for (Post allPost : allPosts) {
            System.out.println(allPost.getLike());

        }
    }
}
