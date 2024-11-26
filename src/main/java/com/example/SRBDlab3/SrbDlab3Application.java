package com.example.SRBDlab3;

import com.example.SRBDlab3.department.Department;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class SrbDlab3Application {
	public static void main(String[] args) {
		SpringApplication.run(SrbDlab3Application.class, args);
	}
}
