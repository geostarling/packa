package org.geostarling.packa.rest;

/**
 * Created by watanabe on 12/24/14.
 */
public class Constants {

    public static String sendActionUrl = "{schema}://{host}:{port}/Frontend/SendAction?Action=0";
    public static String playRecordingUrl = "{schema}://{host}:{port}/Frontend/PlayRecording?ChanId={chanId}&StartTime={startTime}";
    public static String getRecordedListUrl = "{schema}://{host}:{port}/Dvr/GetRecordedList?StartIndex={startIdx}&Count={count}&Descending=true";
    public static String getChannelInfoListUrl = "{schema}://{host}:{port}/Channel/GetChannelInfoList?SourceID={sourceId}&StartIndex={startIdx}&Count={count}";
    public static String getStatusUrl = "{schema}://{host}:{port}/Frontend/GetStatus";

    public static String host = "10.0.1.140";
    public static int fePort = 6547;
    public static int bePort = 6544;
    public static String schema = "http";

}
