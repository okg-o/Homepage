package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.MessageForm;
import com.example.service.MailService;
import com.example.service.MessageService;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class Homecontroller {
	
	
	private final MessageService messageService;
	private final MailService mailService;
	
	@GetMapping("/")
	public String start() {
		return "home";
	}
	@GetMapping("/finish")
	public String Finish() {
		return "finish";
	}
	
	@GetMapping("/form")
	public String Form(MessageForm messageForm) {
		return "form";
	}
	
	@PostMapping("/form")
	public String create(MessageForm messageForm) {
        messageService.create(messageForm.getName(), messageForm.getEmail(),messageForm.getMessage());
        mailService.send(messageForm.getName(), messageForm.getEmail(),messageForm.getMessage());
        return "redirect:/finish";
    }
	
	

    
    

}
