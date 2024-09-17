package NewLab.com.Coach;

public class LibaryInterfaceDemo {
    public static void main(String[]args){
        KidUser kid1= new KidUser(10,"kids");
        kid1.registerAccount();
        kid1.requestBook();
        KidUser kid2 = new KidUser(18,"fiction");
        kid2.registerAccount();
        kid2.requestBook();
        AdultUser adult1 = new AdultUser(5, "kids");
        adult1.registerAccount();
        adult1.requestBook();
        AdultUser adult2= new AdultUser(23, "fiction");
        adult2.requestBook();
        adult2.registerAccount();
    }
}
