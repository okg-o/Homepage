package com.example.service;


import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class MailService {

	private final MailSender mailSender;

	public String send(String name, String email, String message) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo("as18270505@gmail.com");
		msg.setSubject(name+"homepageより");
		msg.setText("From:"+email+"\r\nメッセージ\r\n"+message);

		mailSender.send(msg);
		return "mail";
	}
}
