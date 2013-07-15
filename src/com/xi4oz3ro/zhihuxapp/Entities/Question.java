package com.xi4oz3ro.zhihuxapp.Entities;

/**
 * Created by xi4oz3ro on 13-7-11.
 */
public class Question extends Entity {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long userId;
    private String userName;
    private String questionContent;
    private String category;
    private String categoryName;
    private String answerType;
    private String answerContent;
    private String answerExplanation;
    private String alternativeAnswer;
    private int viewCount;
    private int answerCount;
    private int goodReputation;
    private int badReputation;
    private int commentCount;
    private String tag;
    private String questionPoint;
    private int followCount;

    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getQuestionContent() {
        return questionContent;
    }
    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public String getAnswerType() {
        return answerType;
    }
    public void setAnswerType(String answerType) {
        this.answerType = answerType;
    }
    public String getAnswerContent() {
        return answerContent;
    }
    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }
    public String getAnswerExplanation() {
        return answerExplanation;
    }
    public void setAnswerExplanation(String answerExplanation) {
        this.answerExplanation = answerExplanation;
    }
    public String getAlternativeAnswer() {
        return alternativeAnswer;
    }
    public void setAlternativeAnswer(String alternativeAnswer) {
        this.alternativeAnswer = alternativeAnswer;
    }
    public int getViewCount() {
        return viewCount;
    }
    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
    public int getAnswerCount() {
        return answerCount;
    }
    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }
    public int getGoodReputation() {
        return goodReputation;
    }
    public void setGoodReputation(int goodReputation) {
        this.goodReputation = goodReputation;
    }
    public int getBadReputation() {
        return badReputation;
    }
    public void setBadReputation(int badReputation) {
        this.badReputation = badReputation;
    }
    public int getCommentCount() {
        return commentCount;
    }
    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }
    public String getQuestionPoint() {
        return questionPoint;
    }
    public void setQuestionPoint(String questionPoint) {
        this.questionPoint = questionPoint;
    }
    public int getFollowCount() {
        return followCount;
    }
    public void setFollowCount(int followCount) {
        this.followCount = followCount;
    }
}
