package edu.iset.atelierSpringBoot;

public class login {
	
	public Long id;
	public String motDePasse;
	public login(Long id, String motDePasse) {
		super();
		this.id = id;
		this.motDePasse = motDePasse;
	}
	
	public Long getID() {
		return id;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	
	public Long getmotDePasse() {
		return id;
	}
	
	public void setmotDePasse(String motDePasse) {
		this.motDePasse=motDePasse;
	}

}
