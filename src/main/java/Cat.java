import com.fasterxml.jackson.annotation.JsonProperty;

public class Cat {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("text")
    private String text;
    @JsonProperty("type")
    private String type;
    @JsonProperty("user")
    private User user;
    @JsonProperty("upvotes")
    private Integer upvotes;
    @JsonProperty("userUpvoted")
    private Object userUpvoted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(Integer upvotes) {
        this.upvotes = upvotes;
    }

    public Object getUserUpvoted() {
        return userUpvoted;
    }

    public void setUserUpvoted(Object userUpvoted) {
        this.userUpvoted = userUpvoted;
    }

    @Override
    public String toString() {
        return "All{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user=" + user +
                ", upvotes=" + upvotes +
                ", userUpvoted=" + userUpvoted +
                '}';
    }
}