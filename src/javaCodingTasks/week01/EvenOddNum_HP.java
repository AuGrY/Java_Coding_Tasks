package javaCodingTasks.week01;

public class EvenOddNum_HP {


    public static void main(String[] args) {

        System.out.println(evenOrOdd(5));
        System.out.println(evenOrOdd(6));


        String a = evenOrOdd(5);
        System.out.println(a);


    }

    public static String evenOrOdd(int num) {
        return (num % 2 == 0) ? num + " is even number" : num + " is odd number ";
    }


    }


/*
Write a method which can identifies given number is even or odd

Ex:
identify(5) -> "Odd"
identify(6) -> "Even"
*/



