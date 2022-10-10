package com.strandls.mail_utility.model;

public class EnumModel {

	private EnumModel() {
	}

	private static final String USER_NAME = "username";
	private static final String FOLLOWER_ID_STR = "follower.id";
	private static final String FOLLOWER_NAME_STR = "follower.name";
	private static final String MEMBER_OF_WEBADDRESS_STR = "memberOf.webaddress";
	private static final String MEMBER_OF_ICON_STR = "memberOf.icon";
	private static final String MEMBER_OF_NAME_STR = "memberOf.name";
	private static final String SITE_NAME = "siteName";
	private static final String SERVER_URL_STR = "serverUrl";
	private static final String WHO_POSTED_ID_STR = "whoPosted.id";
	private static final String WHO_POSTED_ICON_STR = "whoPosted.icon";
	private static final String WHO_POSTED_NAME_STR = "whoPosted.name";
	private static final String WHAT_POSTED_ID_STR = "whatPosted.id";
	private static final String WHAT_POSTED_NAME_STR = "whatPosted.name";
	private static final String WHAT_POSTED_ICON_STR = "whatPosted.icon";
	private static final String WHAT_POSTED_TYPE_STR = "whatPosted.type";
	private static final String WHAT_POSTED_SPECIES_STR = "whatPosted.group";
	private static final String WHAT_POSTED_LOCATION_STR = "whatPosted.location";
	private static final String WHAT_POSTED_OBSERVED_ON_STR = "whatPosted.observedOn";
	private static final String WHAT_POSTED_USER_GROUPS_STR = "whatPosted.userGroups";

	public enum INFO_FIELDS {
		TYPE("type"),OBJECT_TYPE("objectType") ,RECIPIENTS("recipients");

		private String action;

		private INFO_FIELDS(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}
	}

	
	public enum OBJECT_TYPE{
		INVALID("INVALID"),OBSERVATION("observation"),CCA("cca"),DOCUMENT("document") ,SPECIES("species");
		private String action;

		private OBJECT_TYPE(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}
	}
	public enum FIELDS {
		TO("to"), TYPE("type"), SUBSCRIPTION("subscription"), DATA("data"), CONTENT("content"), SUBJECT("subject");

		private String action;

		private FIELDS(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}
	}

