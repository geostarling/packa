package org.geostarling.packa.rest.service;

import org.geostarling.packa.rest.Constants;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created by watanabe on 12/24/14.
 */
public class Util {


    public static UriComponentsBuilder getUriBuilder(int port, String path) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromPath(path);
        builder.host(Constants.host);
        builder.port(port);
        builder.scheme(Constants.schema);
        return builder;
    }

    public static RestTemplate getRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        return restTemplate;
    }

}
