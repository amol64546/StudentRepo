package com.Student.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void add(StudentDTO studentDTO) {
       Student student = new Student();
       student.setName(studentDTO.getName());
       student.setAddress(studentDTO.getAddress());
       student.setDob(studentDTO.getDob());
       student.setMajor(studentDTO.getMajor());

       studentRepository.save(student);
    }

    public void delete(int rollNo) {
        studentRepository.deleteById(rollNo);
    }

    public void updateAddress(AddressRequestDTO addressRequestDTO) {
        Student student = studentRepository.findById(addressRequestDTO.getRollNo()).get();
        student.setAddress(addressRequestDTO.getAddress());

        studentRepository.save(student);
    }

    public Student get(int rollNo) {
        return studentRepository.findById(rollNo).get();
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
