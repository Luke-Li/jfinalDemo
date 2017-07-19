package com.kd.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import com.jfinal.core.Controller;
import com.jfinal.ext.route.ControllerBind;
import com.kd.cons.KdConst;
import com.kd.model.data.SearchRecord;
import com.kd.response.DataResponse;
import com.kd.service.SearchService;
import com.kd.utils.VerificationUtil;

@ControllerBind(controllerKey = "/api")
public class EntInfoController extends Controller{
	public void get(){

		DataResponse response = new DataResponse();

		try {
			String uid = getPara("uid");
			String arg = URLDecoder.decode(getPara("arg"),"UTF-8");
			String sign = getPara("sign");

			if(VerificationUtil.userVerify(uid, sign, response) == false){
				renderJson(response);
				return;
			}

			SearchService.search(arg, response);
			SearchRecord.dao.saveRecord(uid, arg, 1);
		} catch (UnsupportedEncodingException e) {
			response.setCode(KdConst.CODE_WRONG);
			response.setMsg(KdConst.MSG_WRONG);
			SearchRecord.dao.saveRecord(getPara("uid"), getPara("arg"), 0);
		}
		renderJson(response);
	}
}
