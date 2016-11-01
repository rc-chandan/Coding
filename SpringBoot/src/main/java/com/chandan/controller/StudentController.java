package com.chandan.controller;

import com.chandan.entity.Student;
import com.chandan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by rc_chandan on 25/10/16.
 */

@RestController
@RequestMapping(value = "/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents() {
        return this.studentService.getAllStudents();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id) {
        return this.studentService.getStudentById(id);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public String deleteStudentById(@PathVariable("id") int id) {
        if(this.studentService.deleteStudentById(id))
            return "Student with id: " + id + " deleted Succesfully";
        return "Error while deleting the student with id: " + id + " see console for details";
    }
}
