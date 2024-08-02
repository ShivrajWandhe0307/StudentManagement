package com.example.StudentManagementSystem.Service;

import com.example.StudentManagementSystem.Entity.Student;
import com.example.StudentManagementSystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements  StudentService
{
    @Autowired
    private StudentRepository stdudentRepository;
    @Override
    public List<Student> getAllStudents() {
        List<Student> list=stdudentRepository.findAll();
        return  list;
    }

    @Override
    public Student saveStudent(Student student) {
        return stdudentRepository.save(student);
    }

    @Override
    public Student getById(int id) {
        return  stdudentRepository.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        stdudentRepository.deleteById(id);
    }


}
