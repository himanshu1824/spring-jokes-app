package com.hsmv.springjokes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hsmv.springjokes.services.JokeService;

@Controller
public class JokesController {

	private JokeService jokeService;

	@Autowired
	public JokesController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/", ""})
	String getQuote(Model model) {
		model.addAttribute("joke", this.jokeService.getQuote());
		return "joke";
	}
}
