import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
//        Declaring and initialising array
        int[] nums = {1,2,3,4,5};
//        declaring array
        int[] age;
        // initialising array
        age = new int[5];

//        Passing values in age array using index
        age[0] = 10;
        age[1] = 20;
        age[2] = 30;
        age[3] = 40;
        age[4] = 50;
//        age[5] = 60;
        System.out.println(Arrays.toString(age));

        System.out.println(Arrays.toString(nums));
//        looping through arrays using for loop
        for(int i=0;i< nums.length;i++) {
            System.out.println(nums[i]);
        }

//        looping through for each loop
        for(int a : age) {
            System.out.println(a);
        }

        int[] numbers = {1,2,3,4,5,6,7,8};
//        Finding sum and average using foreach loop
        int sum = 0;
        double average = 0;
        for(int a:numbers) {
            sum+=a;
        }
        System.out.println(sum);

        int lengthOfNumbersArray = numbers.length;
        average = (double) sum /lengthOfNumbersArray;
        System.out.println(average);
    }
}
