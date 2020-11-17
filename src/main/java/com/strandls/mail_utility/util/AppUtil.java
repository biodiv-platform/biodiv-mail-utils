package com.strandls.mail_utility.util;

import com.strandls.mail_utility.model.EnumModel.MAIL_TYPE;

public final class AppUtil {
	
	private AppUtil() {}
	
	public static MAIL_TYPE getMailType(String type) {
		for (MAIL_TYPE types: MAIL_TYPE.values()) {
			if (types.name().equalsIgnoreCase(type)) {
				return types;
			}
		}
		return MAIL_TYPE.INVALID;
	}

}
