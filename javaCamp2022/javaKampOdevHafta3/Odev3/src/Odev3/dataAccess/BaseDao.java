package Odev3.dataAccess;

import Odev3.entities.Category;
import Odev3.entities.Course;
import Odev3.entities.Instructor;

public interface BaseDao {
    void add(Course course, Category category, Instructor instructor);
}
