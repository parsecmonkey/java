// 多様性
public class Main {
    public static void main(String[] args) {
        Wizard w = new Wizard();
        Character c = w;
        Matango m = new Matango();

        Monster[] monsters = new Monster[2];
        monsters[0] = new Slime();
        monsters[1] = new Matango();

        // instanceof演算子
        if (c instanceof Wizard) {
            Wizard w2 = (Wizard)c;
            w2.name = "アサカ";
            w2.attack(m);
            w2.fireball(m);
        }

        for (Monster ms : monsters) {
            ms.run();
        }
    }
}
