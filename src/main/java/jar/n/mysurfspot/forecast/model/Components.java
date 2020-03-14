
package jar.n.mysurfspot.forecast.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "combined",
        "primary",
        "secondary",
        "tertiary"
})
public class Components {

    @JsonProperty("combined")
    private Combined combined;
    @JsonProperty("primary")
    private Primary primary;
    @JsonProperty("secondary")
    private Secondary secondary;
    @JsonProperty("tertiary")
    private Tertiary tertiary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("combined")
    public Combined getCombined() {
        return combined;
    }

    @JsonProperty("combined")
    public void setCombined(Combined combined) {
        this.combined = combined;
    }

    @JsonProperty("primary")
    public Primary getPrimary() {
        return primary;
    }

    @JsonProperty("primary")
    public void setPrimary(Primary primary) {
        this.primary = primary;
    }

    @JsonProperty("secondary")
    public Secondary getSecondary() {
        return secondary;
    }

    @JsonProperty("secondary")
    public void setSecondary(Secondary secondary) {
        this.secondary = secondary;
    }

    @JsonProperty("tertiary")
    public Tertiary getTertiary() {
        return tertiary;
    }

    @JsonProperty("tertiary")
    public void setTertiary(Tertiary tertiary) {
        this.tertiary = tertiary;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
