package com.strandls.mail_utility.util;

import java.util.Map;

import org.json.JSONObject;

import com.github.wnameless.json.unflattener.JsonUnflattener;

public class JsonUtil {
	
	public static String mapToJSON(Map<String, Object> data) {
		return new JSONObject(data).toString();
	}
	
	public static JSONObject unflattenJSON(Map<String, Object> data) {
		return new JSONObject(JsonUnflattener.unflatten(mapToJSON(data)));
	}

}
