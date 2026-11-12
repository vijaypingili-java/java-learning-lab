public class Day1CodingChecklist {
    public static void main(String[] args) {
//        profile();
//        swapTwoNumbers();
//        swapTwoNumbersWithNewVar();
//        largestOf3Nums();
//        isEvenOrOdd();
        isPrime(); //--Check the logic for this again
//        factorialOfNum();
//        reverseOfNum();
//        isPalindrome();
//        printMultiplicationTable();
//        sumOfDigits();
    }




    public static void profile() {
        String name = "Vijay";
        int age = 29;
        String profession = "Full Stack Developer";

        System.out.println("Candidate: " + name + ", Age: " +  age + ", Profession: " + profession);
    }

    public static void swapTwoNumbers() {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping a value is: " + a + " & b value is: " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a value is: " + a + " & b value is: " + b);
    }

    public static void swapTwoNumbersWithNewVar() {
        int a = 20;
        int b = 30;

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " & " + b);
    }

    public static void largestOf3Nums() {
        int a = 40;
        int b = 20;
        int c = 30;

        if(a>b && a>c) {
            System.out.println("a is greatest");
        }else if(b>c) {
            System.out.println("b is greatest");
        }else {
            System.out.println("c is greatest");
        }
    }

    public static void isEvenOrOdd() {
        int a = 25;
        if(a%2==0) {
            System.out.println("a is even");
        }else {
            System.out.println("a is odd");
        }
    }

    public static void isPrime() {
        int a = 15;
        if(a<=1) {
            System.out.println("Not Prime");
        }
        if(a==2) {
            System.out.println("Prime");
        }
        if(a%2==0) {
            System.out.println("Prime");
        }

        for(int i=3;i<a;i+=2) {
            if(a%i==0) {
                System.out.println("Number is not prime");
            }
        }
        System.out.println("Prime Number");
    }

    public static void factorialOfNum() {
        int num = 3;
        int factorial = 1;
        while(num>0) {
            factorial*=num;
            num--;
        }
        System.out.println(factorial);
    }

    public static void reverseOfNum() {
        int num = 12345;
        int reverseNum = 0;

        while(num>0) {
            int digit = num%10;
            reverseNum = reverseNum * 10 + digit;
            num = num/10;
        }
        System.out.println(reverseNum);
    }

    public static void isPalindrome() {
        int num = 12324;
        int reverseNum = 0;
        int originalNum = num;

        while(num>0) {
            int digit = num%10;
            reverseNum = reverseNum * 10 + digit;
            num=num/10;
        }
        if(reverseNum == originalNum) {
            System.out.println("Palindrome Number");
        }else {
            System.out.println("Not a Palindrome Number");
        }
    }

    public static void printMultiplicationTable() {
        int num = 5;
        for(int i=1;i<=10;i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }

    public static void sumOfDigits() {
        int num = 1234;
        int digitSum = 0;
        while(num>0) {
            int digit = num%10;
            digitSum+=digit;
            num=num/10;
        }
        System.out.println(digitSum);
    }
}
