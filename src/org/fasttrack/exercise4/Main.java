package org.fasttrack.exercise4;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ionescu", 10);
        System.out.println(String.format("Am adaugat studentul %s cu nota %d", student1.getName(), student1.getGrade()));
        System.out.println("Nr total de studenti este " + Student.numberOfStudents + " iar media este " + Student.averageGrade());

        Student student3 = new Student("Vasilescu", 8);
        System.out.println(String.format("Am adaugat studentul %s cu nota %d", student3.getName(), student3.getGrade()));
        System.out.println("Nr total de studenti este " + Student.numberOfStudents + " iar media este " + Student.averageGrade());

        Student student2 = new Student("Popescu", 6);
        System.out.println(String.format("Am adaugat studentul %s cu nota %d", student2.getName(), student2.getGrade()));
        System.out.println("Nr total de studenti este " + Student.numberOfStudents + " iar media este " + Student.averageGrade());
    }
}
