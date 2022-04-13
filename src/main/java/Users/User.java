package Users;

public class User {
    String name;
    String lastName;
    public String login;
    public String password;

    public User(){};

    public User(String newName, String newLastName, String newLogin, String newPassword){
        this.name = newName;
        this.lastName = newLastName;
        this.login = newLogin;
        this.password = newPassword;
    }

    public String GetFullName(){
        return (name + " " + lastName);
    }


    public static class UserBuilder {
        private final User user;

        public UserBuilder() {
            this.user = new User();
        }

        public UserBuilder withLogin(String newLogin){
            user.login = newLogin;
            return this;
        }

        public UserBuilder withPassword(String newPassword){
            user.password = newPassword;
            return this;
        }

        public UserBuilder withName(String newName){
            user.name = newName;
            return this;
        }

        public UserBuilder withLastName(String newLastName){
            user.lastName = newLastName;
            return this;
        }

        public User build(){
            return user;
        }
    }

}
