package IOCExample;

public class UserManager {
    private UserDataBaseProvider dataprovider;


    public UserManager(UserDataBaseProvider dataprovider) {
        this.dataprovider = dataprovider;
    }
    String getUserinfo(){
        return dataprovider.getUserData();

    }
}
