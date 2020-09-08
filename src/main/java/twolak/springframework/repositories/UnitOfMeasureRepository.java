/**
 * 
 */
package twolak.springframework.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import twolak.springframework.domain.UnitOfMeasure;

/**
 * @author twolak
 *
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, String> {
	
	Optional<UnitOfMeasure> findByDescription(String description);
}
