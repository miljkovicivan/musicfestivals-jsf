package database_stuff;
// Generated Jan 28, 2017 8:06:00 PM by Hibernate Tools 4.3.1



/**
 * Socialnetwork generated by hbm2java
 */
public class Socialnetwork  implements java.io.Serializable {


     private Integer id;
     private Festival festival;
     private String name;
     private String link;

    public Socialnetwork() {
    }

    public Socialnetwork(Festival festival, String name, String link) {
       this.festival = festival;
       this.name = name;
       this.link = link;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Festival getFestival() {
        return this.festival;
    }
    
    public void setFestival(Festival festival) {
        this.festival = festival;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getLink() {
        return this.link;
    }
    
    public void setLink(String link) {
        this.link = link;
    }




}


