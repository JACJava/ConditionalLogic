package com.pluralsight.conditionallogic;

public class Main {

    public static void main(String[] args) {


/*
	// conditional assignment
	int v1 = 7;
	int v2 = 5;

	int vMax = v1 > v2 ? v1 : v2;

	System.out.println(vMax);

	float students = 30;
	float rooms = 4;
	float studentsPerRoom = rooms == 0.0f ? 0.0f : students/rooms;

	System.out.println(studentsPerRoom);

    //if-else statement

    int v1 = 2;
    int v2 = 4;

    if(v1 > v2)
        System.out.println("v1 is bigger");
    else
        System.out.println("v1 is not bigger");



    int v1 = 40;
    int v2 = 40;

    if(v1 > v2)
        System.out.println("v1 is bigger");
    else if (v1 < v2)
        System.out.println("v1 is not bigger");
    else
        System.out.println("v1 and v2 are equal");



    int v1 = 4, v2 = 4, diff;

    if(v1 > v2) {
        diff = v1 - v2; // only single statement tied to condition unless block {} is used
        System.out.println("v1 is bigger");
        System.out.println(diff);
    }
    else if (v2 > v1) {
        diff = v2 - v1;
        System.out.println("v2 is bigger");
        System.out.println(diff);
    }
    else
        System.out.println("v1 and v2 are equal");


    float students = 0.0f;
    float rooms = 4.0f;

    if (students > 0.0f) {
        if (rooms > 0.0f)
            System.out.println(students / rooms);
    }
    else
        System.out.println("No students");

    System.out.println();
    System.out.println("*** end of program ***");

float students = 30.0f;
float rooms = 4.0f;

if (rooms > 0.0) {
    System.out.println(students);
    System.out.println(rooms);
    float avg = students / rooms;  //var created in block
}

System.out.println(avg);

float students = 30.0f;
float rooms = 4.0f;

if (rooms > 0.0) {
    System.out.println(students);
    System.out.println(rooms);
    float avg = students / rooms;  //var created in block
    System.out.println(avg);
}


int a = 20, b = 14, c = 5;

if (a > b & b > c)
    System.out.println("a is greater than c");

boolean done = false;

if (!done)
    System.out.println("Keep going");


//logical and conditional logical
int students = 150;
int rooms = 0;

if (rooms > 0 & students/rooms > 30) //compilation error, because each side evaluated individually before compare
    System.out.println("Crowded!!");

System.out.println();
System.out.println("*** End of Program ***");

*/

int students = 150;
int rooms = 1;

if (rooms > 0 && students/rooms > 30) //only evaluate the right hand side if left hand side is true!
    System.out.println("Crowded!!");

System.out.println();
System.out.println("*** End of Program ***");

        System.out.println("*** End of Program ***");







    }
}
