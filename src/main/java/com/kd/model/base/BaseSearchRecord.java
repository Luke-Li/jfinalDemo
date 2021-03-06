package com.kd.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSearchRecord<M extends BaseSearchRecord<M>> extends Model<M> implements IBean {

	/**
	 * 表名
	 */
	public static final String TableName = "searchRecord";

	/**
	 * 
	 */
	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	/**
	 * 
	 */
	public java.lang.Integer getId() {
		return get("id");
	}

	/**
	 * 请求用户
	 */
	public void setUid(java.lang.String uid) {
		set("uid", uid);
	}

	/**
	 * 请求用户
	 */
	public java.lang.String getUid() {
		return get("uid");
	}

	/**
	 * 请求内容
	 */
	public void setContent(java.lang.String content) {
		set("content", content);
	}

	/**
	 * 请求内容
	 */
	public java.lang.String getContent() {
		return get("content");
	}

	/**
	 * 0-失败、1-成功
	 */
	public void setSuccess(java.lang.Integer success) {
		set("success", success);
	}

	/**
	 * 0-失败、1-成功
	 */
	public java.lang.Integer getSuccess() {
		return get("success");
	}

	/**
	 * 
	 */
	public void setCreateTime(java.util.Date createTime) {
		set("createTime", createTime);
	}

	/**
	 * 
	 */
	public java.util.Date getCreateTime() {
		return get("createTime");
	}

}
