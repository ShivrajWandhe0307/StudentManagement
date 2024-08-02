package com.example.StudentManagementSystem.Controller;

import com.example.StudentManagementSystem.Entity.Student;
import com.example.StudentManagementSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@org.springframework.stereotype.Controller
public class Controller
{
    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public String getAllStudents(Model model)
    {
        model.addAttribute("student",studentService.getAllStudents());
        return "Student";
    }
    @GetMapping("student/new")
    public String insertData(Model model)
    {
        Student student=new Student();
        model.addAttribute("student",student);
        return "NewStudent";
    }
    @PostMapping("/students")
    public String saveStudentData(@ModelAttribute("student")Student student)
    {
        studentService.saveStudent(student);
        return "redirect:/student";

    }
    @GetMapping("/student/edit/{id}")

    public String editStudentForm(@PathVariable int id, Model model)
    {
        model.addAttribute("student", studentService.getById(id));
        return "edit_student";
    }

    @PostMapping("/students/edit/{id}")
    public String updateStudent(@PathVariable int id, @ModelAttribute("student") Student student)
    {
        Student eexitStudent=studentService.getById(id);
        eexitStudent.setFirstName(student.getFirstName());
        eexitStudent.setLastName(student.getLastName());
        eexitStudent.setEmail(student.getEmail());
        eexitStudent.setBranch(student.getBranch());
        studentService.saveStudent(eexitStudent);

        return "redirect:/student";
    }

    @GetMapping("/student/{id}")
    public String deleteById(@PathVariable int id)
    {
        studentService.deleteById(id);
        return "redirect:/student";
    }




}
