package com.patton.report.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patton.report.entity.Submission;
import com.patton.report.repository.SubmissionRepository;


@Service
public class SubmissionService {
		
	@Autowired
	SubmissionRepository submissionRepository;
	
	public void processSubmissions(List<Submission> listSubmissions) {
		listSubmissions.stream().forEach(sub -> submissionRepository.save(sub));
	}

	public List<Submission> getDetails() {
		// TODO Auto-generated method stub
		List<Submission> fetchResults = submissionRepository.findAll();
		return fetchResults;
	}

}
