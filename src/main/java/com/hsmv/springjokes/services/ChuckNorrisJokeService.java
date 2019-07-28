package com.hsmv.springjokes.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJokeService implements JokeService{
	
	private final ChuckNorrisQuotes quote;
		
		
	public ChuckNorrisJokeService() {
		this.quote = new ChuckNorrisQuotes();
	}

	@Override
	public String getQuote() {
		return quote.getRandomQuote();
	}
	
}
