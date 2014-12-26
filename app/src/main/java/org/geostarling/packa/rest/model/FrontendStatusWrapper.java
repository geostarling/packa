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
public class FrontendStatusWrapper {


    @JsonProperty("FrontendStatus")
    private FrontendStatus frontendStatus;

    public FrontendStatus getFrontendStatus() {
        return frontendStatus;
    }

    public void setFrontendStatus(FrontendStatus frontendStatus) {
        this.frontendStatus = frontendStatus;
    }
}
