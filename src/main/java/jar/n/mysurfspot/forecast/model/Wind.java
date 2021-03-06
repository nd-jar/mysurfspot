
package jar.n.mysurfspot.forecast.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "speed",
        "direction",
        "compassDirection",
        "chill",
        "gusts",
        "unit"
})
public class Wind {

    @JsonProperty("speed")
    private Integer speed;
    @JsonProperty("direction")
    private Integer direction;
    @JsonProperty("compassDirection")
    private String compassDirection;
    @JsonProperty("chill")
    private Integer chill;
    @JsonProperty("gusts")
    private Integer gusts;
    @JsonProperty("unit")
    private String unit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("speed")
    public Integer getSpeed() {
        return speed;
    }

    @JsonProperty("speed")
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @JsonProperty("direction")
    public Integer getDirection() {
        return direction;
    }

    @JsonProperty("direction")
    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    @JsonProperty("compassDirection")
    public String getCompassDirection() {
        return compassDirection;
    }

    @JsonProperty("compassDirection")
    public void setCompassDirection(String compassDirection) {
        this.compassDirection = compassDirection;
    }

    @JsonProperty("chill")
    public Integer getChill() {
        return chill;
    }

    @JsonProperty("chill")
    public void setChill(Integer chill) {
        this.chill = chill;
    }

    @JsonProperty("gusts")
    public Integer getGusts() {
        return gusts;
    }

    @JsonProperty("gusts")
    public void setGusts(Integer gusts) {
        this.gusts = gusts;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
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
