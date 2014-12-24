package org.geostarling.packa.rest.model;

/**
 * Created by watanabe on 12/24/14.
 */
public class Result {

    private String bool;

    public boolean toBoolean() {
        return bool.equalsIgnoreCase("true");
    }
}
