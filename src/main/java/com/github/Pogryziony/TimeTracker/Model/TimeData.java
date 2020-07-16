package com.github.Pogryziony.TimeTracker.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TimeData {

	@Id
	@GeneratedValue
	private long id;
	
	private String firstName;
	private String lastName;
	private int hours;
	private int minutes;
	private int seconds;
	
	
	public TimeData() {
		}
	
	
	
}
