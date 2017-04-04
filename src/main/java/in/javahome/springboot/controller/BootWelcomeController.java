package in.javahome.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import in.javahome.springboot.entity.IStudentRepository;

@Controller
public class BootWelcomeController {
	@Autowired
	private IStudentRepository repository;
	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome(){
		System.out.println(repository.findByName("Hari"));
		return "Success";
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String deleteStudent(@RequestParam("stdId") Integer id){
		repository.delete(id);
		return "Success";
	}
}
