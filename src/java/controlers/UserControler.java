/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlers;

import database_stuff.User;
import database_stuff.helpers.UserManager;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ivan
 */
@ManagedBean
@SessionScoped
public class UserControler {

	public String username;
	public String password;
	public String password2;
	
	public String first;
	public String last;
	public String email;
	public String phoneNumber;
	
	public String poruka;
	
	public Boolean logedIn = false;
	User user = null;
	
	UserManager manager;
	/**
	 * Creates a new instance of UserControler
	 */
	public UserControler() {
		manager = new UserManager();
	}
	
	public String logout() {
		logedIn = false;
		FacesContext ctx = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) ctx.getExternalContext().getSession(false);
		session.invalidate();
		return "index?faces-redirect=true";
	}
	
	public String login() {
		User u = manager.getByUsername(username);
		
		if(u != null) {
			user = u;
			byte[] pass = user.getPassword();
			boolean p = true;
			for(int i = 0; i < password.length(); i++)
				if(pass[i] != password.charAt(i))
					p = false;
			if(p) {
				logedIn = true;
				u.setLastLoginDatetime(new Date());
				manager.update(u);
				return "index?faces-redirect=true";
			} else {
				poruka = "Pogresna sifra";
			}
		} else {
			poruka = "Pogresno korisnicko ime";
		}

		return null;
	}
	
	public String register() {
		User u = null;
		poruka = "";
		u = manager.getByUsername(username);
		if(u != null) {
			poruka = "Korisnicko ime je zauzeto";
			logedIn = false;
			return null;
		}
		
		u = manager.getByEmail(email);
		if(u != null) {
			poruka = "Email je vec registrovan";
			logedIn = false;
			return null;
		}
		
		u = new User();
		
		u.setUsername(username);
		byte[] pass = new byte[password.length()];
		for(int i = 0; i < password.length(); i++) 
			pass[i] = (byte) password.charAt(i);
		u.setPassword(pass);
		
		u.setEmail(email);
		u.setFirstName(first);
		u.setLastName(username);
		u.setPhoneNumber(phoneNumber);
		u.setReservationsBanned(false);
		u.setLastLoginDatetime(new Date());
		manager.save(u);
		user = u;
		logedIn = true;
		return "index?faces-redirect=true";
		
	}
	
	// getters and setters

	public Boolean getLogedIn() {
		return logedIn;
	}

	public void setLogedIn(Boolean logedIn) {
		this.logedIn = logedIn;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getFirst() {
		return first;
	}

	public String getLast() {
		return last;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getPoruka() {
		return poruka;
	}

	public User getUser() {
		return user;
	}

	public UserManager getManager() {
		return manager;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setPoruka(String poruka) {
		this.poruka = poruka;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setManager(UserManager manager) {
		this.manager = manager;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	
	
	
}
