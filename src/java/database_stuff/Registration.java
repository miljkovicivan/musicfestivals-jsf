package database_stuff;
// Generated Jan 28, 2017 8:06:00 PM by Hibernate Tools 4.3.1



/**
 * Registration generated by hbm2java
 */
public class Registration  implements java.io.Serializable {


     private Integer id;
     private User user;
     private String status;

    public Registration() {
    }

    public Registration(User user, String status) {
       this.user = user;
       this.status = status;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}

