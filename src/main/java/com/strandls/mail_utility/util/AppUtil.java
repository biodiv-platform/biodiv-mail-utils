package com.strandls.mail_utility.util;

import com.strandls.mail_utility.model.EnumModel.MAIL_TYPE;
import com.strandls.mail_utility.model.EnumModel.OBJECT_TYPE;

public final class AppUtil {
//	TRANSFERING REPO TO BIODIV-PLATFORM
	
	private AppUtil() {}
	
	public static MAIL_TYPE getMailType(String type) {
		for (MAIL_TYPE types: MAIL_TYPE.values()) {
			if (types.name().equalsIgnoreCase(type)) {
				return types;
			}
		}
		return MAIL_TYPE.INVALID;
	}
	
	public static OBJECT_TYPE  getObjectType(String type) {
		for (OBJECT_TYPE types: OBJECT_TYPE.values()) {
			if (types.name().equalsIgnoreCase(type)) {
				return types;
			}
		}
		return OBJECT_TYPE.INVALID;
	}

}
