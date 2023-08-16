package com.ranks;

public class RankLogic {
    public static void main(String[] args) {
        Student s1=new Student(101,100,98,97,0);
        Student s2=new Student(102,78,98,99,0);
        Student s3=new Student(103,80,98,96,0);

        s1.totalCalc();
        s2.totalCalc();
        s3.totalCalc();

        if(s1.totalCalc()>s2.totalCalc()){
            if(s1.totalCalc()> s3.totalCalc()){
                System.out.println("student 1-1st rank");
            }
        } else if (s2.totalCalc()> s1.totalCalc()) {
            if(s2.totalCalc()> s3.totalCalc()){
                System.out.println("student 2-1st rank");
            }

        }
        else {
            System.out.println("Student 3-1st rank");
        }

    }
}
