package com.home.springbootjob.admin;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping("/job")
	public List<JobInfo> adminPage() {
		JobInfo job1 = new JobInfo("1", "action1");
		JobInfo job2 = new JobInfo("2", "action1");
		JobInfo job3 = new JobInfo("3", "action2");
		JobInfo job4 = new JobInfo("4", "action3");
		return Arrays.asList(job1, job2, job3, job4);
	}
}
