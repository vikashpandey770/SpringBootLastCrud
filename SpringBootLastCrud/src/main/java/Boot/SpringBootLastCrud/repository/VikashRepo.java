package Boot.SpringBootLastCrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Boot.SpringBootLastCrud.entity.Vikash;

public interface VikashRepo extends JpaRepository<Vikash, Long> {

	List<Vikash>findByName(String name);
	List<Vikash>findByAddress(String address);
	
	
}