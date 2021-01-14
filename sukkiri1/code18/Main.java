import java.io.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {
        // ファイルに書き込む
        FileWriter fw = new FileWriter("date.txt");
        fw.write('そ');
        fw.write('れ');
        fw.write('で');
        fw.write('は');
        fw.close();

        // ファイルを読み込む
        FileReader fr = new FileReader("date.txt");
        int input = fr.read();
        while (input != -1) {
            System.out.println((char)input);
            input = fr.read();
        }
        fr.close();

        // Webページを取得する
        URL u = new URL("https://book.impress.co.jp/");
        InputStream is = u.openStream();
        int i = is.read();
        while (i != -1) {
            char c = (char)i;
            System.out.print(c);
            i = is.read();
        }
    }
}
