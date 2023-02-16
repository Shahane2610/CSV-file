package com.project.CsvProject.controller;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.project.CsvProject.model.ComponyDetail;
import com.project.CsvProject.repository.ComponyRepository;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

@RestController
public class ComponyController {
	
	@Autowired
	ComponyRepository componyRepository;
	
	@PostMapping("/upload")
	public String uploadData(@RequestParam("file") MultipartFile file) throws Exception{
		List<ComponyDetail> componyList = new ArrayList<>();
		InputStream inputStream = file.getInputStream();
		CsvParserSettings setting = new CsvParserSettings();
		setting.setHeaderExtractionEnabled(true);
		CsvParser parser = new CsvParser(setting);
		List<com.univocity.parsers.common.record.Record> parseAllRecords = parser.parseAllRecords(inputStream);
		parseAllRecords.forEach(record -> {
			ComponyDetail compony = new ComponyDetail();
			compony.setSerialNumber(record.getString("Serial Number"));
			compony.setComponyName(record.getString("Company Name"));
			compony.setEmployeeMarkme(record.getString("Employee Markme"));
			compony.setDescription(record.getString("Description"));
			compony.setLeave(record.getString("leave"));
			componyList.add(compony);
		});
		
		componyRepository.saveAll(componyList);	
		
		return "CSV file Upload Successfully";
	}
	
}
