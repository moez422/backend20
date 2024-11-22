package edu.iset.atelierSpringBoot;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface utilisateurRepository extends JpaRepository<utilisateur, Long> {

	List<utilisateur> findAll();

	Optional<utilisateur> findById(Long id);

	utilisateur save(utilisateur utilisateur);
	
	List<utilisateur> findByName(@Param("query") String query);
}
