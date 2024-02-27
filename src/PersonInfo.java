public class PersonInfo {

    private String name;
    private String Email;

    public PersonInfo(String name, String email) {
        this.name = name;
        Email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void display(){
        System.out.println("name = " + name + ", Email = " + Email);
    }



//    @Override
//    public String toString() {
//        return "PersonInfo{" +
//                "name='" + name + '\'' +
//                ", Email='" + Email + '\'' +
//                '}';
//    }




}
