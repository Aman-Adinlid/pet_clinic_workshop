package se.lexicon.aman.pet_workshop.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.aman.pet_workshop.entity.Owner;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, String> {
    List<Owner> findByAddressContains(String address);

    List<Owner> findByTelephone(String telephone);

    List<Owner> findByFirstNameIgnoreCase(String firstName);

    List<Owner> findByLastNameIgnoreCase(String lastName);

    List<Owner> findByFirstNameIgnoreCaseAndLastNameIgnoreCase(String firstName, String lastName);
}
