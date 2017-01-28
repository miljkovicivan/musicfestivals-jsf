package database_stuff;
// Generated Jan 28, 2017 8:06:00 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Festivalday generated by hbm2java
 */
public class Festivalday  implements java.io.Serializable {


     private Integer id;
     private Festival festival;
     private Date date;
     private Set<TicketFestivalday> ticketFestivaldays = new HashSet<TicketFestivalday>(0);
     private Set<Festivaldayperformer> festivaldayperformers = new HashSet<Festivaldayperformer>(0);

    public Festivalday() {
    }

    public Festivalday(Festival festival, Date date, Set<TicketFestivalday> ticketFestivaldays, Set<Festivaldayperformer> festivaldayperformers) {
       this.festival = festival;
       this.date = date;
       this.ticketFestivaldays = ticketFestivaldays;
       this.festivaldayperformers = festivaldayperformers;
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
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public Set<TicketFestivalday> getTicketFestivaldays() {
        return this.ticketFestivaldays;
    }
    
    public void setTicketFestivaldays(Set<TicketFestivalday> ticketFestivaldays) {
        this.ticketFestivaldays = ticketFestivaldays;
    }
    public Set<Festivaldayperformer> getFestivaldayperformers() {
        return this.festivaldayperformers;
    }
    
    public void setFestivaldayperformers(Set<Festivaldayperformer> festivaldayperformers) {
        this.festivaldayperformers = festivaldayperformers;
    }




}


