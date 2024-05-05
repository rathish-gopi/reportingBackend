package com.patton.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patton.report.entity.Submission;

public interface SubmissionRepository extends JpaRepository<Submission, Integer>{

}
