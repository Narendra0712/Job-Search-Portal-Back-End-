package com.JobPortal.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Application")
public class Application {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "applicationid")
	private int applicationid;
	
	@ManyToOne(fetch = FetchType.LAZY,targetEntity = Jobseeker.class,cascade = {CascadeType.MERGE,CascadeType.REFRESH,CascadeType.PERSIST})
	@JoinColumn(name = "jobseekerid",referencedColumnName = "jobseekerid")
	private Jobseeker jobseeker;
	
	@ManyToOne(fetch = FetchType.LAZY,targetEntity = Job.class,cascade = {CascadeType.MERGE,CascadeType.REFRESH,CascadeType.PERSIST})
	@JoinColumn(name = "jobid",referencedColumnName = "jobid")
	private Job job;
	
	public Application() {
		
	}
	
	public int getApplicationid() {
		return applicationid;
	}

	public void setApplicationid(int applicationid) {
		this.applicationid = applicationid;
	}

//	public Job getJob() {
//		return job;
//	}
//
	public void setJob(Job job) {
		this.job = job;
	}
//
//	public Jobseeker getJobseeker() {
//		return jobseeker;
//	}
//
	public void setJobseeker(Jobseeker jobseeker) {
		this.jobseeker = jobseeker;
	}
	
}
