package Odev3.dataAccess;

import Odev3.entities.Category;
import Odev3.entities.Course;
import Odev3.entities.Instructor;

public class JdbcDao implements BaseDao {
    @Override
    public void add(Course course, Category category, Instructor instructor) {
        System.out.println("Kurs adı: " + course.getCourseName() + "  Eğitmen adı: " + instructor.getName() + " "
                + instructor.getSurname() + "  Kategori: " + category.getCategoryName() + "  Jdbc ile veritabanına eklendi.");
    }
}
