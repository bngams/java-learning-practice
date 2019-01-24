package com.capgemini.poecplm.programming.practice.quiz;

public class Question {
	
	private String enonce;
	private String reponse; // solution
	private Integer points;
	
	// constructeur
	public Question(String enonce, String reponse, Integer points) {
		this.enonce = enonce;
		this.reponse = reponse;
		this.points = points;
	}

	// accessseurs dits aussi getters/setters
	public String getEnonce() {
		return enonce;
	}

	public void setEnonce(String enonce) {
		this.enonce = enonce;
	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}	

}
