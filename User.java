import java.util.*;
public class User {

//    Protected

    protected String email;
    protected String name;
    protected String Password;
    protected int ID;
    protected enum type {sysAdmin, player, playgroundOwner,none};
    protected type userType;

    //    Public
     User(){
        email=" ";
        name=" ";
        Password=" ";
        ID=0;
        userType=type.none;
    }
    User(String email, int ID, String name, String Password,type thisType ){
        this.email=email;
        this.name=name;
        this.Password=Password;
        this.ID=ID;
        this.userType=thisType;
    }

    public String getEmail() { return email; }

    public String getName() { return name; }

    public String getPassword() { return Password; }

    public int getID() { return ID; }

    public type getUserType() { return userType; }

    public void setName(String name) { this.name = name; }

    public void setEmail(String email) { this.email = email; }

    public void setPassword(String password) { Password = password; }

    public void setID(int ID) { this.ID = ID; }

    public void setUserType(type userType) { this.userType = userType; }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", Password='" + Password + '\'' +
                ", ID=" + ID +
                ", userType=" + userType +
                '}';
    }

    //public:getID():int
    //public:getname():string
    //public:getpassword():string
    //public:gettype():enum
    //public:setpassword():void
    //public:setemail():void
    //public:setID():void
    //public:setname():void
    //public:settype():void
    //~User()



}
