package com.example.SpringRestproject.Service;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringRestproject.Repository.Feedbackrepo;
import com.example.SpringRestproject.entity.feedback;

@Service
public class FeedbackService {
@Autowired
Feedbackrepo feedbackrepo;



public void save(feedback feedback) {
	   feedbackrepo.save(feedback);	
	
}

public List<feedback> getlist(){
	return (List<feedback>) feedbackrepo.findAll();
	
}

public void deleteemp(long id) {
	// TODO Auto-generated method stub
	
		feedbackrepo.deleteById(id);
	}
}









