package com.kd.service;

import com.kd.cons.KdConst;
import com.kd.model.data.Keandata;
import com.kd.model.sdefine.KdResult;
import com.kd.response.DataResponse;

public class SearchService {
	public static void search(String arg, DataResponse response) {

		// 1. 正常查询
		Keandata result = Keandata.dao.selectByName(arg);

		if (result == null) {

			if (arg.contains("(") || arg.contains(")")) {
				//2. 英文的括号换成中文的括号查询
				arg = arg.replace("(", "（");
				arg = arg.replace(")", "）");
				result = Keandata.dao.selectByName(arg);
			} else {
				//3. 组织机构代码规范组织机构代码后查询
				if (arg.length() == 9) {
					arg = arg.substring(0, 8) + "-" + arg.substring(8);
				}
				result = Keandata.dao.selectByOrgCode(arg);
			}
		}

		response.setData(new KdResult(result));
		response.setCode(KdConst.CODE_SUCCESS);
		response.setMsg(KdConst.MSG_SUCCESS);
	}
}
