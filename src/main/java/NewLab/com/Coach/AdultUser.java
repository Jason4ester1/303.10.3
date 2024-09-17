package NewLab.com.Coach;

public class AdultUser implements LibaryUser{
    int age;
    String bookType;

    public AdultUser (int age ,String bookType){
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age >= 12 ) {
            System.out.println("you have successfully registered under an adult account");
        }else {
            System.out.println("sorry, age must be greater that 12 to register as na adult");
        }

    }

    @Override
    public void requestBook() {
        if (bookType.equals("Fiction")){
            System.out.println("book issued successfully ,please return the book within 7 days");
        }else {
            System.out.println("oops, you are allowed to take only adult fiction books");
        }

    }
}
