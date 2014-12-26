package org.geostarling.packa.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by watanabe on 12/24/14.
 */
public class ChannelInfoListWrapper {

    @JsonProperty("ChannelInfoList")
    private ChannelInfoList channelInfoList;

    public ChannelInfoList getChannelInfoList() {
        return channelInfoList;
    }

    public void setChannelInfoList(ChannelInfoList channelInfoList) {
        this.channelInfoList = channelInfoList;
    }
}
