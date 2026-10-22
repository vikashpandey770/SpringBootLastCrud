package Boot.SpringBootLastCrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Boot.SpringBootLastCrud.entity.Vikash;
import Boot.SpringBootLastCrud.repository.VikashRepo;

@Service
public class VikashServiceImpl implements VikashService {

	@Autowired
	VikashRepo repository;
	
	public Vikash saveVikash(Vikash v) {
		return repository.save(v);
	}
	
	public List<Vikash>FetchAllVikash(){
		return repository.findAll();
	}
	
	public Vikash getById(long id) {
		Optional<Vikash> vikash=repository.findById(id);
		if(vikash.isPresent()) {
		return vikash.get();
	}
		return null;
	}
	
public String delete(long id) {
	if(repository.findById(id).isPresent()) {
		repository.deleteById(id);
		return"student delete successfully";
	}
	return "no data in database";
}
	
	
	public Vikash updateById(long id,Vikash vikash) {
	
		Optional<Vikash>vikash1=repository.findById(id);
		if(vikash1.isPresent()) {
			Vikash originalVikash=vikash1.get();
		
		if(vikash.getName()!=null
				&& !vikash.getName().trim().isEmpty()) {
			originalVikash.setName(vikash.getName());
		}
		
		if(vikash.getEmail()!=null
				&& !vikash.getEmail().trim().isEmpty()) {
			originalVikash.setEmail(vikash.getEmail());
		}
		
		if(vikash.getAddress()!=null
				&& !vikash.getAddress().trim().isEmpty()) {
			originalVikash.setAddress(vikash.getAddress());
		}
				
		
		if(vikash.getSalary()>0) {
			originalVikash.setSalary(vikash.getSalary());
		}
		
		return repository.save(originalVikash);
		}
		return null;	
	}
	
	
	@Override
	public List<Vikash>findByName(String name){
		return repository.findByName(name);
	}
	public List<Vikash>findByAddress(String address){
		return repository.findByAddress(address);
	}
	
	
}