/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author ivan
 */
@ManagedBean
@SessionScoped
public class testBean {

	/**
	 * Creates a new instance of testBean
	 */
	public testBean() {
	}
	
	public String method() {
		return "index?faces-redirect=true";
	}
	
}
