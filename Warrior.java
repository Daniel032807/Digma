 class Warrior extends Character {
    private String weapon;
    Warrior(String name, int hitpoints, String weapon){
         super(name, hitpoints);
         this.weapon = weapon;
     }

     @Override
     public int getHitpoints() {
         return super.getHitpoints();
     }

     public void attack(){
        System.out.println("Warriors Attack");
     }
 }
