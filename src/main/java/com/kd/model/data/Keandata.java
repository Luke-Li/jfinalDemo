package com.kd.model.data;

import com.kd.model.base.BaseKeandata;

/**
 *
 */
@SuppressWarnings("serial")
public class Keandata extends BaseKeandata<Keandata> {
	public static final Keandata dao = new Keandata();

	public Keandata selectByName(String entName) {
		try {
			String sql = String.format("select * from %s where entName=?", Keandata.TableName);
			return dao.findFirst(sql, entName);
		} catch (Exception e) {
			return null;
		}
	}

	public Keandata selectByOrgCode(String code){
		try {
			String sql = String.format("select * from %s where organizationCode=?", Keandata.TableName);
			return dao.findFirst(sql, code);
		} catch (Exception e) {
			return null;
		}
	}
}
