package Boot.SpringBootLastCrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import Boot.SpringBootLastCrud.entity.Vikash;

public interface VikashService {

	Vikash saveVikash(Vikash v);
	List<Vikash>FetchAllVikash();
	Vikash getById(long id);
	Vikash updateById(long id, Vikash vikash);
	String delete(long id);	
	
	List<Vikash>findByName(String name);
	List<Vikash>findByAddress(String address);
}