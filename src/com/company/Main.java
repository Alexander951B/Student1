package com.company;

public class Main {

    public static void main(String[] args) {

        Student a = new Student("Вася","Пупкин",new double[]{3,4,5,3,4});
        Student b = new Student("Петя","Петров",new double[]{3,2,2,2,4});
        System.out.println(a.getFullname());
        System.out.println(b.getFullname());
        var rez = new Student.Bymeangrades();
        System.out.println(rez.compare(b,a));
    }
}
