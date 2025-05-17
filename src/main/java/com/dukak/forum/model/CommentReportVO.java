package com.dukak.forum.model;

import java.sql.Date;

public class CommentReportVO {
	private Integer commRepId;
	private Integer memId;
	private Integer commId;
	private String repCat;
	private String repDes;
	private Byte repSta;
	private Date repTime;
	private Date revTime;
	private String remark;

	public CommentReportVO(Integer commRepId, Integer memId, Integer commId, String repCat, String repDes, Byte repSta,
			Date repTime, Date revTime, String remark) {
		super();
		this.commRepId = commRepId;
		this.memId = memId;
		this.commId = commId;
		this.repCat = repCat;
		this.repDes = repDes;
		this.repSta = repSta;
		this.repTime = repTime;
		this.revTime = revTime;
		this.remark = remark;
	}

	public CommentReportVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCommRepId() {
		return commRepId;
	}

	public void setCommRepId(Integer commRepId) {
		this.commRepId = commRepId;
	}

	public Integer getMemId() {
		return memId;
	}

	public void setMemId(Integer memId) {
		this.memId = memId;
	}

	public Integer getCommId() {
		return commId;
	}

	public void setCommId(Integer commId) {
		this.commId = commId;
	}

	public String getRepCat() {
		return repCat;
	}

	public void setRepCat(String repCat) {
		this.repCat = repCat;
	}

	public String getRepDes() {
		return repDes;
	}

	public void setRepDes(String repDes) {
		this.repDes = repDes;
	}

	public Byte getRepSta() {
		return repSta;
	}

	public void setRepSta(Byte repSta) {
		this.repSta = repSta;
	}

	public Date getRepTime() {
		return repTime;
	}

	public void setRepTime(Date repTime) {
		this.repTime = repTime;
	}

	public Date getRevTime() {
		return revTime;
	}

	public void setRevTime(Date revTime) {
		this.revTime = revTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
