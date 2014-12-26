package org.geostarling.packa.rest.service;

import org.geostarling.packa.rest.Constants;
import org.geostarling.packa.rest.model.ChannelInfoList;
import org.geostarling.packa.rest.model.ChannelInfoListWrapper;
import org.geostarling.packa.rest.model.ProgramListWrapper;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by watanabe on 12/24/14.
 */
public class ChannelService {


    public ChannelInfoList getAll() {

        RestTemplate restTemplate = Util.getRestTemplate();

        UriComponentsBuilder builder = Util.getUriBuilder(Constants.bePort, Constants.getChannelInfoListUrl);

        Map<String, String> vars = new HashMap<String, String>();

        vars.put("sourceId", "1");
        vars.put("startIdx", "1");
        vars.put("count", "100");

        UriComponents uriComps = builder.buildAndExpand(vars);

        ChannelInfoListWrapper result = restTemplate.getForObject(uriComps.toUriString(), ChannelInfoListWrapper.class);
        return result.getChannelInfoList();
    }


}
