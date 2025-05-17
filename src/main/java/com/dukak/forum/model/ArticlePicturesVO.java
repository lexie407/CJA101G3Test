package com.dukak.forum.model;

public class ArticlePicturesVO {
	private Integer picId;
	private Integer artId;
	private byte[] picture;

	public ArticlePicturesVO() {
		super();
	}

	public ArticlePicturesVO(Integer picId, Integer artId) {
		setPicId(picId);
		setArtId(artId);
	}

	public Integer getPicId() {
		return picId;
	}

	public void setPicId(Integer picId) {
		this.picId = picId;
	}

	public Integer getArtId() {
		return artId;
	}

	public void setArtId(Integer artId) {
		this.artId = artId;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

}
