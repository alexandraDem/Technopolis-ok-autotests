public class User {
    String name;
    String lastName;
    String login;
    String password;

    User(String newName, String newLastName, String newLogin, String newPassword){
        this.name = newName;
        this.lastName = newLastName;
        this.login = newLogin;
        this.password = newPassword;
    }

    public String GetFullName(){
        return name + " " + lastName;
    }
}
