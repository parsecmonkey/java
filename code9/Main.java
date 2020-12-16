public class Main {
    public static void main(String[] args) {
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;

        Hero h1;
        h1 = new Hero("ミナト");
        h1.sword = s;
        h1.attack();

        Hero h2 = new Hero("アサカ");

        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;
        w.heal(h1); // ミナトを回復させる
        w.heal(h2); // アサカを回復させる
    }
}
