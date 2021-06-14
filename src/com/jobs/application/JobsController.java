package com.jobs.application;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		
		Employee boss = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		
		Employee empleat = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(empleat);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		
		Employee manager = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);
		
	}


	public void payAllEmployeers() {
		
		List<AbsStaffMember> lista = repository.getAllMembers();
		
		for(AbsStaffMember e: lista) {
			e.pay();
		}
	
	}

	public String getAllEmployees() {
		
		String res = "";
		List<AbsStaffMember> lista = repository.getAllMembers();
		
		for(AbsStaffMember e: lista) {
			res = res + e;
		}
		
		return res;
	}

	public void createVolunteer(String string, String string2, String string3, String string4) throws Exception {
		
		Volunteer voluntari = new Volunteer (string, string2, string3, string4);
		repository.addMember(voluntari);
		
	}
	
	
	
}
