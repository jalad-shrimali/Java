class Computer{
    // access-modifier return-type funtion-name()
    public void playMusic(){
        System.out.println("Music Playing...");
    }
    public String getPen(int cost){
        if(cost > 10) {
            return "Pen";
        }
        else {
            return "Nothing!!";
        }
    }
}
public class Methods {
    public static void main(String[] args){
    Computer cc = new Computer();
    cc.playMusic();
    String str = cc.getPen(10 );
    System.out.println(str );
    }
}
