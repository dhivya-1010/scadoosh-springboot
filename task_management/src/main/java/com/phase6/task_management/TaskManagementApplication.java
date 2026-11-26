package com.phase6.task_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskManagementApplication {

	public static void main(String[] args) {
        SpringApplication.run(TaskManagementApplication.class, args);
	}
}

//H2 database - in memory database, no server - by adding dependency jakarta