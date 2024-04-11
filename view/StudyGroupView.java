package view;

import controller.StudyGroupController;
import model.Student;
import model.StudyGroup;

public class StudyGroupView {
    public static void main(String[] args) {
        StudyGroupController controller = new StudyGroupController();
        StudyGroup studyGroup = controller.createStudyGroup();

        System.out.println("Преподаватель: " + studyGroup.getTeacher().getName());
        System.out.println("Студенты:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println(student.getName());
        }
    }
}