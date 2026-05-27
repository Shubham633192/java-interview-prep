public class Array1 {

    public static void main(String[] args) {

        // 1 declaring array

        // int[] nums = { 1, 2, 3, 4, 5, 6 };
        // System.out.println(nums[0]);

        // 2 declaring array

        // int[] num = new int[4];

        // num[0] = 1;
        // num[1] = 2;
        // num[2] = 3;
        // num[3] = 4;

        // System.out.println(num[0]);

        // accessing by for loop
        // int nums[] = { 1, 4, 3, 6, 7 };
        // for (int i = 0; i < nums.length; i++) {
        // System.out.println(nums[i]);
        // }

        // Example

        int age[] = { 12, 14, 17, 18, 19, 10, 9, 8 };
        int lowest = age[0];

        for (int i = 0; i < age.length; i++) {
            if (lowest > age[i]) {
                lowest = age[i];
            }

        }

        System.out.println("lowest" + lowest);
    }

}
