package com.chandan.dao;

import com.chandan.entity.Student;
import org.omg.CORBA.UserException;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rc_chandan on 25/10/16.
 */

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Chandan", "IT"));
                put(2, new Student(2, "Sid", "CS"));
                put(3, new Student(3, "Nitish", "EEE"));
            }
        };
    }

    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    public Student getStudentById(int id) {
        return this.students.get(id);
    }

    public boolean deleteStudentById(int id) {
        try {
            if(this.students.get(id) != null) {
                this.students.remove(id);
                return true;
            } else
                throw new Exception("Student not found");

        } catch (Exception e) {
            System.out.print("Error while deleting student:" + e.getMessage());
            return false;
        }
    }
}
