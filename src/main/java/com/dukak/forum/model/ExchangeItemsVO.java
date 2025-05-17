package com.dukak.forum.model;

import java.sql.Date;

public class ExchangeItemsVO {
	private Integer itemId;
	private Integer itemName;
	private Integer amount;
	private Date startDate;
	private Date endDate;
	private Byte itemCat;
	private byte[] itemImg;

	public ExchangeItemsVO(Integer itemId, Integer itemName, Integer amount, Date startDate, Date endDate, Byte itemCat,
			byte[] itemImg) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.amount = amount;
		this.startDate = startDate;
		this.endDate = endDate;
		this.itemCat = itemCat;
		this.itemImg = itemImg;
	}

	public ExchangeItemsVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getItemName() {
		return itemName;
	}

	public void setItemName(Integer itemName) {
		this.itemName = itemName;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Byte getItemCat() {
		return itemCat;
	}

	public void setItemCat(Byte itemCat) {
		this.itemCat = itemCat;
	}

	public byte[] getItemImg() {
		return itemImg;
	}

	public void setItemImg(byte[] itemImg) {
		this.itemImg = itemImg;
	}

}
