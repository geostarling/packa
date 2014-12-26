
package org.geostarling.packa.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;


@JsonIgnoreProperties(
        ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Artwork{
   	private List artworkInfos;

 	public List getArtworkInfos(){
		return this.artworkInfos;
	}
	public void setArtworkInfos(List artworkInfos){
		this.artworkInfos = artworkInfos;
	}
}
