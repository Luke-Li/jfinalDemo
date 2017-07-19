package com.kd.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMovableCollateralInfo<M extends BaseMovableCollateralInfo<M>> extends Model<M> implements IBean {

	/**
	 * 表名
	 */
	public static final String TableName = "movable_collateral_info";

	/**
	 * 自增ID
	 */
	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	/**
	 * 自增ID
	 */
	public java.lang.Integer getId() {
		return get("id");
	}

	/**
	 * 抵押ID
	 */
	public void setMorregId(java.lang.String morregId) {
		set("morreg_Id", morregId);
	}

	/**
	 * 抵押ID
	 */
	public java.lang.String getMorregId() {
		return get("morreg_Id");
	}

	/**
	 * 企业名
	 */
	public void setEntName(java.lang.String entName) {
		set("entName", entName);
	}

	/**
	 * 企业名
	 */
	public java.lang.String getEntName() {
		return get("entName");
	}

	/**
	 * 抵押物名称
	 */
	public void setGuaName(java.lang.String guaName) {
		set("guaName", guaName);
	}

	/**
	 * 抵押物名称
	 */
	public java.lang.String getGuaName() {
		return get("guaName");
	}

	/**
	 * 数量
	 */
	public void setQuan(java.lang.String quan) {
		set("quan", quan);
	}

	/**
	 * 数量
	 */
	public java.lang.String getQuan() {
		return get("quan");
	}

	/**
	 * 价值(万元)
	 */
	public void setValue(java.lang.String value) {
		set("value", value);
	}

	/**
	 * 价值(万元)
	 */
	public java.lang.String getValue() {
		return get("value");
	}

}