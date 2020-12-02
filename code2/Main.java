public class Main {
    public static void main(String[] args){

        // \" \' \\ \n
        System.out.println("私の好きな記号は二重引用符（\"）です");

        // ++
        int a = 100;
        a++;
        System.out.println(a);

        // 型変換
        String mag = "私の年齢は" + 23;
        System.out.println(mag);

        // Math.max()
        int x = 5;
        int y = 3;
        int max = Math.max(x, y);
        System.out.println("比較実験:" + x + "と" + y + "とで大きい方は・・・" + max);

        // Integer.parseInt()
        String age = "31";
        int n = Integer.parseInt(age);
        System.out.println("来年の年齢：" + (n + 1));

        // 乱数 new java.util.Random().nextInt()
        int r = new java.util.Random().nextInt(100);
        System.out.println(r);

        // new java.util.Scanner(System.in).nextLine() .nextInt()
        System.out.println("あなたの名前を入力してください");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください");
        int age2 = new java.util.Scanner(System.in).nextInt();
        System.out.println("ようこそ，" + age2 + "歳の" + name + "さん");

    }
}
