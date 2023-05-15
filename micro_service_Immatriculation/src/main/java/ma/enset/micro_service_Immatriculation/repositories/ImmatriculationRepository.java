package ma.enset.micro_service_Immatriculation.repositories;

import ma.enset.micro_service_Immatriculation.entities.Immatriculation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ImmatriculationRepository extends JpaRepository<Immatriculation,Long> {

}
