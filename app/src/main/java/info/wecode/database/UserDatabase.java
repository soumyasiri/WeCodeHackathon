package info.wecode.database;

import java.util.HashMap;
import java.util.Random;

public class UserDatabase {

    public static HashMap<String, String> mUserCredentialsMap = new HashMap<>();


    public static void fillUsers(){
        mUserCredentialsMap.put("admin", "admin");
        mUserCredentialsMap.put("donor1", "pwd");
        mUserCredentialsMap.put("donor2", "pwd");
        mUserCredentialsMap.put("donor3", "pwd");
        mUserCredentialsMap.put("donor4", "pwd");
    }

    public static void store(String username, String password){
        if((username != null && !username.isEmpty())
                && (password != null && !password.isEmpty()))
        mUserCredentialsMap.put(username, password);
    }


    public static String getpassword(String username) {
        String password = null;
        if (mUserCredentialsMap.get(username) != null) {
            password = mUserCredentialsMap.get(username);
        }
        return password;
    }


    private int generateDonarId() {
        Random r = new Random();
        int Low = 10;
        int High = 100;
        return r.nextInt(High - Low) + Low;
    }

}
