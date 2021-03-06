
package jar.n.mysurfspot.forecast.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "swell",
        "period",
        "wind",
        "pressure",
        "sst"
})
public class Charts {

    @JsonProperty("swell")
    private String swell;
    @JsonProperty("period")
    private String period;
    @JsonProperty("wind")
    private String wind;
    @JsonProperty("pressure")
    private String pressure;
    @JsonProperty("sst")
    private String sst;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("swell")
    public String getSwell() {
        return swell;
    }

    @JsonProperty("swell")
    public void setSwell(String swell) {
        this.swell = swell;
    }

    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    @JsonProperty("wind")
    public String getWind() {
        return wind;
    }

    @JsonProperty("wind")
    public void setWind(String wind) {
        this.wind = wind;
    }

    @JsonProperty("pressure")
    public String getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("sst")
    public String getSst() {
        return sst;
    }

    @JsonProperty("sst")
    public void setSst(String sst) {
        this.sst = sst;
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
