package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		//JobsController controller=new JobsController(); -- �s el mateix
				
		controller.createBossEmployee("Pepe Boss", "Direcci�n molona", "666666666", 100.0);
		controller.createEmployee("Pedro Employee", "Direcci�n molona 2", "665266666", 40.0);
		controller.createEmployee("Laura Employee", "Direcci�n molona 3", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Direcci�n molona 4", "614266666", "no cobra");
		controller.createManagerEmployee("Pepe Manager", "Direcci�n molona 5", "665226891", 80.0);	
		
		controller.payAllEmployeers();
		
		String allEmployees=controller.getAllEmployees();
		
		System.out.println("EMPLOYEES: \n" + allEmployees + " \n");
		
	}

}
