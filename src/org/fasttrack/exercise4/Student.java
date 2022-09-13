package org.fasttrack.exercise4;

public class Student {
    private String name;
    private int grade;
    static int numberOfStudents;
    static int sumOfGrades;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        Student.numberOfStudents++;
        Student.sumOfGrades += grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public static int averageGrade() {
        return Student.sumOfGrades / Student.numberOfStudents;

    }
}
