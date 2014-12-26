
package org.geostarling.packa.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(
        ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Recording {

    @JsonProperty("DupInType")
    private String dupInType;
    @JsonProperty("DupMethod")
    private String dupMethod;
    @JsonProperty("EncoderId")
    private String encoderId;
    @JsonProperty("EndTs")
    private String endTs;
    @JsonProperty("PlayGroup")
    private String playGroup;
    @JsonProperty("Priority")
    private String priority;
    @JsonProperty("Profile")
    private String profile;
    @JsonProperty("RecGroup")
    private String recGroup;
    @JsonProperty("RecType")
    private String recType;
    @JsonProperty("RecordId")
    private String recordId;
    @JsonProperty("StartTs")
    private String startTs;
    @JsonProperty("Status")
    private String status;
    @JsonProperty("StorageGroup")
    private String storageGroup;

    public String getDupInType() {
        return this.dupInType;
    }

    public void setDupInType(String dupInType) {
        this.dupInType = dupInType;
    }

    public String getDupMethod() {
        return this.dupMethod;
    }

    public void setDupMethod(String dupMethod) {
        this.dupMethod = dupMethod;
    }

    public String getEncoderId() {
        return this.encoderId;
    }

    public void setEncoderId(String encoderId) {
        this.encoderId = encoderId;
    }

    public String getEndTs() {
        return this.endTs;
    }

    public void setEndTs(String endTs) {
        this.endTs = endTs;
    }

    public String getPlayGroup() {
        return this.playGroup;
    }

    public void setPlayGroup(String playGroup) {
        this.playGroup = playGroup;
    }

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getProfile() {
        return this.profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getRecGroup() {
        return this.recGroup;
    }

    public void setRecGroup(String recGroup) {
        this.recGroup = recGroup;
    }

    public String getRecType() {
        return this.recType;
    }

    public void setRecType(String recType) {
        this.recType = recType;
    }

    public String getRecordId() {
        return this.recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getStartTs() {
        return this.startTs;
    }

    public void setStartTs(String startTs) {
        this.startTs = startTs;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStorageGroup() {
        return this.storageGroup;
    }

    public void setStorageGroup(String storageGroup) {
        this.storageGroup = storageGroup;
    }
}
