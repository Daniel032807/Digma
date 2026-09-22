public class Character {
    private String name;
    private int hitpoints;

     Character(String name, int hitpoints){
         this.name = name;
         this.hitpoints = this.hitpoints;
     }
    public String getName() {
        return name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    void attack() {
        System.out.println("Character attacks!!");
    }
}














