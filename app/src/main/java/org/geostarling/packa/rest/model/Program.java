
package org.geostarling.packa.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@JsonIgnoreProperties(
        ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)

public class Program {

    @JsonProperty("Airdate")
    private String airdate;
    @JsonProperty("Artwork")
    private Artwork artwork;
    @JsonProperty("AudioProps")
    private String audioProps;
    @JsonProperty("CatType")
    private String catType;
    @JsonProperty("Category")
    private String category;
    @JsonProperty("Channel")
    private ChannelInfo channel;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("EndTime")
    private String endTime;
    @JsonProperty("Episode")
    private String episode;
    @JsonProperty("FileName")
    private String fileName;
    @JsonProperty("FileSize")
    private String fileSize;
    @JsonProperty("HostName")
    private String hostName;
    @JsonProperty("Inetref")
    private String inetref;
    @JsonProperty("LastModified")
    private String lastModified;
    @JsonProperty("ProgramFlags")
    private String programFlags;
    @JsonProperty("ProgramId")
    private String programId;
    @JsonProperty("Recording")
    private Recording recording;
    @JsonProperty("Repeat")
    private String repeat;
    @JsonProperty("Season")
    private String season;
    @JsonProperty("SeriesId")
    private String seriesId;
    @JsonProperty("Stars")
    private String stars;
    @JsonProperty("StartTime")
    private String startTime;
    @JsonProperty("SubProps")
    private String subProps;
    @JsonProperty("subTitle")
    private String subTitle;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("VideoProps")
    private String videoProps;

    public String getAirdate() {
        return this.airdate;
    }

    public void setAirdate(String airdate) {
        this.airdate = airdate;
    }

    public Artwork getArtwork() {
        return this.artwork;
    }

    public void setArtwork(Artwork artwork) {
        this.artwork = artwork;
    }

    public String getAudioProps() {
        return this.audioProps;
    }

    public void setAudioProps(String audioProps) {
        this.audioProps = audioProps;
    }

    public String getCatType() {
        return this.catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ChannelInfo getChannel() {
        return this.channel;
    }

    public void setChannel(ChannelInfo channel) {
        this.channel = channel;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEpisode() {
        return this.episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getHostName() {
        return this.hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getInetref() {
        return this.inetref;
    }

    public void setInetref(String inetref) {
        this.inetref = inetref;
    }

    public String getLastModified() {
        return this.lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getProgramFlags() {
        return this.programFlags;
    }

    public void setProgramFlags(String programFlags) {
        this.programFlags = programFlags;
    }

    public String getProgramId() {
        return this.programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public Recording getRecording() {
        return this.recording;
    }

    public void setRecording(Recording recording) {
        this.recording = recording;
    }

    public String getRepeat() {
        return this.repeat;
    }

    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

    public String getSeason() {
        return this.season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSeriesId() {
        return this.seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public String getStars() {
        return this.stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getSubProps() {
        return this.subProps;
    }

    public void setSubProps(String subProps) {
        this.subProps = subProps;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideoProps() {
        return this.videoProps;
    }

    public void setVideoProps(String videoProps) {
        this.videoProps = videoProps;
    }

    @Override
    public String toString() {
        return "Program{" +
                "airdate='" + airdate + '\'' +
                ", artwork=" + artwork +
                ", audioProps='" + audioProps + '\'' +
                ", catType='" + catType + '\'' +
                ", category='" + category + '\'' +
                ", channel=" + channel +
                ", description='" + description + '\'' +
                ", endTime='" + endTime + '\'' +
                ", episode='" + episode + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileSize='" + fileSize + '\'' +
                ", hostName='" + hostName + '\'' +
                ", inetref='" + inetref + '\'' +
                ", lastModified='" + lastModified + '\'' +
                ", programFlags='" + programFlags + '\'' +
                ", programId='" + programId + '\'' +
                ", recording=" + recording +
                ", repeat='" + repeat + '\'' +
                ", season='" + season + '\'' +
                ", seriesId='" + seriesId + '\'' +
                ", stars='" + stars + '\'' +
                ", startTime='" + startTime + '\'' +
                ", subProps='" + subProps + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", title='" + title + '\'' +
                ", videoProps='" + videoProps + '\'' +
                '}';
    }
}
