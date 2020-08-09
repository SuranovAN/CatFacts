import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CatsFactsResponse {

    @JsonProperty("all")
    private List<Cat> cats;

    public List<Cat> getAll() {
        return cats;
    }

    public void setAll(List<Cat> cat) {
        this.cats = cat;
    }

    @Override
    public String toString() {
        return "Test{" +
                "all=" + cats +
                '}';
    }
}