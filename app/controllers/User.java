package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import javax.xml.transform.Result;
import java.lang.String;
import java.security.SecureRandom;

public class User extends Controller {
    private String UserName;
    private String FirstName;
    private String LastName;
    private String Password;
    private static int Index = 0;
    private int Connections;
    private int Paging;
    private int Orders;
    private int TapUserName;
    public User (String UserName,String FirstName,String LastName,String Password){
        this.UserName = UserName;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Password = Password;
        Index ++;
        this.Index = Index;
        this.Connections = 0;
        this.Paging = 0;
        this.Orders = 0;
        this.TapUserName = 0;
    }
    public String getUserName(){
        return this.UserName;
    }
    public String getFirstName(){
        return this.FirstName;
    }
    public String getLastName(){
        return this.LastName;
    }
    public String getPassword(){
        return this.Password;
    }
    public int getIndex(){
        return this.Index;
    }
    public int getConnections(){
        return this.Connections;
    }
    public void incConnectins(){
        this.Connections++;
    }
    public int getPaging(){
        return this.Paging;
    }
    public void incPaging(){
        this.Paging++:
    }
    public int getOrders{
        return this.Orders;
    }
    public void incOrders(){
        this.Orders++;
    }
    public int getTapUserName(){
        return this.TapUserName;
    }
    public void inTapUserName(){
        this.TapUserName++;
    }
}
