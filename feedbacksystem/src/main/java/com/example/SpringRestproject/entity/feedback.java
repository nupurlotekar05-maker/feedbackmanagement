package com.example.SpringRestproject.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="feedback")
public class feedback {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
private String feedback;
@CreationTimestamp                         
private LocalDateTime date;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFeedback() {
	return feedback;
}
public void setFeedback(String feedback) {
	this.feedback = feedback;
}
public LocalDateTime getDate() {
	return date;
}
public void setDate(LocalDateTime date) {
	this.date = date;
}

}
