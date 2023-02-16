package com.project.CsvProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.CsvProject.model.ComponyDetail;

@Repository
public interface ComponyRepository extends JpaRepository<ComponyDetail, String>{

}
