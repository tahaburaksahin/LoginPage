import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Taha","sahin");
        logininfo.put("Exgalitus","PASSWORD");
        logininfo.put("Tahaburak","tahaburaksahinn");
    }
    public HashMap getLoginInfo(){
        return logininfo;
    }
}