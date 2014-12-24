package org.geostarling.packa.rest.model;

import java.util.List;

public class State {
    private String currentlocation;
    private String menutheme;
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