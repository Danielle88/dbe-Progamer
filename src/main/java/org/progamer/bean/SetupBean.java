package org.progamer.bean;

//import javax.inject.Named;

import javax.faces.bean.ManagedBean;

//@Named

@ManagedBean
public class SetupBean {
	
	public void execute() {
		System.out.println("Executando comando via bean");
	}

}