	public enum MAIL_TYPE {
		INVALID("INVALID"), USER_REGISTRATION("USER_REGISTRATION"), RESET_PASSWORD("RESET_PASSWORD"),
		WELCOME_MAIL("WELCOME_MAIL"), DOWNLOAD_MAIL("DOWNLOAD_MAIL"), TAGGED_MAIL("TAGGED_MAIL"),
		DOCUMENT_COMMENT_POST("DOCUMENT_COMMENT_POST"), COMMENT_POST("COMMENT_POST"), POST_TO_GROUP("POST_TO_GROUP"),
		DOCUMENT_POST_TO_GROUP("DOCUMENT_POST_TO_GROUP"), FACT_ADDED("FACT_ADDED"), FACT_UPDATED("FACT_UPDATED"),
		TAG_UPDATED("TAG_UPDATED"), CUSTOM_FIELD_UPDATED("CUSTOM_FIELD_UPDATED"),
		OBSERVATION_ADDED("OBSERVATION_ADDED"), OBSERVATION_UPDATED("OBSERVATION_UPDATED"),
		OBSERVATION_LOCKED("OBSERVATION_LOCKED"), OBSERVATION_UNLOCKED("OBSERVATION_UNLOCKED"),
		OBSERVATION_FLAGGED("OBSERVATION_FLAGGED"), OBSERVATION_DELETED("OBSERVATION_DELETED"),
		RATED_MEDIA_RESOURCE("RATED_MEDIA_RESOURCE"), AGREED_SPECIES("AGREED_SPECIES"),
		REMOVED_SPECIES("REMOVED_SPECIES"), FEATURED_POST("FEATURED_POST"), FEATURED_POST_IBP("FEATURED_POST_IBP"),
		SUGGEST_MAIL("SUGGEST_MAIL"), SEND_INVITE("SEND_INVITE"), SEND_REQUEST("SEND_REQUEST"),
		MY_UPLOADS_DELETE_MAIL("MY_UPLOADS_DELETE_MAIL"), PERMISSION_REQUEST("PERMISSION_REQUEST"),
		DOCUMENT_ADDED("DOCUMENT_ADDED"), DOCUMENT_DELETED("DOCUMENT_DELETED"), DOCUMENT_UPDATED("DOCUMENT_UPDATED"),
		DOCUMENT_FLAGGED("DOCUMENT_FLAGGED"), SPECIES_ADDED("SPECIES_ADDED"), SPECIES_DELETED("SPECIES_DELETED"),
		SPECIES_UPDATED("SPECIES_UPDATED"), SPECIES_COMMENT_POST("SPECIES_COMMENT_POST"), SPECIES_FACT("SPECIES_FACT"),
		SPECIES_FIELD_UPDATED("SPECIES_FIELD_UPDATED"), SPECIES_FIELD_DELETED("SPECIES_FIELD_DELETED"),
		SPECIES_FIELD_ADDED("SPECIES_FIELD_ADDED"), SPECIES_POST_TO_GROUP("SPECIES_POST_TO_GROUP"),
		SPECIES_COMMON_NAME("SPECIES_COMMON_NAME"), SPECIES_SYNONYMS("SPECIES_SYNONYMS"),
		SPECIES_RESOURCE("SPECIES_RESOURCE"), CCA_DATA_ADDED("CCA_DATA_ADDED"), CCA_DATA_UPDATED("CCA_DATA_UPDATED"),
		CCA_DATA_DELETED("CCA_DATA_DELETED"), CCA_TEMPLATE_ADDED("CCA_TEMPLATE_ADDED"),
		CCA_TEMPLATE_UPDATED("CCA_TEMPLATE_UPDATED"), CCA_TEMPLATE_DELETED("CCA_TEMPLATE_DELETED"),
		CCA_DATA_COMMENT("CCA_DATA_COMMENT"), CCA_TEMPLATE_COMMENT("CCA_TEMPLATE_COMMENT"),
		CCA_DATA_PERMISSION("CCA_DATA_PERMISSION"), CCA_DATA_FOLLOW("CCA_DATA_FOLLOW"),
		CCA_DATA_UNFOLLOW("CCA_DATA_UNFOLLOW"), PAGE_CREATE("PAGE_CREATE"), PAGE_UPDATE("PAGE_UPDATE"),
		PAGE_DELETED("PAGE_DELETED"), PAGE_COMMENT_POST("PAGE_COMMENT_POST"), PERMISSION_GRANTED("PERMISSION_GRANTED");

		private String action;

		private MAIL_TYPE(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}
	}

	public enum USER_REGISTRATION {
		USERNAME(USER_NAME), OTP("otp"), TYPE("type");

		private String action;

		private USER_REGISTRATION(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}
	}

	public enum RESET_PASSWORD {
		USERNAME(USER_NAME), OTP("otp"), TYPE("type");

		private String action;

		private RESET_PASSWORD(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}
	}

	public enum COMMENT_POST {
		COMMENT_BODY("commentBody"), FOLLOWER_ID(FOLLOWER_ID_STR), FOLLOWER_NAME(FOLLOWER_NAME_STR),
		MEMBER_OF_WEBADDRESS(MEMBER_OF_WEBADDRESS_STR), MEMBER_OF_ICON(MEMBER_OF_ICON_STR),
		MEMBER_OF_NAME(MEMBER_OF_NAME_STR), SITENAME(SITE_NAME), SERVER_URL(SERVER_URL_STR),
		WHO_POSTED_ID(WHO_POSTED_ID_STR), WHO_POSTED_ICON(WHO_POSTED_ICON_STR), WHO_POSTED_NAME(WHO_POSTED_NAME_STR),
		WHAT_POSTED_ID(WHAT_POSTED_ID_STR), WHAT_POSTED_ICON(WHAT_POSTED_ICON_STR),
		WHAT_POSTED_SPECIES(WHAT_POSTED_SPECIES_STR), WHAT_POSTED_TYPE(WHAT_POSTED_TYPE_STR),
		WHAT_POSTED_NAME(WHAT_POSTED_NAME_STR), WHAT_POSTED_LOCATION(WHAT_POSTED_LOCATION_STR),
		WHAT_POSTED_OBSERVED_ON(WHAT_POSTED_OBSERVED_ON_STR), WHAT_POSTED_USERGROUPS(WHAT_POSTED_USER_GROUPS_STR),
		TYPE("type");

