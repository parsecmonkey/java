// メソッド
public class Main {
    public static void main(String[] args) {
        hello("Bob");
        hello("Mike");

        int ans = add(100, 20);
        System.out.println("100 + 20 = " + ans);
        System.out.println("100 + 20 + 50= " + add(100, 20, 50));

        int[] array = {1, 2, 3};
        printArray(array);
    }

    // helloメソッド
    public static void hello(String name) {
        System.out.println(name + "こんにちわ");
    }

    // addメソッド：足し算
    public static int add(int x, int y) {
        int ans = x + y;
        return ans;
    }

    // addメソッド：overload
    public static int add(int x, int y, int z) {
        int ans = x + y + z;
        return ans;
    }

    // int型配列を受け取り，すべての要素を表示するメソッド
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }
}
