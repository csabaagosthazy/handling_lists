package handling.lists.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import handling.lists.domain.Student;

@Controller
public class HomeController {
	
	private String title = "Students";
	private String welcomeMessage = "Welcome to Haaga-Helia!";
	
	@RequestMapping("/hello")
	public String student(Model model) {
		model.addAttribute("pageTitle", title);
		model.addAttribute("students", getStudent());
		model.addAttribute("welcome", welcomeMessage);
		
		
		return "hello";
	}
	
	private ArrayList<Student> getStudent(){
		ArrayList<Student> students = new ArrayList<Student>();
		
		Student student1 = new Student("John", "Snow");
		Student student2 = new Student("John", "Smith");
		Student student3 = new Student("Hanibal", "Smith");
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		return students;
	}

}
