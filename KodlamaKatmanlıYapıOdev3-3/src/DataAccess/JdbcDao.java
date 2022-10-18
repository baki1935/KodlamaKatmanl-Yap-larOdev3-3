package DataAccess;

import Entities.Course;

public class JdbcDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("jdbc ile eklendi.");
	}

}
