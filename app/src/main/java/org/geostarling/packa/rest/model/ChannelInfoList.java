package org.geostarling.packa.rest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by watanabe on 12/24/14.
 */

@JsonIgnoreProperties(
        ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChannelInfoList {

    @JsonProperty("ChannelInfos")
    private List<ChannelInfo> channelInfos;

    public List<ChannelInfo> getChannelInfos() {
        return channelInfos;
    }

    public void setChannelInfos(List<ChannelInfo> channelInfos) {
        this.channelInfos = channelInfos;
    }
}
