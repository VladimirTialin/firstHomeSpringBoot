package ru.geekbrains.firstHome.Controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.firstHome.Model.Student;
import ru.geekbrains.firstHome.Repository.StudentRepository;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentRepository repository;
    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }
    @GetMapping
        public List<Student> getAll() {
            return repository.getAll();
        }
    @GetMapping("/{id}")
    public Student getById(@PathVariable long id) {
        return repository.getId(id);
    }
    @GetMapping("/search")
        public Student getStudentByName(@RequestParam String name) {
            return repository.getName(name);
        }
    @DeleteMapping(value = "/{id}")
        public boolean removeStudentById(@PathVariable long id) {
            return repository.remove(id);
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean addStudent(@RequestBody Student student) {
        return repository.addStudent(student);
    }
}

