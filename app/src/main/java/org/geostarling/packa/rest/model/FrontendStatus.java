package org.geostarling.packa.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by watanabe on 12/24/14.
 */
@JsonIgnoreProperties(
        ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FrontendStatus {


    @JsonProperty("State")
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
