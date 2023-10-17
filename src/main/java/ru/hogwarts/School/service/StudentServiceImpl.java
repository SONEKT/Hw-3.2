package ru.hogwarts.School.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.School.model.Student;

import java.util.HashMap;

@Service
public class StudentServiceImpl implements StudentService {

    private final HashMap<Long, Student> studentMap = new HashMap<>();

    private long counter = 1;

    @Override

    public Student create(Student student) {
        student.setId(counter++);
        studentMap.put(student.getId(), student);
        return student;
    }

    @Override
    public Student read(long id) {

        return null;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public Student delete(long id) {
        return null;
    }
}
