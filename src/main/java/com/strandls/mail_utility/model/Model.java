package com.strandls.mail_utility.model;

import com.strandls.mail_utility.model.EnumModel.COMMENT_POST;
import com.strandls.mail_utility.model.EnumModel.DOWNLOAD_MAIL;
import com.strandls.mail_utility.model.EnumModel.MAIL_TYPE;
import com.strandls.mail_utility.model.EnumModel.POST_TO_GROUP;
import com.strandls.mail_utility.model.EnumModel.RESET_PASSWORD;
import com.strandls.mail_utility.model.EnumModel.SUGGEST_MAIL;
import com.strandls.mail_utility.model.EnumModel.TAGGED_MAIL;
import com.strandls.mail_utility.model.EnumModel.USER_REGISTRATION;
import com.strandls.mail_utility.model.EnumModel.WELCOME_MAIL;

public class Model {
	
	private MAIL_TYPE type;
	private USER_REGISTRATION userReg;
	private RESET_PASSWORD resetPassword;
	private WELCOME_MAIL welcomeMail;
	private DOWNLOAD_MAIL downloadMail;
	private TAGGED_MAIL taggedMail;
	private COMMENT_POST commentPost;
	private POST_TO_GROUP postToGroup;
	private SUGGEST_MAIL suggestMail;
	
	public MAIL_TYPE getType() {
		return type;
	}
	public void setType(MAIL_TYPE type) {
		this.type = type;
	}
	public USER_REGISTRATION getUserReg() {
		return userReg;
	}
	public void setUserReg(USER_REGISTRATION userReg) {
		this.userReg = userReg;
	}
	public RESET_PASSWORD getResetPassword() {
		return resetPassword;
	}
	public void setResetPassword(RESET_PASSWORD resetPassword) {
		this.resetPassword = resetPassword;
	}
	public WELCOME_MAIL getWelcomeMail() {
		return welcomeMail;
	}
	public void setWelcomeMail(WELCOME_MAIL welcomeMail) {
		this.welcomeMail = welcomeMail;
	}
	public DOWNLOAD_MAIL getDownloadMail() {
		return downloadMail;
	}
	public void setDownloadMail(DOWNLOAD_MAIL downloadMail) {
		this.downloadMail = downloadMail;
	}
	public TAGGED_MAIL getTaggedMail() {
		return taggedMail;
	}
	public void setTaggedMail(TAGGED_MAIL taggedMail) {
		this.taggedMail = taggedMail;
	}
	public COMMENT_POST getCommentPost() {
		return commentPost;
	}
	public void setCommentPost(COMMENT_POST commentPost) {
		this.commentPost = commentPost;
	}
	public POST_TO_GROUP getPostToGroup() {
		return postToGroup;
	}
	public void setPostToGroup(POST_TO_GROUP postToGroup) {
		this.postToGroup = postToGroup;
	}
	public SUGGEST_MAIL getSuggestMail() {
		return suggestMail;
	}
	public void setSuggestMail(SUGGEST_MAIL suggestMail) {
		this.suggestMail = suggestMail;
	}

}
