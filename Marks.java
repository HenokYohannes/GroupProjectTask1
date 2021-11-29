package com.company.class24Project2;

import com.company.class21.Student1.Student;

public class Marks<abstruct> {

    /**
     * We have to calculate the average of marks obtained in three subjects by student A and by student B.
     * Create class 'Marks'
     * with an abstract method 'getPercentage' that will be returning the average percentage of marks.
     * Provide implementation of abstract method in classes 'A' and 'B'.
     * The constructor of student A takes the marks in three subjects as its parameters
     * and the marks in four subjects as its parameters for student B.
     * Test your code
     */

    double subject1;
    double subject2;
    double subject3;
     Marks (double subject1,double subject2,double subject3){

    this.subject1=subject1;
    this.subject2=subject2;
    this.subject3=subject3;
    }

    public void getPercentage() {

    }
}
class StudentA extends Marks{
    StudentA (double subject1,double subject2,double subject3) {
        super(subject1, subject2, subject3);
    }
       @Override
      public void getPercentage () {
            System.out.println("The average percentage of Student A "+( subject1+subject2+subject3)/3);
        }
    }
class StudentB extends Marks{
        double subject4;
        StudentB(double subject1,double subject2,double subject3,double subject4){
            super (subject1,subject2,subject3);
            this.subject4=subject4;
        }
@Override
    public void getPercentage(){
    System.out.println("The average percentage of Student B "+(subject1+subject2+subject3+subject4)/3);
}
}
