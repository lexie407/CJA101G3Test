package com.dukak.forum.model;

public class ArticlePicturesVO {
	private Integer pic_id;
	private Integer art_id;
	private byte[] picture;
	
	public ArticlePicturesVO() {
		super();
	}

	public Integer getPic_id() {
		return pic_id;
	}

	public void setPic_id(Integer pic_id) {
		this.pic_id = pic_id;
	}

	public Integer getArt_id() {
		return art_id;
	}

	public void setArt_id(Integer art_id) {
		this.art_id = art_id;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	
	

}
