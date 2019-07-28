package com.hsmv.springjokes.model;


public class Joke {

	private String joke;

	public String getJoke() {
		return joke;
	}

	public void setJoke(String joke) {
		this.joke = joke;
	}

	@Override
	public String toString() {
		return "Joke [joke=" + joke + "]";
	}
	
	
}
