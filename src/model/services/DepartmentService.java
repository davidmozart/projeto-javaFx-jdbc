package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	public List<Department> finAll() {
		
		return dao.findAll();
	}
}
