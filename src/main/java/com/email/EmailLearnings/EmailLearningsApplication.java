package com.email.EmailLearnings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.email.EmailLearnings.Service.EmailService;

@SpringBootApplication
public class EmailLearningsApplication {

	@Autowired
	private EmailService emailService; // Inject EmailService

	public static void main(String[] args) {
		SpringApplication.run(EmailLearningsApplication.class, args);
	}

	@Autowired
	public void sendMail() {
		String to = "reciver";
		// String to = "yadavharsh0529@gmail.com";
		String subject = "subject";
		String body = "body";

		// Call the email service method to send the email
		emailService.sendMail(to, subject, body);
	}
}
