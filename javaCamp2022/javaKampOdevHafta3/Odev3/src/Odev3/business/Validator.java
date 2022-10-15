package Odev3.business;

import Odev3.entities.Category;
import Odev3.entities.Course;

import java.util.ArrayList;

public class Validator {
    public static ArrayList<String> courseList = new ArrayList<>();

    public static boolean isValid(Course course, Category category) throws Exception {
        if (course.getPrice() < 0) {
            System.out.println("Kurs fiyatı 0'dan küçük olamaz.");
            return false;
        } else if (courseList.contains(category.getCategoryName()) || courseList.contains(course.getCourseName())) {
            System.out.println("Kategori ya da kurs ismi tekrar edemez.");
            return false;
        } else {
            return true;
        }

    }
}
