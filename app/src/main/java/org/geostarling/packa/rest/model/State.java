package org.geostarling.packa.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(
        ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class State {


    @JsonProperty("currentlocation")
    private String currentlocation;

    @JsonProperty("menutheme")
    private String menutheme;

    @JsonProperty("state")
    private String state;

    public String getCurrentlocation() {
        return this.currentlocation;
    }

    public void setCurrentlocation(String currentlocation) {
        this.currentlocation = currentlocation;
    }

    public String getMenutheme() {
        return this.menutheme;
    }

    public void setMenutheme(String menutheme) {
        this.menutheme = menutheme;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}