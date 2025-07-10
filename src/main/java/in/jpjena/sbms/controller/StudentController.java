package in.jpjena.sbms.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.jpjena.sbms.binding.Student;
import in.jpjena.sbms.entity.StudentEntity;
import in.jpjena.sbms.repository.StudentRepository;

@Controller
public class StudentController {

	@Autowired
	private StudentRepository studentRepo;

	@GetMapping("/")
	public String getForm(Model model) {
		loadFormData(model);
		return "index";
	}

	private void loadFormData(Model model) {
		List<String> coursesLists = new ArrayList<String>();
		coursesLists.add("JAVA");
		coursesLists.add("Angular");
		coursesLists.add("React");
		model.addAttribute("courses", coursesLists);
		List<String> timingsList = new ArrayList<String>();
		timingsList.add("morning");
		timingsList.add("Noon");
		timingsList.add("Evening");
		model.addAttribute("timings", timingsList);
		Student student = new Student();
		model.addAttribute("student", student);
	}

	@PostMapping("/save")
	public String saveUser(Student s, Model model) {

		StudentEntity entity = new StudentEntity();

		// Copying Binding Class DAta TO Entity Class DAta

		BeanUtils.copyProperties(s, entity);
		entity.setTimings(Arrays.toString(s.getTimings()));

		studentRepo.save(entity);

		model.addAttribute("msg", "Student Saved...");
		loadFormData(model);
		return "index";
	}
	
	@GetMapping("/display")
	public String displayStudent(Model model) {
		
		List<StudentEntity> listOfStudents = studentRepo.findAll();
		model.addAttribute("msg",listOfStudents);
		
		return "display";
	}

}
