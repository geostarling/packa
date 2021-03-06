package org.geostarling.packa.rest.service;

import android.util.Log;

import org.geostarling.packa.rest.Constants;
import org.geostarling.packa.rest.model.FrontendStatus;
import org.geostarling.packa.rest.model.FrontendStatusWrapper;
import org.geostarling.packa.rest.model.Result;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by watanabe on 12/24/14.
 */
public class FrontendService {

    private static final String TAG = "FrontendService";

    public FrontendStatus getState() {

        RestTemplate restTemplate = Util.getRestTemplate();

        UriComponentsBuilder builder = Util.getUriBuilder(Constants.fePort, Constants.getStatusUrl);
        UriComponents uriComps = builder.build();

        FrontendStatusWrapper result = restTemplate.getForObject(uriComps.toUriString(), FrontendStatusWrapper.class);
        return result.getFrontendStatus();

    }

    public boolean sendAction(String action) {

        Log.d(TAG, "Sending action: " + action);
        RestTemplate restTemplate = Util.getRestTemplate();

        UriComponentsBuilder builder = Util.getUriBuilder(Constants.fePort, Constants.sendActionUrl);
        Map<String, String> vars = new HashMap<String, String>();
        vars.put("action", action);
        UriComponents uriComps = builder.buildAndExpand(vars);
        Result result = restTemplate.getForObject(uriComps.toUriString(), Result.class);
        return result.toBoolean();
    }

    public boolean playRecording(String chanId, String startTime) {

        Log.d(TAG, "Play recording: chanId=" + chanId + ". startTime=" + startTime);
        RestTemplate restTemplate = Util.getRestTemplate();

        UriComponentsBuilder builder = Util.getUriBuilder(Constants.fePort, Constants.playRecordingUrl);
        Map<String, String> vars = new HashMap<String, String>();
        vars.put("chanId", chanId);
        vars.put("startTime", startTime);
        UriComponents uriComps = builder.buildAndExpand(vars);

        Result result = restTemplate.getForObject(uriComps.toUriString(), Result.class);
        return result.toBoolean();

    }


}
