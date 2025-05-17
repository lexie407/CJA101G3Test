package com.dukak.forum.model;

import java.sql.Date;

public class ArticleCollectionVO {
	private Integer memId;
	private Integer artId;
	private Date colTime;

	public ArticleCollectionVO(Integer memId, Integer artId, Date colTime) {
		super();
		this.memId = memId;
		this.artId = artId;
		this.colTime = colTime;
	}

	public ArticleCollectionVO() {
		super();
	}

	public Integer getMemId() {
		return memId;
	}

	public void setMemId(Integer memId) {
		this.memId = memId;
	}

	public Integer getArtId() {
		return artId;
	}

	public void setArtId(Integer artId) {
		this.artId = artId;
	}

	public Date getColTime() {
		return colTime;
	}

	public void setColTime(Date colTime) {
		this.colTime = colTime;
	}

}
