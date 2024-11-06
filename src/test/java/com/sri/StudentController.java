package com.sri;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/api/students")
@Tag(name="Student Management System",description="acessing the student data")
public class StudentController {

    public static List<Student> students=new ArrayList<>();     

    @GetMapping        
    @Operation(summary="getting the list of all students")
    public List<Student> getStudents()
    {
            return students;
    }

    @GetMapping("/{id}")
    @Operation(summary="getting the student based on the id")
    public Student getStudentId(@PathVariable int id)
    {
        Student student = null;
        for(Student current_student :students)
        {
             if(current_student.getId()==id)
             {
                 student=new Student(current_student);
                 break;
             }
 
        }
         return student;
    }

    @PostMapping       
    @Operation(summary="adding a student data")
    public  List<Student> addStudents(@RequestBody  Student student)
    {
        students.add(student);
        return students;
    }

    @PutMapping("/{id}")
    @Operation(summary="updation the data of a student based on their id")
    public List<Student> updateStudent(@PathVariable int id,@RequestBody Student copyStudent)
    {
        Student student=null;
        for(Student current_student : students)
        {
            if(current_student.getId()==id)
            {
                student=new Student(current_student);
                break;
            }
        }
        student.setMarks(copyStudent.getMarks());
        student.setFeespaid(copyStudent.isFeespaid());
        return students;
    }

    @DeleteMapping("/{id}")
    @Operation(summary="deleting a student from the list based on their id")
    public List<Student> deleteStudent(@PathVariable int id)
    {
        for(Student current_Student:students)
        {
            if(current_Student.getId()==id)
            {
                students.remove(current_Student);
                break;
            }
        }
        return students;
    }
}
