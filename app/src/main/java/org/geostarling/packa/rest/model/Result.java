package org.geostarling.packa.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by watanabe on 12/24/14.
 */

public class Result {


    @JsonProperty("bool")
    private String bool;

    public String getBool() {
        return bool;
    }

    public void setBool(String bool) {
        this.bool = bool;
    }

    public boolean toBoolean() {
        return bool.equalsIgnoreCase("true");
    }

}
