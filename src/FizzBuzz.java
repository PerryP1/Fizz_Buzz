import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Have to put the 15 before the 3/5 because if it qualifies for 3 first, then it won't look for something that also qualifies for both 3 & 5 because it thinks it's already done at 3.
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                System.out.println("FizzBuzz");
            } else System.out.println(i);
        }

    }
}

/*Write a program that prints the numbers from 1 to 100.
For multiples of 3 print “Fizz” instead of the number.
For the multiples of five print “Buzz”.
For numbers which are multiples of both 3 and 5 print “FizzBuzz”.
Expected Output:
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
Fizzbuzz
16
17
Fizz
19
Buzz
Fizz
22
23
Fizz
Buzz
26
Fizz
28
29
Fizzbuzz
.
.
.
 */