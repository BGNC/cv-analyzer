package com.bgnc.cv_analyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobDescription extends JpaRepository<JobDescription, Long> {
}
