package NewLab.com.Coach;

public class KidUser implements LibaryUser{
    int age;
    String bookType;

    public KidUser(int age, String bookType){
        this.age = age;
        this.bookType = bookType;

    }

    @Override
    public void registerAccount() {
        if (age < 12 ){
            System.out.println("you have successfully registered under a kids account");
        }else {
            System.out.println("Sorry, age must be less that 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equals("kids")) {
            System.out.println("book issed successfully, please return the book within 10 days.");
        }else {
            System.out.println("oops, you are allowed to take only kids books.");
            }
        }

    }

