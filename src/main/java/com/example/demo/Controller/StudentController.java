package com.example.demo.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframesork.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entity.StudentEntity;
import com.example.demo.Service.StudentService;
@RestController
public class StudentController{
    @Autowired
    StudentService ser;
    
    public StudentEntity post(@RequestBody StudentEntity st){
        return ser.saveData(st);
    }
    @GetMapping("/getAll")
    public List<StudentEntity> getAll(){
        return service.getAllStudents();
    }
    @GetMapping("/get/{id}")
    public String
}