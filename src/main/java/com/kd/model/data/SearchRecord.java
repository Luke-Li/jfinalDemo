package com.kd.model.data;

import com.kd.model.base.BaseSearchRecord;
import com.kd.utils.StringUtil;

/**
 *
 */
@SuppressWarnings("serial")
public class SearchRecord extends BaseSearchRecord<SearchRecord> {
	public static final SearchRecord dao = new SearchRecord();

	public void saveRecord(String uid, String content, int success) {
		try {
			if (!StringUtil.isNullOrEmpty(uid)) {
				SearchRecord record = new SearchRecord();
				record.setUid(uid);
				record.setContent(content);
				record.setSuccess(success);
				record.save();
			}
		} catch (Exception e) {

		}
	}
}
