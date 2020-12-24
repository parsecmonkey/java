import java.util.Date;
import java.time.*;

public class Main {
    public static void main(String[] agrs) {
        String s1 = "Java and JavaScript";
        String s2 = "Java";
        String s3 = "java";
        String n = "mike";
        boolean playerName = isValidPlayerName(n);

        // 文字列を調査する
        if (s2.equals(s3)) {
            System.out.println("s2とs3は等しい");
        }
        if (s2.equalsIgnoreCase(s3)) {
            System.out.println("s2とs3はケースを区別しなければ等しい");
        }
        System.out.println("s1の長さは" + s1.length() + "です");
        if (s1.isEmpty()) {
            System.out.println("s1はから文字です");
        }

        // 文字列を検索する
        if (s1.contains("Java")) {
            System.out.println("文字列s1は，Javaを含んでいます");
        }
        if (s1.endsWith("Java")) {
            System.out.println("文字列s1は，Javaが末尾にあります");
        }
        System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
        System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));

        // 文字列を切り出す
        System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
        System.out.println("文字列s1の4～8文字目は" + s1.substring(3, 8));

        System.out.println(playerName);

        // 現在日時を表示する
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        Date past = new Date(1600705425827L);
        System.out.println(past);

        LocalDateTime l1 = LocalDateTime.now();
        LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);
        ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
        LocalDateTime l3 = z1.toLocalDateTime();
        System.out.println(z1);
        System.out.println(l1);
    }
    // 文字列パターン
    public static boolean isValidPlayerName(String name) {
        return name.matches("[A-Z][A-Z0-9]{7}");
    }
}
