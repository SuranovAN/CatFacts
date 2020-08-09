import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("name")
    private Name name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}