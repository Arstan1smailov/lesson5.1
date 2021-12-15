package kg.geektech.les5.general;

import kg.geektech.les5.objects.Boss;
import kg.geektech.les5.objects.Hero;

import java.util.Random;

public class Main {
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(20, 5, "Magic");
        Hero hero2 = new Hero(25, 5);
        Hero hero3 = new Hero(15, 10);
        return new Hero[]{hero1, hero2, hero3};
    }

    public static void main(String[] args) {
        createHeroes();
        Random random = new Random();
        random.nextInt(2);
        Boss boss1 = new Boss(100, 50, "Magic");
        System.out.println(boss1.getHp() + " " + boss1.getAttack() + " " + boss1.getDefType());
        Hero[] heroes = createHeroes();
        for (Hero practice: heroes){
            System.out.println(practice.getAttack());
            System.out.println(practice.getHp());
            System.out.println(practice.getUltimate());
        }
    }
}
