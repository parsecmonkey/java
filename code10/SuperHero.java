// 継承
public class SuperHero extends Hero {
    boolean flying;

    public SuperHero() {
        System.out.println("SuperHero");
    }

    public void fly() {
        this.flying = true;
        System.out.println("飛び上がった！");
    }

    public void land() {
        this.flying = false;
        System.out.println("着地した！");
    }

    // オーバーライド
    public void run() {
        System.out.println(this.name + "は撤退した！");
    }

    public void attack(Matango m) {
        // super:今より一つ内側の部分
        super.attack(m);
        if (this.flying) {
            super.attack(m);
        }
    }
}
