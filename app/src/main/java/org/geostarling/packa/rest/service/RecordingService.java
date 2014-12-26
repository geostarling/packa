package org.geostarling.packa.rest.service;

import org.geostarling.packa.rest.Constants;
import org.geostarling.packa.rest.model.ChannelInfoList;
import org.geostarling.packa.rest.model.ProgramList;
import org.geostarling.packa.rest.model.ProgramListWrapper;
import org.geostarling.packa.rest.model.Result;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by watanabe on 12/24/14.
 */
public class RecordingService {


    public ProgramList getAll() {

        RestTemplate restTemplate = Util.getRestTemplate();

        UriComponentsBuilder builder = Util.getUriBuilder(Constants.bePort, Constants.getRecordedListUrl);
        Map<String, String> vars = new HashMap<String, String>();
        vars.put("startIdx", "1");
        vars.put("count", "100");
        UriComponents uriComps = builder.buildAndExpand(vars);

        ProgramListWrapper result = restTemplate.getForObject(uriComps.toUriString(), ProgramListWrapper.class);
        return result.getProgramList();
    }

}
