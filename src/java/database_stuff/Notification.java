package database_stuff;
// Generated Jan 28, 2017 8:06:00 PM by Hibernate Tools 4.3.1



/**
 * Notification generated by hbm2java
 */
public class Notification  implements java.io.Serializable {


     private Integer id;
     private User user;
     private Boolean seen;
     private String message;

    public Notification() {
    }

    public Notification(User user, Boolean seen, String message) {
       this.user = user;
       this.seen = seen;
       this.message = message;
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
    public Boolean getSeen() {
        return this.seen;
    }
    
    public void setSeen(Boolean seen) {
        this.seen = seen;
    }
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }




}


