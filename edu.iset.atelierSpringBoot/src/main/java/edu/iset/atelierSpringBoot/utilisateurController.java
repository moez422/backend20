package edu.iset.atelierSpringBoot;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import com.example.demo.employe.Employe;
import com.example.demo.employe.EmployeLoginDao;

@RestController
@RequestMapping("/utilisateurs")
public class utilisateurController {

    private static final Logger logger = LoggerFactory.getLogger(utilisateurController.class);
    private utilisateurService utilisateurService;

    public utilisateurController(utilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @GetMapping
    public List<utilisateur> getAllUtilisateurs() {
        return utilisateurService.getAllUtilisateurs();
    }

    @GetMapping("/{id}")
    public utilisateur getUtilisateurById(@PathVariable Long id) {
        return utilisateurService.getUtilisateurById(id);
    }

    @PutMapping("/{id}")
    public utilisateur updateUtilisateur(@PathVariable Long id, @RequestBody utilisateur utilisateur) {
        logger.info("Requête PUT reçue pour ID: {}", id);
        logger.info("Données reçues: {}", utilisateur);

        try {
            utilisateur.setId(id);
            utilisateur updatedUtilisateur = utilisateurService.updateUtilisateur(utilisateur);
            logger.info("Mise à jour réussie pour l'utilisateur avec ID: {}", id);
            return updatedUtilisateur;
        } catch (Exception e) {
            logger.error("Erreur lors de la mise à jour de l'utilisateur avec ID: {}", id, e);
            throw e;
        }
    }

    @PostMapping
    public utilisateur signupemploye(@RequestBody utilisateur utilisateur) {
        return utilisateurService.addUtilisateur(utilisateur);
    }

    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable Long id) {
    	utilisateurService.deleteUtilisateur(id);
    }

    @GetMapping("/search")
    public List<utilisateur> searchUtilisateurs(@RequestParam String query) {
        return utilisateurService.findByName(query);
    }
}
