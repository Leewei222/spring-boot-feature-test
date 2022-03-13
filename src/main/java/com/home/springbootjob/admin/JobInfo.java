package com.home.springbootjob.admin;

public class JobInfo {

	public String jobId;
	public String jobStatus;

	public JobInfo(String jobId, String jobStatus) {
		this.jobId = jobId;
		this.jobStatus = jobStatus;
	}
	
	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}
}
