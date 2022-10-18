package DataAccess;

import Entities.Course;

public class HibernateDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile eklendi.");
		
	}

}
