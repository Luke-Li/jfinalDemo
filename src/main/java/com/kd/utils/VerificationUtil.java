package com.kd.utils;

import com.jfinal.kit.PropKit;
import com.kd.cons.KdConst;
import com.kd.response.DataResponse;

public class VerificationUtil {

	public static boolean userVerify(String uid, String sign, DataResponse response){
		if(StringUtil.isNullOrEmpty(uid) || StringUtil.isNullOrEmpty(sign)){
			response.setCode(KdConst.CODE_WRONG);
			response.setMsg(KdConst.MSG_WRONG);
			return false;
		}

		String pwd = PropKit.use("userinfo.properties").get(uid);
		if(0 == sign.compareTo(MD5.sign(pwd))){
			return true;
		}else{
			response.setCode(KdConst.CODE_WRONG);
			response.setMsg(KdConst.MSG_WRONG);
			return false;
		}

	}
}
