package com.dukak.favspot.model;

import java.io.Serializable;

public class FavSpotVO implements Serializable {
//    private static final long serialVersionUID = 1L;
	
	private Integer favSpotId;    
	private Integer memId;
	
	//get,set
	public Integer getFavSpotId() {
		return favSpotId;
	}
	public void setFavSpotId(Integer favSpotId) {
		this.favSpotId = favSpotId;
	}
	public Integer getMemId() {
		return memId;
	}
	public void setMemId(Integer memId) {
		this.memId = memId;
	}    
	
   

}
