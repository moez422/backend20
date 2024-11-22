package edu.iset.atelierSpringBoot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.employe.Employe;


@Service
public class utilisateurService {
	
	@Autowired
	private utilisateurRepository utilisateurRepository;
	
	public utilisateurService(utilisateurRepository utilisateurRepository) {
		this.utilisateurRepository=utilisateurRepository;
	}
	
	
	
	public List<utilisateur> getAllUtilisateurs(){
		return utilisateurRepository.findAll();
		
	}
	
	
	
	public utilisateur getUtilisateurById(Long id){
	Optional<utilisateur>	optionalUtilisateur= utilisateurRepository.findById(id);
	 return optionalUtilisateur.orElse(null);
		
	}
	
	public utilisateur addUtilisateur(utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}
	  public List<utilisateur> findByName(String query) {
	        return utilisateurRepository.findByName(query);
	    }
	  
	
	  public utilisateur updateUtilisateur(utilisateur utilisateur) {
		  utilisateur existingUtilisateur = utilisateurRepository.findById(utilisateur.getId())
				    .orElseThrow(() -> new RuntimeException("Utilisateur avec l'ID " + utilisateur.getId() + " non trouvé"));

	        // Mettre à jour les champs nécessaires
	        existingUtilisateur.setName(utilisateur.getName());
	        existingUtilisateur.setPrenom(utilisateur.getPrenom());
	        existingUtilisateur.setEmail(utilisateur.getEmail());
	        existingUtilisateur.setAdresse(utilisateur.getAdresse());
	        existingUtilisateur.setMotDePasse(utilisateur.getMotDePasse());
	        existingUtilisateur.setRole(utilisateur.getRole());
	        existingUtilisateur.setVlidated(utilisateur.isVlidated());

	        // Sauvegarder les modifications
	        return utilisateurRepository.save(existingUtilisateur);
	    }




	

	public void deleteUtilisateur(Long id) {
		utilisateurRepository.deleteById(id);
		
	}
	}
