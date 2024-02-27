public class Business extends PersonInfo{

    String phoneNumber;



    public Business(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public void display(){
        System.out.println("name = " + this.getName() + ", Email = " + this.getEmail() + ", phonenumber = " + this.getPhoneNumber());
    }


}


