package businness;

import Core.logging.BaseLogger;
import DataAccess.CourseDao;
import Entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private BaseLogger[] loggers;

	public CourseManager(CourseDao courseDao, BaseLogger[] loggers) {

		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getPrice() < 0) {
			throw new Exception("Üste para veremeyiz.");
		}

		courseDao.add(course);
		for (BaseLogger logger : loggers) {
			logger.logger(course.getName());

		}

	}

}
