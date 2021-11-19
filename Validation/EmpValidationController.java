package controllerfiles;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springbootbeanfiles.EmpDetValidation;

@Controller
public class EmpValidationController {
	@RequestMapping("/empvalidation")
	public String display(Model m)
	{
		Map<String,String> c1=new HashMap();
		c1.put("", "---");
		c1.put("China", "China");
		c1.put("Algeria", "Algeria");
		c1.put("Malaysia", "Malaysia");
		c1.put("India", "India");

		m.addAttribute("country2",c1);
		m.addAttribute("empobj",new EmpDetValidation());
		return "EmpValid";
	}
	@RequestMapping("/empvalidcall")
	public String formsubmission
	(
			@Valid
			@ModelAttribute("empobj")
			EmpDetValidation vobj,			
			BindingResult br,
			Model m
	)
	{
		if(br.hasErrors())
		{
			Map<String,String> c1=new HashMap();
			c1.put("", "---");
			c1.put("China", "China");
			c1.put("Algeria", "Algeria");
			c1.put("Malaysia", "Malaysia");
			c1.put("India", "India");

			m.addAttribute("country2",c1);
			return "EmpValid";
		}
		else
		{
			return "EmpValidSuccess";
		}
	
}
}
