package com.techtalentsouthhealthCare.healthCare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//import com.techtalentsouthhealthCare.PatientRepository;
//import com.techtalentsouthhealthCare.healthCare.Patient;

@Controller
public class mainController {
    @Autowired
	private PatientRepository patientRepository;
	@GetMapping("/")
	public String index() {
		return "healthCare/index.html";
	}
	@GetMapping("/aboutUs")
	public String aboutus(){
		return "healthCare/about-us.html";
	}
	@GetMapping("/contact")
	public String contact(Patient patient) {
		return "healthCare/contact.html";
	}
	@GetMapping("/info")
	public String info(Patient patient) {
		return "Patient/info";
		
	}
	@GetMapping("/patientList")
	public String listPatient(Model model) {
		model.addAttribute("patients",patientRepository.findAll());
		return "Patient/resultList";
	}
	
	@PostMapping(value="/")
	public String addNewPatient(Patient patient,Model model) {
		patientRepository.save(patient);
		
		model.addAttribute("firstName", patient.getFirstName());
		model.addAttribute("lastName", patient.getLastName());
		model.addAttribute("phoneNo", patient.getPhoneNo());
		model.addAttribute("insuranceName", patient.getInsuranceName());
		model.addAttribute("dateOfBirth", patient.getDateOfBirth());
		model.addAttribute("email",patient.getEmail());
		model.addAttribute("address",patient.getAddress());
		
		return "Patient/result";
		
	}
	
	
	
}
