package com.kd.model.sdefine;

import com.alibaba.fastjson.JSONArray;
import com.kd.model.data.Keandata;

public class KdResult {

	private Object basicList;
	private Object shareHolderList;
	private Object personList;
	private Object entinvItemList;
	private Object frinvList;
	private Object frPositionList;
	private Object alterList;
	private Object filiationList;
	private Object caseInfoList;
	private Object sharesFrostList;
	private Object sharesImpawnList;
	private Object morDetailList;
	private Object morguaInfoList;
	private Object liquidationList;

	public KdResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KdResult(Keandata data) {
		super();
		if (data != null) {
			this.basicList = JSONArray.parseArray(data.getBasicList());
			this.shareHolderList = JSONArray.parseArray(data.getShareHolderList());
			this.personList = JSONArray.parseArray(data.getPersonList());
			this.entinvItemList = JSONArray.parseArray(data.getEntinvItemList());
			this.frinvList = JSONArray.parseArray(data.getFrinvList());
			this.frPositionList = JSONArray.parseArray(data.getFrPositionList());
			this.alterList = JSONArray.parseArray(data.getAlterList());
			this.filiationList = JSONArray.parseArray(data.getFiliationList());
			this.caseInfoList = JSONArray.parseArray(data.getCaseInfoList());
			this.sharesFrostList = JSONArray.parseArray(data.getSharesFrostList());
			this.sharesImpawnList = JSONArray.parseArray(data.getSharesImpawnList());
			this.morDetailList = JSONArray.parseArray(data.getMorDetailList());
			this.morguaInfoList = JSONArray.parseArray(data.getMorguaInfoList());
			this.liquidationList = JSONArray.parseArray(data.getLiquidationList());
		}
	}

	public Object getBasicList() {
		return basicList;
	}

	public void setBasicList(Object basicList) {
		this.basicList = basicList;
	}

	public Object getShareHolderList() {
		return shareHolderList;
	}

	public void setShareHolderList(Object shareHolderList) {
		this.shareHolderList = shareHolderList;
	}

	public Object getPersonList() {
		return personList;
	}

	public void setPersonList(Object personList) {
		this.personList = personList;
	}

	public Object getEntinvItemList() {
		return entinvItemList;
	}

	public void setEntinvItemList(Object entinvItemList) {
		this.entinvItemList = entinvItemList;
	}

	public Object getFrinvList() {
		return frinvList;
	}

	public void setFrinvList(Object frinvList) {
		this.frinvList = frinvList;
	}

	public Object getFrPositionList() {
		return frPositionList;
	}

	public void setFrPositionList(Object frPositionList) {
		this.frPositionList = frPositionList;
	}

	public Object getAlterList() {
		return alterList;
	}

	public void setAlterList(Object alterList) {
		this.alterList = alterList;
	}

	public Object getFiliationList() {
		return filiationList;
	}

	public void setFiliationList(Object filiationList) {
		this.filiationList = filiationList;
	}

	public Object getCaseInfoList() {
		return caseInfoList;
	}

	public void setCaseInfoList(Object caseInfoList) {
		this.caseInfoList = caseInfoList;
	}

	public Object getSharesFrostList() {
		return sharesFrostList;
	}

	public void setSharesFrostList(Object sharesFrostList) {
		this.sharesFrostList = sharesFrostList;
	}

	public Object getSharesImpawnList() {
		return sharesImpawnList;
	}

	public void setSharesImpawnList(Object sharesImpawnList) {
		this.sharesImpawnList = sharesImpawnList;
	}

	public Object getMorDetailList() {
		return morDetailList;
	}

	public void setMorDetailList(Object morDetailList) {
		this.morDetailList = morDetailList;
	}

	public Object getMorguaInfoList() {
		return morguaInfoList;
	}

	public void setMorguaInfoList(Object morguaInfoList) {
		this.morguaInfoList = morguaInfoList;
	}

	public Object getLiquidationList() {
		return liquidationList;
	}

	public void setLiquidationList(Object liquidationList) {
		this.liquidationList = liquidationList;
	}

}
