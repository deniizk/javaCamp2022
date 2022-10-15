import Odev3.business.BaseManager;
import Odev3.business.Validator;
import Odev3.core.logging.FileLogger;
import Odev3.core.logging.Logger;
import Odev3.core.logging.MailLogger;
import Odev3.dataAccess.HibernateDao;
import Odev3.dataAccess.JdbcDao;
import Odev3.entities.Category;
import Odev3.entities.Course;
import Odev3.entities.Instructor;


public class Main {
    public static void main(String[] args) throws Exception {
        Course course = new Course(1, "Java Başlangıç Kursu", 1000);
        Category category = new Category(1, "Yazılım");
        Instructor instructor = new Instructor(1, "Engin", "Demiroğ");

        Logger[] loggers = {new FileLogger(), new MailLogger()};

        BaseManager baseManager = new BaseManager(new JdbcDao(), loggers);
        baseManager.add(course, category, instructor);

        Validator.courseList.add(course.getCourseName());
        Validator.courseList.add(category.getCategoryName());

        Course course2 = new Course(1, "Java Başlangıç Kursu", 1000);
        Category category2 = new Category(1, "Yazılım");
        Instructor instructor2 = new Instructor(1, "Engin", "Demiroğ");

        BaseManager baseManager2 = new BaseManager(new HibernateDao(), loggers);
        baseManager2.add(course2, category2, instructor2);

    }
}
