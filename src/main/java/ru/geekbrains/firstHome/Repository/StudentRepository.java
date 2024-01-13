package ru.geekbrains.firstHome.Repository;

import org.springframework.stereotype.Component;
import ru.geekbrains.firstHome.Model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class StudentRepository {
    private final List<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
        students.add(new Student("Ivan", "Frontend"));
        students.add(new Student("Petr", "Backend"));
        students.add(new Student("Vladimir", "Fullstack"));
        students.add(new Student("Sergey", "Frontend"));
        students.add(new Student("Nastya", "Backend"));
        students.add(new Student("Svetlana", "Fullstack"));
        students.add(new Student("Aleksandr", "Frontend"));
        students.add(new Student("Dasha", "Backend"));
        students.add(new Student("Stepan", "Frontend"));
        students.add(new Student("Andrey", "Backend"));
    }

    public List<Student> getAll() {
        return List.copyOf(students);
    }

    public Student getName(String name) {
        return students.stream()
                .filter(it -> Objects.equals(it.getName(), name))
                .findFirst()
                .orElse(null);
    }

    public Student getId(long id) {
        return students.stream()
                .filter(it -> Objects.equals(it.getId(), id))
                .findFirst()
                .orElse(null);
    }

    public List<Student> getGroupName(String groupName) {
        return students.stream()
                .filter(it -> Objects.equals(it.getGroupName(), groupName)).toList();
    }
    public boolean addStudent(Student student) {
       return students.add(student);
    }
    public boolean remove(long id) {
        return students.removeIf(it ->it.getId()==id);
    }
}
