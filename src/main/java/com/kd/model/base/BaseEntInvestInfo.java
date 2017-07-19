package com.kd.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseEntInvestInfo<M extends BaseEntInvestInfo<M>> extends Model<M> implements IBean {

	/**
	 * 表名
	 */
	public static final String TableName = "ent_invest_info";

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
	 * 企业 (机构 )名称
	 */
	public void setEntName(java.lang.String entName) {
		set("entName", entName);
	}

	/**
	 * 企业 (机构 )名称
	 */
	public java.lang.String getEntName() {
		return get("entName");
	}

	/**
	 * 注册号
	 */
	public void setRegNo(java.lang.String regNo) {
		set("regNo", regNo);
	}

	/**
	 * 注册号
	 */
	public java.lang.String getRegNo() {
		return get("regNo");
	}

	/**
	 * 企业 (机构 )类型
	 */
	public void setEntType(java.lang.String entType) {
		set("entType", entType);
	}

	/**
	 * 企业 (机构 )类型
	 */
	public java.lang.String getEntType() {
		return get("entType");
	}

	/**
	 * 注册资本(万元 )
	 */
	public void setRegCap(java.lang.String regCap) {
		set("regCap", regCap);
	}

	/**
	 * 注册资本(万元 )
	 */
	public java.lang.String getRegCap() {
		return get("regCap");
	}

	/**
	 * 注册资本币种
	 */
	public void setRegCapcur(java.lang.String regCapcur) {
		set("regCapcur", regCapcur);
	}

	/**
	 * 注册资本币种
	 */
	public java.lang.String getRegCapcur() {
		return get("regCapcur");
	}

	/**
	 * 注销日期
	 */
	public void setCanDate(java.lang.String canDate) {
		set("canDate", canDate);
	}

	/**
	 * 注销日期
	 */
	public java.lang.String getCanDate() {
		return get("canDate");
	}

	/**
	 * 吊销日期
	 */
	public void setRevDate(java.lang.String revDate) {
		set("revDate", revDate);
	}

	/**
	 * 吊销日期
	 */
	public java.lang.String getRevDate() {
		return get("revDate");
	}

	/**
	 * 企业状态
	 */
	public void setEntStatus(java.lang.String entStatus) {
		set("entStatus", entStatus);
	}

	/**
	 * 企业状态
	 */
	public java.lang.String getEntStatus() {
		return get("entStatus");
	}

	/**
	 * 登记机关
	 */
	public void setRegOrg(java.lang.String regOrg) {
		set("regOrg", regOrg);
	}

	/**
	 * 登记机关
	 */
	public java.lang.String getRegOrg() {
		return get("regOrg");
	}

	/**
	 * 认缴出资额 (万元)
	 */
	public void setSubConam(java.lang.String subConam) {
		set("subConam", subConam);
	}

	/**
	 * 认缴出资额 (万元)
	 */
	public java.lang.String getSubConam() {
		return get("subConam");
	}

	/**
	 * 认缴出资币种
	 */
	public void setCurrency(java.lang.String currency) {
		set("currency", currency);
	}

	/**
	 * 认缴出资币种
	 */
	public java.lang.String getCurrency() {
		return get("currency");
	}

	/**
	 * 出资比例
	 */
	public void setFundedRatio(java.lang.String fundedRatio) {
		set("fundedRatio", fundedRatio);
	}

	/**
	 * 出资比例
	 */
	public java.lang.String getFundedRatio() {
		return get("fundedRatio");
	}

	/**
	 * 开业日期
	 */
	public void setEsDate(java.lang.String esDate) {
		set("esDate", esDate);
	}

	/**
	 * 开业日期
	 */
	public java.lang.String getEsDate() {
		return get("esDate");
	}

	/**
	 * 法定代表人姓名
	 */
	public void setName(java.lang.String name) {
		set("name", name);
	}

	/**
	 * 法定代表人姓名
	 */
	public java.lang.String getName() {
		return get("name");
	}

}