		private String action;

		private COMMENT_POST(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}
	}

	public enum POST_TO_GROUP {
		FOLLOWER_ID(FOLLOWER_ID_STR), FOLLOWER_NAME(FOLLOWER_NAME_STR), MEMBER_OF_WEBADDRESS(MEMBER_OF_WEBADDRESS_STR),
		MEMBER_OF_ICON(MEMBER_OF_ICON_STR), MEMBER_OF_NAME(MEMBER_OF_NAME_STR), SITENAME(SITE_NAME),
		SERVER_URL(SERVER_URL_STR), WHO_POSTED_ID(WHO_POSTED_ID_STR), WHO_POSTED_ICON(WHO_POSTED_ICON_STR),
		WHO_POSTED_NAME(WHO_POSTED_NAME_STR), WHAT_POSTED_ID(WHAT_POSTED_ID_STR),
		WHAT_POSTED_ICON(WHAT_POSTED_ICON_STR), WHAT_POSTED_NAME(WHAT_POSTED_NAME_STR),
		WHAT_POSTED_LOCATION(WHAT_POSTED_LOCATION_STR), WHAT_POSTED_OBSERVED_ON(WHAT_POSTED_OBSERVED_ON_STR),
		WHAT_POSTED_USERGROUPS(WHAT_POSTED_USER_GROUPS_STR), WHERE_WEB_ADDRESS("where.webAddress"),
		WHERE_USER_GROUPNAME("where.userGroupName"), SUBMIT_TYPE("submitType"), TYPE("type");

		private String action;

		private POST_TO_GROUP(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}
	}

	public enum SUGGEST_MAIL {
		FOLLOWER_ID(FOLLOWER_ID_STR), FOLLOWER_NAME(FOLLOWER_NAME_STR), GIVEN_NAME_ID("givenName.id"),
		GIVEN_NAME_NAME("givenName.name"), GIVEN_NAME_IS_SCIENTIFIC_NAME("givenName.isScientificName"),
		MEMBER_OF_WEBADDRESS(MEMBER_OF_WEBADDRESS_STR), MEMBER_OF_ICON(MEMBER_OF_ICON_STR),
		MEMBER_OF_NAME(MEMBER_OF_NAME_STR), RECO_VOTE("recoVote"), SITENAME(SITE_NAME), SERVER_URL(SERVER_URL_STR),
		WHO_POSTED_ID(WHO_POSTED_ID_STR), WHO_POSTED_ICON(WHO_POSTED_ICON_STR), WHO_POSTED_NAME(WHO_POSTED_NAME_STR),
		WHAT_POSTED_ID(WHAT_POSTED_ID_STR), WHAT_POSTED_ICON(WHAT_POSTED_ICON_STR),
		WHAT_POSTED_NAME(WHAT_POSTED_NAME_STR), WHAT_POSTED_LOCATION(WHAT_POSTED_LOCATION_STR),
		WHAT_POSTED_OBSERVED_ON(WHAT_POSTED_OBSERVED_ON_STR), WHAT_POSTED_USERGROUPS(WHAT_POSTED_USER_GROUPS_STR),
		TYPE("type");

		private String action;

		private SUGGEST_MAIL(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}
	}

	public enum TAGGED_MAIL {
		COMMENT_BODY("commentBody"), FOLLOWER_ID(FOLLOWER_ID_STR), FOLLOWER_NAME(FOLLOWER_NAME_STR),
		MEMBER_OF_WEBADDRESS(MEMBER_OF_WEBADDRESS_STR), MEMBER_OF_ICON(MEMBER_OF_ICON_STR),
		MEMBER_OF_NAME(MEMBER_OF_NAME_STR), SITENAME(SITE_NAME), SERVER_URL(SERVER_URL_STR),
		WHO_POSTED_ID(WHO_POSTED_ID_STR), WHO_POSTED_ICON(WHO_POSTED_ICON_STR), WHO_POSTED_NAME(WHO_POSTED_NAME_STR),
		WHAT_POSTED_ID(WHAT_POSTED_ID_STR), WHAT_POSTED_ICON(WHAT_POSTED_ICON_STR),
		WHAT_POSTED_NAME(WHAT_POSTED_NAME_STR), WHAT_POSTED_LOCATION(WHAT_POSTED_LOCATION_STR),
		WHAT_POSTED_OBSERVED_ON(WHAT_POSTED_OBSERVED_ON_STR), WHAT_POSTED_USERGROUPS(WHAT_POSTED_USER_GROUPS_STR),
		TYPE("type");

