import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("date.txt");
            fw.write("hello");
        } catch (IOException e) {
            System.out.println("エラーが発生しました");
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    ;
                }
            }
        }

        // try-with-resources
        try (FileWriter fw2 = new FileWriter("date.txt");){
            fw2.write("hello");
        } catch (IOException e) {
            System.out.println("エラーが発生しました");
        }

        Person p = new Person();
        p.setAge(-128);
    }
}
