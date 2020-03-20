package com.strandls.mail_utility.model;

public class EnumModel {
	
	public static enum FIELDS {
		TO("to"),
		TYPE("type"),
		DATA("data"),
		SUBJECT("subject");
		
		private String action;
		
		private FIELDS(String action) {
			this.action = action;
		}
		
		public String getAction() {
			return action;
		}
	};
	
	public static enum MAIL_TYPE {
		INVALID("INVALID"),
		USER_REGISTRATION("USER_REGISTRATION"),
		RESET_PASSWORD("RESET_PASSWORD"),
		WELCOME_MAIL("WELCOME_MAIL"),
		DOWNLOAD_MAIL("DOWNLOAD_MAIL"),
		TAGGED_MAIL("TAGGED_MAIL"),
		COMMENT_POST("COMMENT_POST"),
		POST_TO_GROUP("POST_TO_GROUP"),
		FACT_UPDATED("FACT_UPDATED"),
		TAG_UPDATED("TAG_UPDATED"),
		CUSTOM_FIELD_UPDATED("CUSTOM_FIELD_UPDATED"),
		OBSERVATION_ADDED("OBSERVATION_ADDED"),
		OBSERVATION_UPDATED("OBSERVATION_UPDATED"),
		OBSERVATION_LOCKED("OBSERVATION_LOCKED"),
		OBSERVATION_UNLOCKED("OBSERVATION_UNLOCKED"),
		OBSERVATION_FLAGGED("OBSERVATION_FLAGGED"),
		AGREED_SPECIES("AGREED_SPECIES"),
		REMOVED_SPECIES("REMOVED_SPECIES"),
		FEATURED_POST("FEATURED_POST"),
		FEATURED_POST_IBP("FEATURED_POST_IBP"),
		SUGGEST_MAIL("SUGGEST_MAIL");
		
		private String action;
		
		private MAIL_TYPE(String action) {
			this.action = action;
		}
		
		public String getAction() {
			return action;
		}
	};
	
	public static enum USER_REGISTRATION {
		USERNAME("username"),
		OTP("otp"),
		TYPE("type");
		
		private String action;
		
		private USER_REGISTRATION(String action) {
			this.action = action;
		}
		
		public String getAction() {
			return action;
		}
	};
	
	public static enum RESET_PASSWORD {
		USERNAME("username"),
		OTP("otp"),
		TYPE("type");
		
		private String action;
		
		private RESET_PASSWORD(String action) {
			this.action = action;
		}
		
		public String getAction() {
			return action;
		}
	};
	
	public static enum COMMENT_POST {
		COMMENT_BODY("commentBody"),
		FOLLOWER_ID("follower.id"),
		FOLLOWER_NAME("follower.name"),
		MEMBER_OF_WEBADDRESS("memberOf.webaddress"),
		MEMBER_OF_ICON("memberOf.icon"),
		MEMBER_OF_NAME("memberOf.name"),
		SITENAME("siteName"),
		SERVER_URL("serverUrl"),
		WHO_POSTED_ID("whoPosted.id"),
		WHO_POSTED_ICON("whoPosted.icon"),
		WHO_POSTED_NAME("whoPosted.name"),
		WHAT_POSTED_ID("whatPosted.id"),
		WHAT_POSTED_ICON("whatPosted.icon"),
		WHAT_POSTED_NAME("whatPosted.name"),
		WHAT_POSTED_LOCATION("whatPosted.location"),
		WHAT_POSTED_OBSERVED_ON("whatPosted.observedOn"),
		WHAT_POSTED_USERGROUPS("whatPosted.userGroups"),
		TYPE("type");
		
		private String action;
		
		private COMMENT_POST(String action) {
			this.action = action;
		}
		
		public String getAction() {
			return action;
		}
	};
	
	public static enum POST_TO_GROUP {
		FOLLOWER_ID("follower.id"),
		FOLLOWER_NAME("follower.name"),
		MEMBER_OF_WEBADDRESS("memberOf.webaddress"),
		MEMBER_OF_ICON("memberOf.icon"),
		MEMBER_OF_NAME("memberOf.name"),
		SITENAME("siteName"),
		SERVER_URL("serverUrl"),
		WHO_POSTED_ID("whoPosted.id"),
		WHO_POSTED_ICON("whoPosted.icon"),
		WHO_POSTED_NAME("whoPosted.name"),
		WHAT_POSTED_ID("whatPosted.id"),
		WHAT_POSTED_ICON("whatPosted.icon"),
		WHAT_POSTED_NAME("whatPosted.name"),
		WHAT_POSTED_LOCATION("whatPosted.location"),
		WHAT_POSTED_OBSERVED_ON("whatPosted.observedOn"),
		WHAT_POSTED_USERGROUPS("whatPosted.userGroups"),
		WHERE_WEB_ADDRESS("where.webAddress"),
		WHERE_USER_GROUPNAME("where.userGroupName"),
		SUBMIT_TYPE("submitType"),
		TYPE("type");
		
		private String action;
		
		private POST_TO_GROUP(String action) {
			this.action = action;
		}
		
		public String getAction() {
			return action;
		}		
	};
	
