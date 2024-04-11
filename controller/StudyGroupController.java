package controller;

import java.util.Arrays;

import model.Student;
import model.StudyGroup;
import model.Teacher;
import service.StudyGroupService;

public class StudyGroupController {
    private StudyGroupService service = new StudyGroupService();

    public StudyGroup createStudyGroup() {
        Teacher teacher = new Teacher("Профессор Иванов");
        Student student1 = new Student("Иван Петров");
        Student student2 = new Student("Мария Сидорова");

        return service.createStudyGroup(teacher, Arrays.asList(student1, student2));
    }
}