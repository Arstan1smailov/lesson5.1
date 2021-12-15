package kg.geektech.les5.objects;

public class Boss {
    private int Hp;
    private int Attack;
    private String DefType;

    public Boss(int Hp, int Attack, String Deftype) {
        this.DefType = Deftype;
        this.Hp = Hp;
        if (Hp < 0) {
            System.out.println("Wrong value");
        } else {
            this.Hp = Hp;
        }
        this.Attack = Attack;
        if (Attack < 0) {
            System.out.println("Wrong value");
        } else {
            this.Attack = Attack;
        }

    }

    public int getHp() {
        return Hp;
    }

    public int getAttack() {
        return Attack;
    }

    public String getDefType() {
        return DefType;
    }

    public void setDefType(String DefType) {
        if (DefType.length() < 20) {
            this.DefType = DefType;
        } else {
            System.out.println("Value for DefType is too long");
        }
    }

    public void setHp(int Hp) {
        if (Hp < 0) {
            System.out.println("Value for Hp is too long");
        } else {
            this.Hp = Hp;
        }
    }

    public void setAttack(int Attack) {
        if (Attack < 0) {
            System.out.println("Value for Attack is too long");
        } else {
            this.Attack = Attack;
        }
    }
}
