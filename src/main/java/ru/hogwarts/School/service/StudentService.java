package ru.hogwarts.School.service;

import ru.hogwarts.School.model.Student;

public interface StudentService {

    Student create(Student student);

    Student read(long id);

    Student update(Student student);

    Student delete(long id);
}
