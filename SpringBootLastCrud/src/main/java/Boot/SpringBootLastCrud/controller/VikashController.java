package Boot.SpringBootLastCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Boot.SpringBootLastCrud.entity.Vikash;
import Boot.SpringBootLastCrud.service.VikashService;
@RestController
public class VikashController{

	@Autowired 
private	VikashService vikashService;
	
	@PostMapping("/vikash")
	public Vikash saveVikash(@RequestBody Vikash vikash) {
		return vikashService.saveVikash(vikash);
	}
	
	@GetMapping("/vikash")
	public  List<Vikash> getVikash(){
		return vikashService.FetchAllVikash();
	}
	
	@GetMapping("/vikash/{id}")
	public Vikash getById(@PathVariable("id")Long id) {
		return vikashService.getById(id);
	}
	
	@PutMapping("/vikash/{id}")
	public Vikash updateById(@PathVariable("id")Long id,@RequestBody Vikash vikash) {
		return vikashService.updateById(id, vikash);
	}
	
	@DeleteMapping("/vikash/{id}")
	public String delete(@PathVariable("id")Long id) {
		return vikashService.delete(id);
	}

	@GetMapping("/findByName/{name}")
	public List<Vikash>findByName(@PathVariable String name){
		return vikashService.findByName(name);
	}
	
	@GetMapping("/findByAddress/{address}")
	public List<Vikash>findByAddress(@PathVariable String address){
		return vikashService.findByAddress(address);
		
	}
}
