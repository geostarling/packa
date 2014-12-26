
package org.geostarling.packa.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(
        ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChannelInfo {

    @JsonProperty("ATSCMajorChan")
    private String aTSCMajorChan;

    @JsonProperty("ATSCMinorChan")
    private String aTSCMinorChan;

    @JsonProperty("CallSign")
    private String callSign;

    @JsonProperty("ChanFilters")
    private String chanFilters;

    @JsonProperty("ChanId")
    private String chanId;

    @JsonProperty("ChanNum")
    private String chanNum;

    @JsonProperty("ChannelName")
    private String channelName;

    @JsonProperty("CommFree")
    private String commFree;

    @JsonProperty("DefaultAuth")
    private String defaultAuth;

    @JsonProperty("FineTune")
    private String fineTune;

    @JsonProperty("Format")
    private String format;

    @JsonProperty("Frequency")
    private String frequency;

    @JsonProperty("FrequencyId")
    private String frequencyId;

    @JsonProperty("FrequencyTable")
    private String frequencyTable;

    @JsonProperty("IconURL")
    private String iconURL;
    @JsonProperty("InputId")

    private String inputId;

    @JsonProperty("Modulation")
    private String modulation;

    @JsonProperty("MplexId")
    private String mplexId;

    @JsonProperty("NetworkId")
    private String networkId;

    @JsonProperty("Programs")
    private List programs;

    @JsonProperty("SIStandard")
    private String sIStandard;

    @JsonProperty("ServiceId")
    private String serviceId;
    @JsonProperty("SourceId")
    private String sourceId;
    @JsonProperty("TransportId")
    private String transportId;
    @JsonProperty("UseEIT")
    private String useEIT;
    @JsonProperty("Visible")
    private String visible;
    @JsonProperty("XMLTVID")
    private String xMLTVID;

    public String getATSCMajorChan() {
        return this.aTSCMajorChan;
    }

    public void setATSCMajorChan(String aTSCMajorChan) {
        this.aTSCMajorChan = aTSCMajorChan;
    }

    public String getATSCMinorChan() {
        return this.aTSCMinorChan;
    }

    public void setATSCMinorChan(String aTSCMinorChan) {
        this.aTSCMinorChan = aTSCMinorChan;
    }

    public String getCallSign() {
        return this.callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public String getChanFilters() {
        return this.chanFilters;
    }

    public void setChanFilters(String chanFilters) {
        this.chanFilters = chanFilters;
    }

    public String getChanId() {
        return this.chanId;
    }

    public void setChanId(String chanId) {
        this.chanId = chanId;
    }

    public String getChanNum() {
        return this.chanNum;
    }

    public void setChanNum(String chanNum) {
        this.chanNum = chanNum;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getCommFree() {
        return this.commFree;
    }

    public void setCommFree(String commFree) {
        this.commFree = commFree;
    }

    public String getDefaultAuth() {
        return this.defaultAuth;
    }

    public void setDefaultAuth(String defaultAuth) {
        this.defaultAuth = defaultAuth;
    }

    public String getFineTune() {
        return this.fineTune;
    }

    public void setFineTune(String fineTune) {
        this.fineTune = fineTune;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFrequency() {
        return this.frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getFrequencyId() {
        return this.frequencyId;
    }

    public void setFrequencyId(String frequencyId) {
        this.frequencyId = frequencyId;
    }

    public String getFrequencyTable() {
        return this.frequencyTable;
    }

    public void setFrequencyTable(String frequencyTable) {
        this.frequencyTable = frequencyTable;
    }

    public String getIconURL() {
        return this.iconURL;
    }

    public void setIconURL(String iconURL) {
        this.iconURL = iconURL;
    }

    public String getInputId() {
        return this.inputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    public String getModulation() {
        return this.modulation;
    }

    public void setModulation(String modulation) {
        this.modulation = modulation;
    }

    public String getMplexId() {
        return this.mplexId;
    }

    public void setMplexId(String mplexId) {
        this.mplexId = mplexId;
    }

    public String getNetworkId() {
        return this.networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public List getPrograms() {
        return this.programs;
    }

    public void setPrograms(List programs) {
        this.programs = programs;
    }

    public String getSIStandard() {
        return this.sIStandard;
    }

    public void setSIStandard(String sIStandard) {
        this.sIStandard = sIStandard;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getTransportId() {
        return this.transportId;
    }

    public void setTransportId(String transportId) {
        this.transportId = transportId;
    }

    public String getUseEIT() {
        return this.useEIT;
    }

    public void setUseEIT(String useEIT) {
        this.useEIT = useEIT;
    }

    public String getVisible() {
        return this.visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String getXMLTVID() {
        return this.xMLTVID;
    }

    public void setXMLTVID(String xMLTVID) {
        this.xMLTVID = xMLTVID;
    }


    @Override
    public String toString() {
        return "ChannelInfo{" +
                "aTSCMajorChan='" + aTSCMajorChan + '\'' +
                ", aTSCMinorChan='" + aTSCMinorChan + '\'' +
                ", callSign='" + callSign + '\'' +
                ", chanFilters='" + chanFilters + '\'' +
                ", chanId='" + chanId + '\'' +
                ", chanNum='" + chanNum + '\'' +
                ", channelName='" + channelName + '\'' +
                ", commFree='" + commFree + '\'' +
                ", defaultAuth='" + defaultAuth + '\'' +
                ", fineTune='" + fineTune + '\'' +
                ", format='" + format + '\'' +
                ", frequency='" + frequency + '\'' +
                ", frequencyId='" + frequencyId + '\'' +
                ", frequencyTable='" + frequencyTable + '\'' +
                ", iconURL='" + iconURL + '\'' +
                ", inputId='" + inputId + '\'' +
                ", modulation='" + modulation + '\'' +
                ", mplexId='" + mplexId + '\'' +
                ", networkId='" + networkId + '\'' +
                ", programs=" + programs +
                ", sIStandard='" + sIStandard + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", sourceId='" + sourceId + '\'' +
                ", transportId='" + transportId + '\'' +
                ", useEIT='" + useEIT + '\'' +
                ", visible='" + visible + '\'' +
                ", xMLTVID='" + xMLTVID + '\'' +
                '}';
    }
}