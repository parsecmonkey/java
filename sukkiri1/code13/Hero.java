public class Hero {
    private int hp;
    String name;

    // setterメソッド
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("名前がnullである．処理を中断");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎる．処理を中断");
        }
        if (name.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎる．処理を中断");
        }
        this.name = name;
    }

    // getterメソッド
    public String getName() {
        return this.name;
    }

    public void bye() {
        System.out.println("勇者は別れを告げた");
    }

    void sleep() {
        System.out.println("寝た");
        this.hp = 100;
    }

    private void die() {
        System.out.println(this.name + "は死んでしまった");
        System.out.println("GAME OVERです");
    }
}
