import java.util.*;

public class Main {
    public static void main(String[] agrs) {
        String[] names = new String[3];
        names[0] = "たなか";
        names[1] = "すずき";
        names[2] = "さいとう";
        System.out.println(names[2]);

        // ArrayList
        ArrayList<String> namesA =  new ArrayList<String>();
        namesA.add("たなか");
        namesA.add("すずき");
        namesA.add("さいとう");
        System.out.println(namesA.get(1));

        // Integer
        ArrayList<Integer> points = new ArrayList<Integer>();
        points.add(10);
        points.add(80);
        points.add(75);
        for (int i : points) {
            System.out.println(i);
        }

        // Iterator
        Iterator<String> it = namesA.iterator();
        while (it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }

        // HashMap
        Map<String, Integer> prefs = new HashMap<String, Integer>();
        prefs.put("京都府", 255);
        prefs.put("東京都", 1261);
        prefs.put("熊本県", 181);
        int tokyo = prefs.get("東京都");
        System.out.println("東京都の人口は，" + tokyo);
        prefs.remove("京都府");
        prefs.put("熊本県", 182);
        int kumamoto = prefs.get("熊本県");
        System.out.println("熊本県の人口は，" + kumamoto);
    }
}
