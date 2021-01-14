public class Main {
    public static void main(String[] args){

        // if
        boolean tenki = true;
        if (tenki == true) {
            System.out.println("洗濯をします");
        } else {
            System.out.println("DVDを見ます");
        }

        // else if
        System.out.println("あなたの運勢を占います");
        int fortune = new java.util.Random().nextInt(4) + 1;
        if (fortune == 1) {
            System.out.println("大吉");
        } else if (fortune == 2) {
            System.out.println("中吉");
        } else if (fortune == 3) {
            System.out.println("吉");
        } else {
            System.out.println("凶");
        }

        // switch
        switch (fortune) {
            case 1:
                System.out.println("大吉");
                break;
            case 2:
                System.out.println("中吉");
                break;
            case 3:
                System.out.println("吉");
                break;
            default:
                System.out.println("凶");
        }

        // for
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello");
        }

    }
}
