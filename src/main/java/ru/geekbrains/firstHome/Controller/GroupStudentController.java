package ru.geekbrains.firstHome.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.firstHome.Model.Student;
import ru.geekbrains.firstHome.Repository.StudentRepository;

import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupStudentController {
    private final StudentRepository repository;

    public GroupStudentController(StudentRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/{groupName}/student")
    public List<Student> getByGroupName(@PathVariable String groupName) {
        return repository.getGroupName(groupName);
    }
}
