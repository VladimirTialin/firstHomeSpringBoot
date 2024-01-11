package ru.geekbrains.firstHome;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentRepository repository;



    @RequestMapping(path="/all")
        public List<Student> getAll() {
            return repository.getAll();
        }

    @RequestMapping(path="/group")
    public Student getStudent1(@PathVariable long id) {
        return repository.getId(id);
    }
//    @GetMapping(value = "/{groupName}")
//        public Student getStudent(@PathVariable String groupName) {
//            return repository.getGroupName(groupName);
//        }
    @GetMapping(value = "/{id}")
    public Student getStudent(@PathVariable long id) {
        return repository.getId(id);
    }
        @GetMapping
        public Student getStudentByName(@RequestParam String name) {
            return repository.getName(name);
        }
        @DeleteMapping(value = "/{id}")
        public boolean removeStudentById(@PathVariable long id) {
        return repository.remove(id);
    }
//    @PostMapping(value = "/{groupName}")
//    public boolean addStudent(@RequestParam String name) {
//        return repository.addStudent(name, group);
//    }
//
//        @PatchMapping("/{id}")
//        public User updateUser(@PathVariable long id, @RequestBody User user) {
//            User existsUser = repository.getById(id);
//            if (existsUser == null) { // 404
//                throw new IllegalArgumentException();
//            }
//
//            existsUser.setName(user.getName());
//            return existsUser;
//        }

}

