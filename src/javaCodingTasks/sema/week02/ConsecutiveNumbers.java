package javaCodingTasks.sema.week02;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        int N = 30;
        printNumbers(N);
    }

        public static void printNumbers(int N) {
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                    System.out.println("CodilityTestCoders");
                } else if (i % 2 == 0 && i % 3 == 0) {
                    System.out.println("CodilityTest");
                } else if (i % 2 == 0 && i % 5 == 0) {
                    System.out.println("CodilityCoders");
                } else if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("TestCoders");
                } else if (i % 2 == 0) {
                    System.out.println("Codility");
                } else if (i % 3 == 0) {
                    System.out.println("Test");
                } else if (i % 5 == 0) {
                    System.out.println("Coders");
                } else {
                    System.out.println(i);
                }
            }
        }


    }



/*
Write a function that, given a positive integer N,
 prints the consecutive numbers from 1 to N, each on a separate line.
 However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders
 respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
 For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
 */