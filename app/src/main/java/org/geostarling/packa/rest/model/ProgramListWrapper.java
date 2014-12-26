package org.geostarling.packa.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by watanabe on 12/24/14.
 */
public class ProgramListWrapper {


    @JsonProperty("ProgramList")
    private ProgramList programList;

    public ProgramList getProgramList() {
        return programList;
    }

    public void setProgramList(ProgramList programList) {
        this.programList = programList;
    }
}
