package kg.geektech.les5.objects;

public class Hero {
    private int Hp;
    private int Attack;
    private String ultimate;
   public Hero (int Hp, int Attack, String ultimate){
       if (Hp < 0){
           System.out.println("Wrong value");
       }
       else{
           this.Hp = Hp;
       }
       if (Attack < 0){
           System.out.println("Wrong value");
       }
       else{
           this.Attack = Attack;
       }
   }
    public Hero (int Hp, int Attack){
        if (Hp < 0){
            System.out.println("Wrong value");
        }
        else{
            this.Hp = Hp;
        }
        if (Attack < 0){
            System.out.println("Wrong value");
        }
        else{
            this.Attack = Attack;
        }
    }
    public int getHp(){
       return getHp();
    }
    public int getAttack(){
        return getAttack();
    }public String getUltimate(){
        return getUltimate();
    }

}
