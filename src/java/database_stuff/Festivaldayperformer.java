package database_stuff;
// Generated Jan 28, 2017 8:06:00 PM by Hibernate Tools 4.3.1



/**
 * Festivaldayperformer generated by hbm2java
 */
public class Festivaldayperformer  implements java.io.Serializable {


     private Integer id;
     private Festivalday festivalday;
     private Performer performer;

    public Festivaldayperformer() {
    }

    public Festivaldayperformer(Festivalday festivalday, Performer performer) {
       this.festivalday = festivalday;
       this.performer = performer;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Festivalday getFestivalday() {
        return this.festivalday;
    }
    
    public void setFestivalday(Festivalday festivalday) {
        this.festivalday = festivalday;
    }
    public Performer getPerformer() {
        return this.performer;
    }
    
    public void setPerformer(Performer performer) {
        this.performer = performer;
    }




}


