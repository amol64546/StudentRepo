package com.Student.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody StudentDTO studentDTO) throws Exception{
        studentService.add(studentDTO);
        return "Student has been added";
    }

    @GetMapping("/get/{rollNo}")
    public Student get(@PathVariable int rollNo) throws Exception{
        Student student;
        try{
            student = studentService.get(rollNo);
        }catch (Exception e){
            throw new InvalidRollNoException("Invalid roll number");
        }
        return student;
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam int rollNo) throws Exception{
        try{
            studentService.delete(rollNo);
        }catch (Exception e){
            throw new InvalidRollNoException("Invalid roll number");
        }
        return "Student has been deleted";
    }

    @PutMapping("/updateAddress")
    public String updateAddress(@RequestBody AddressRequestDTO addressRequestDTO) throws Exception{
        try{
            studentService.updateAddress(addressRequestDTO);
        }catch (Exception e){
            throw new InvalidRollNoException("Invalid roll number");
        }
        return "Address has been updated";
    }


}
