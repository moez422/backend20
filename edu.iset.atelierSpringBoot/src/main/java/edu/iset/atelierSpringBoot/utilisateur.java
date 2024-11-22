package edu.iset.atelierSpringBoot;

import java.util.List;

/*import com.example.demo.evalution.Evalution;
import com.example.demo.formation.Formation;
import com.example.demo.theme.Theme;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;




*/
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;





@Entity
public class utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String prenom;
    private String email;
    private String adresse;
    private String motDePasse;
    private String role;
    private boolean isVlidated;
    /*
    @OneToMany(mappedBy = "employe", cascade = CascadeType.ALL)
    private List<Evalution> evaluation;
    
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name = "idf")
    private Formation formation;*/
    
    public utilisateur()
    {}
	public utilisateur(Long id, String Name, String prenom, String email, String adresse, String motDePasse, String role,
			boolean isVlidated) {
		super();
		this.id = id;
		this.name = Name;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.motDePasse = motDePasse;
		this.role = role;
		this.isVlidated = isVlidated;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isVlidated() {
		return isVlidated;
	}
	public void setVlidated(boolean isVlidated) {
		this.isVlidated = isVlidated;
	}
}