import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Faal {
    @JsonProperty("Poem")
    private String poem;
    @JsonProperty("Interpretation")
    private String interpretation;

    public Faal(){}

    public String getPoem() {
        return poem;
    }

    public String getInterpretation() {
        return interpretation;
    }
}
