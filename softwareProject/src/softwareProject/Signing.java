package softwareProject;
public class Signing {
    private DataBase dataBase;
    public Signing(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public User signIn(String email, String password) {
        for (User user : dataBase.myUsers) {
            if (user.getEmail() == email && user.getPassword() == password) {
                return user;
            }
        }
        return null;
    }

    public boolean signUp(User user) {
        return this.dataBase.myUsers.add(user);
    }
    
}
