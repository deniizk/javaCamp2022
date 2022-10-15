package Odev3.business;

import Odev3.core.logging.Logger;
import Odev3.dataAccess.BaseDao;
import Odev3.entities.Category;
import Odev3.entities.Course;
import Odev3.entities.Instructor;

import java.util.ArrayList;


public class BaseManager {
    private BaseDao baseDao;
    private Logger[] loggers;

    public BaseManager(BaseDao baseDao, Logger[] loggers) {
        this.baseDao = baseDao;
        this.loggers = loggers;
    }

    public void add(Course course, Category category, Instructor instructor) throws Exception {
        if (Validator.isValid(course, category)) {
            baseDao.add(course, category, instructor);
            for (Logger logger : loggers) {
                logger.log(course.getCourseName());
            }
        } else {
            System.out.println("Hatalı giriş");
        }
    }

}
