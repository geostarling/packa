package org.geostarling.packa.rest;

/**
 * Created by watanabe on 12/24/14.
 */
public class Constants {

    public static String sendActionUrl = "/Frontend/SendAction?Action={action}";
    public static String playRecordingUrl = "/Frontend/PlayRecording?ChanId={chanId}&StartTime={startTime}";
    public static String getRecordedListUrl = "/Dvr/GetRecordedList?StartIndex={startIdx}&Count={count}&Descending=true";
    public static String getChannelInfoListUrl = "/Channel/GetChannelInfoList?SourceID={sourceId}&StartIndex={startIdx}&Count={count}";
    public static String getStatusUrl = "/Frontend/GetStatus";

    public static String host = "10.0.1.155";
    public static int fePort = 7547;
    public static int bePort = 7544;
    public static String schema = "http";

}
