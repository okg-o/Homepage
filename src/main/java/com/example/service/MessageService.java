package com.example.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.repository.MessageRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MessageService {
	

	private final MessageRepository messageRepository;


    @Transactional
    public void create(String name, String email, String message) {
    	messageRepository.insert(name, email, message);
    }

}
