package com.patton.report.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.patton.report.entity.Submission;
import com.patton.report.service.SubmissionService;


@RestController
public class SubmissionController {
	
	@Autowired
	SubmissionService submissionService;
	
	@PostMapping("/submit")
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<String> processSubmissions(@RequestBody List<Submission> jsonData) {
	       System.out.println("Received JSON Data: " + jsonData);

	        // Send a response back to the frontend
	        String responseMessage = "JSON data received and processed successfully!";
	        jsonData.stream().forEach(js -> System.out.println(js));
	        submissionService.processSubmissions(jsonData);
	        return new ResponseEntity<>(responseMessage, HttpStatus.OK);
		
	}
	
	@GetMapping("/contactUs")
	@CrossOrigin(origins = "http://localhost:3000")
	public String contactUsMethod() {
		
		return "public API";
	}
	
	@GetMapping("/getDetails")
	public String fetchSubmissions(){
		return "";
	}

}
