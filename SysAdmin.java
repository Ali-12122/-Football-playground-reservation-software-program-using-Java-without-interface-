import java.util.*;

public class SysAdmin extends User{

    SysAdmin(){
        email=" ";
        name=" ";
        Password=" ";
        ID=0;
        userType=type.sysAdmin;
    }

    SysAdmin(String email, int ID, String name, String password){
        this.email=email;
        this.name=name;
        this.Password=Password;
        this.ID=ID;
        this.userType=type.sysAdmin;

    }
    public void deletePlayground( playground Pg ){
        storage.removePlayground(Pg);
    }

    public void suspendPlayground( playground Pg ){
        storage.suspendPlayground(Pg);
    }

    public void activatePlayground( playground Pg ){
        storage.activatePlayground(Pg);
    }




}
