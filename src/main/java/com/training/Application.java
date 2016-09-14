package com.training;

import org.services.daos.ProjectDao;
import org.services.entities.Project;
import org.services.ifaces.MyDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

	public static void main(String[] agrs) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml")) {

			Project project = context.getBean("Project",Project.class);

			System.out.println("Project Id := " + project.getProjectId());
			System.out.println("Project Name := " + project.getProjectName());
			System.out.println("Project Budget := " + project.getProjectBudget());
			System.out.println("Project Amount Collected := " + project.getAmountCollected());
			System.out.println("Project Donors := " + project.getDonorList());

			
			
			MyDao<Project> dao = (ProjectDao) context.getBean(ProjectDao.class);
			
			Long key = (Long) dao.add(project);
			
			System.out.println("One Cart Added := " + key);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