		private String action;

		private TAGGED_MAIL(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}
	}

	public enum WELCOME_MAIL {
		FACEBOOK_URL("facebookUrl"), FEEDBACKFORM_URL("feedbackFormUrl"), MAIL_DEFAULT_FROM("mailDefaultFrom"),
		SITENAME(SITE_NAME), SERVER_URL(SERVER_URL_STR), TWITTER_URL("twitterUrl"), USERNAME(USER_NAME),
		USER_PROFILE_URL("userProfileUrl"), WELCOME_EMAIL_INTRO("welcomeEmailIntro"),
		WELCOME_EMAIL_OBSERVATION("welcomeEmailObservation"), WELCOME_EMAIL_MAP("welcomeEmailMap"),
		WELCOME_EMAIL_CHECKLIST("welcomeEmailChecklist"), WELCOME_EMAIL_DOCUMENTS("welcomeEmailDocuments"),
		WELCOME_EMAIL_SPECIES("welcomeEmailSpecies"), WELCOME_EMAIL_GROUPS("welcomeEmailGroups"), TYPE("type");

		private String action;

		private WELCOME_MAIL(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}
	}

	public enum DOWNLOAD_MAIL {
		USER_DATA("downloadMail"), SITENAME(SITE_NAME), SERVER_URL(SERVER_URL_STR), DOWNLOAD_TYPE("download_type"),
		DOWNLOAD_FILE("download_file"), TYPE("type");

		private String action;

		private DOWNLOAD_MAIL(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}
	}

	public static MAIL_TYPE getMailType(String type) {
		for (MAIL_TYPE types : MAIL_TYPE.values()) {
			if (types.name().equalsIgnoreCase(type)) {
				return types;
			}
		}
		return MAIL_TYPE.INVALID;
	}

	public enum NOTIFICATION_FIELDS {
		TO("to"), NOTIFICATION("notification");

		private String action;

		private NOTIFICATION_FIELDS(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}
	}

	public enum NOTIFICATION_DATA {
		TITLE("title"), BODY("body"), ICON("icon"), CLICK_ACTION("click_action");

		private String action;

		private NOTIFICATION_DATA(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}
	}

	public enum MY_UPLOADS_DELETE_MAIL {
		USERNAME(USER_NAME), FROM_DATE("fromDate"), TO_DATE("toDate");

		private String action;

		private MY_UPLOADS_DELETE_MAIL(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}
	}

	public enum INVITATION_DATA {
		INVITEE_NAME("name"), INVITER_OBJ("inviter"), GROUP_OBJ("group"), ROLE("role"), SERVER_URL(SERVER_URL_STR),
		ENCRYPTED_KEY("encrypted_key");

		private String action;

		private INVITATION_DATA(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}
	}

	public enum REQUEST_DATA {
		REQUESTEE_NAME("name"), REQUESTOR("requestor"), GROUP("group"), SERVER_URL(SERVER_URL_STR),
		ENCRYPTED_KEY("encrypted_key");

		private String action;

		private REQUEST_DATA(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}
	}

	public enum PERMISSION_REQUEST {

		TAXON_ID("taxonId"), TAXON_NAME("taxonName"), REQUESTEE_NAME("name"), REQUESTEE_ID("requesteeId"), ROLE("role"),
		ENCRYPTED_KEY("encrypted_key");

		private String action;

		private PERMISSION_REQUEST(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}
	}

	public enum PERMISSION_GRANT {

		TAXON_ID("taxonId"), TAXON_NAME("taxonName"), REQUESTEE_NAME("name"), ROLE("role");

		private String action;

		private PERMISSION_GRANT(String action) {
			this.action = action;
		}

		public String getAction() {
			return action;
		}
	}

}
