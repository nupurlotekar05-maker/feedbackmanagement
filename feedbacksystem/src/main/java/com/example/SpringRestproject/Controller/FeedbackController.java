package com.example.SpringRestproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.SpringRestproject.Repository.Feedbackrepo;
import com.example.SpringRestproject.Service.FeedbackService;
import com.example.SpringRestproject.entity.feedback;

@Controller
@RequestMapping("/fd")
public class FeedbackController {
	@Autowired
	FeedbackService feedbackService;
//	@PostMapping("/feedback")
//	public String savedata(@ModelAttribute feedback feedback) {
//		  System.out.println("--->"+feedback);
//		  feedbackService.addemp(feedback);
//		  return "feedback";
//	}
	
	

	   


	@GetMapping("/feedback")
	public String feedbackPage(Model model) {

	    model.addAttribute("elist", feedbackService.getlist());

	    return "feedback";
	}
	 


	    @PostMapping("/save")
	    
	    public String saveFeedback(@RequestParam("feedback") String feedbackText) {

	        System.out.println("Feedback = " + feedbackText);

	        feedback fb = new feedback();
	        fb.setFeedback(feedbackText);

	        feedbackService.save(fb);

	        return "redirect:/fd/feedback";
	    }
	    @GetMapping("/delete/{id}")
	   
	    public String deleteemp(@PathVariable long id) {
	  	feedbackService.deleteemp(id);
	  	  return "redirect:/fd/feedback";
	  	  
	    }
//	    @GetMapping("/list")
//	    public String getdata(Model model) {
//	    	  model.addAttribute("elist",feedbackService.getlist());
//	    	  return "feedback";
//	    }

//	    }
	    

}






