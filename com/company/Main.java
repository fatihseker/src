package com.company;

public class Main {

    public static void main(String[] args) {
        Course course1 = new Course(123, 5, "java", "Engin Demirok");

        Course course2 = new Course();
        course2.id=666;
        course2.week=8;
        course2.name="C#";
        course2.teacher="Engin Demirok";

        Course course3 = new Course(452, 7, "Python", "Engin Demirok");

        Course course4 = new Course(145, 2, "MySQL", "Engin Demirok");

        Course[] dizininIsmi = {course1, course2, course3, course4};

        for (Course burayaHerseyYazilabilir : dizininIsmi) {
            System.out.println("kurslarımız  :" + burayaHerseyYazilabilir.name);
        }
        System.out.println("Dizinin Sayısı  :" + dizininIsmi.length);

        AddFavorite add=new AddFavorite();
        add.addFavorite(course1);
        add.addFavorite(course2);
        add.addFavorite(course3);
        AddFavorite remove=new AddFavorite();
        remove.removeFavorite(course2);




    }
}