	public static enum SUGGEST_MAIL {
		FOLLOWER_ID("follower.id"),
		FOLLOWER_NAME("follower.name"),
		GIVEN_NAME_ID("givenName.id"),
		GIVEN_NAME_NAME("givenName.name"),
		GIVEN_NAME_IS_SCIENTIFIC_NAME("givenName.isScientificName"),
		MEMBER_OF_WEBADDRESS("memberOf.webaddress"),
		MEMBER_OF_ICON("memberOf.icon"),
		MEMBER_OF_NAME("memberOf.name"),
		RECO_VOTE("recoVote"),
		SITENAME("siteName"),
		SERVER_URL("serverUrl"),
		WHO_POSTED_ID("whoPosted.id"),
		WHO_POSTED_ICON("whoPosted.icon"),
		WHO_POSTED_NAME("whoPosted.name"),
		WHAT_POSTED_ID("whatPosted.id"),
		WHAT_POSTED_ICON("whatPosted.icon"),
		WHAT_POSTED_NAME("whatPosted.name"),
		WHAT_POSTED_LOCATION("whatPosted.location"),
		WHAT_POSTED_OBSERVED_ON("whatPosted.observedOn"),
		WHAT_POSTED_USERGROUPS("whatPosted.userGroups"),
		TYPE("type");
		
		private String action;
		
		private SUGGEST_MAIL(String action) {
			this.action = action;
		}
		
		public String getAction() {
			return action;
		}			
	};
	
	public static enum TAGGED_MAIL {
		COMMENT_BODY("commentBody"),
		FOLLOWER_ID("follower.id"),
		FOLLOWER_NAME("follower.name"),
		MEMBER_OF_WEBADDRESS("memberOf.webaddress"),
		MEMBER_OF_ICON("memberOf.icon"),
		MEMBER_OF_NAME("memberOf.name"),
		SITENAME("siteName"),
		SERVER_URL("serverUrl"),
		WHO_POSTED_ID("whoPosted.id"),
		WHO_POSTED_ICON("whoPosted.icon"),
		WHO_POSTED_NAME("whoPosted.name"),
		WHAT_POSTED_ID("whatPosted.id"),
		WHAT_POSTED_ICON("whatPosted.icon"),
		WHAT_POSTED_NAME("whatPosted.name"),
		WHAT_POSTED_LOCATION("whatPosted.location"),
		WHAT_POSTED_OBSERVED_ON("whatPosted.observedOn"),
		WHAT_POSTED_USERGROUPS("whatPosted.userGroups"),
		TYPE("type");	
		
		private String action;
		
		private TAGGED_MAIL(String action) {
			this.action = action;
		}
		
		public String getAction() {
			return action;
		}			
	};
	
	public static enum WELCOME_MAIL {
		FACEBOOK_URL("facebookUrl"),
		FEEDBACKFORM_URL("feedbackFormUrl"),
		MAIL_DEFAULT_FROM("mailDefaultFrom"),
		SITENAME("siteName"),
		SERVER_URL("serverUrl"),
		TWITTER_URL("twitterUrl"),
		USERNAME("username"),
		USER_PROFILE_URL("userProfileUrl"),
		WELCOME_EMAIL_INTRO("welcomeEmailIntro"),
		WELCOME_EMAIL_OBSERVATION("welcomeEmailObservation"),
		WELCOME_EMAIL_MAP("welcomeEmailMap"),
		WELCOME_EMAIL_CHECKLIST("welcomeEmailChecklist"),
		WELCOME_EMAIL_DOCUMENTS("welcomeEmailDocuments"),
		WELCOME_EMAIL_SPECIES("welcomeEmailSpecies"),
		WELCOME_EMAIL_GROUPS("welcomeEmailGroups"),
		TYPE("type");
		
		private String action;
		
		private WELCOME_MAIL(String action) {
			this.action = action;
		}
		
		public String getAction() {
			return action;
		}	
	};
	
	public static enum DOWNLOAD_MAIL {
		DOWNLOAD_MAIL_ID("downloadMail.id"),
		DOWNLOAD_MAIL_NAME("downloadMail.name"),
		SITENAME("siteName"),
		SERVER_URL("serverUrl"),
		TYPE("type");
		
		private String action;
		
		private DOWNLOAD_MAIL(String action) {
			this.action = action;
		};
		
		public String getAction() {
			return action;
		}
	};
	
	public static MAIL_TYPE getMailType(String type) {
		for (MAIL_TYPE types: MAIL_TYPE.values()) {
			if (types.name().equalsIgnoreCase(type)) {
				return types;
			}
		}
		return MAIL_TYPE.INVALID;
	}
	
	public static enum NOTIFICATION_FIELDS {
		TO("to"),
		NOTIFICATION("notification");
		
		private String action; 
		
		private NOTIFICATION_FIELDS(String action) {
			this.action = action;
		}
		
		public String getAction() {
			return action;
		}
	};
	
	public static enum NOTIFICATION_DATA {
		TITLE("notification.title"),
		BODY("notification.body");
		
		private String action;
		
		private NOTIFICATION_DATA(String action) {
			this.action = action;
		}
		
		public String getAction() {
			return action;
		}
	};

}
