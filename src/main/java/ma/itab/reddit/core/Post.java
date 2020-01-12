package ma.itab.reddit.core;

public class Post {
    private String username;
    private String text;
    private Integer like;

    public Post(String username, String text, Integer like) {
        this.username = username;
        this.text = text;
        this.like = like;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }
    public void like(){
        like ++;
    }
    public void dislike(){
        like --;
    }
}
