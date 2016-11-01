package com.chandan.service;

import com.chandan.dao.StudentDao;
import com.chandan.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by rc_chandan on 25/10/16.
 */

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return this.studentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        return this.studentDao.getStudentById(id);
    }


    public boolean deleteStudentById(int id) {
        return this.studentDao.deleteStudentById(id);
    }
}
