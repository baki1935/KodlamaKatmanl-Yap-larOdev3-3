import Core.logging.BaseLogger;
import Core.logging.DatabaseLogger;
import Core.logging.FileLogger;
import Core.logging.MailLogger;
import DataAccess.CourseDao;
import DataAccess.HibernateDao;
import DataAccess.JdbcDao;
import Entities.Course;
import businness.CourseManager;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course();
		course1.setCategory("Software Language");
		course1.setName("Java");
		course1.setPrice(10);
		CourseDao courseDao = new HibernateDao();
		BaseLogger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		CourseManager coursemanager = new CourseManager(courseDao, loggers);
		coursemanager.add(course1);

	}

}
