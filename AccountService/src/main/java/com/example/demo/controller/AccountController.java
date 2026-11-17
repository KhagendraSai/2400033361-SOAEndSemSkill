package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@GetMapping("/internal/accounts")
	public String getAccounts() {
		return "Accounts Request recieve at: /internal/accounts";
	}
}
