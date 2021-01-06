package com.company;
import java.util.Arrays;
import java.util.Comparator;

public class Student {
    public double [] grades  = new double[5];
    public String name;
    public String secondname;
    public Student(String name,String secondname,double[] grades)
    {
        this.name = name;
        this.secondname = secondname;
        for (int i=0;i<grades.length;i++)
        {
            this.grades[i] = grades[i];
        }

    }
    public String getFullname()
    {
        return name + ' ' + secondname;
    }
    public double getMean_grades()
    {
        return Arrays.stream(grades).sum()/grades.length;
    }
    public static class Bymeangrades implements Comparator<Student>
    {
         @Override
        public int compare(Student st1,Student st2)
         {
             return (int) (st1.getMean_grades() - st2.getMean_grades());
         }
    }

}
