public class Main {
    public static void main(String[] args) {

        // 配列
        int[] scores = new int[] {20, 30, 40, 50, 80};
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("合計点: " + sum);

        // 拡張for文
        for (int value : scores) {
            System.out.println(value);
        }

        // 2次元配列
        int[][] nums = {{40, 50, 60}, {80, 90, 100}};
        System.out.println(nums.length);
        System.out.println(nums[0].length);

    }
}
