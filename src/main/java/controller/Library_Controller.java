package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Library_Model;
import repo.Library_Repository;


@RestController
public class Library_Controller 
{
	@Autowired
	Library_Repository libRepo;
	
	@GetMapping("/")
	public String Home() 
	{
		return "Rest Server Started ";
	}
	
	@GetMapping("/getBooks")
	public List<Library_Model> allLogs()
	{
		return libRepo.findAll();
	}

	@PostMapping("/saveBook")
	public Library_Model saveBook(@RequestBody Library_Model libmodel)
	{
		return libRepo.save(libmodel);
	}
	
	@PostMapping("/editBook")
	public Library_Model editBook(@RequestBody Library_Model libmodel,@RequestParam String bookId)
	{
		libmodel.setBookId(bookId);
		return libRepo.save(libmodel);
	}
	
	@PostMapping("/deleteBook")
	public String deleteBook(@RequestParam String bookId)
	{
		Library_Model lib=libRepo.getOne(bookId);
		libRepo.delete(lib);
		return "Deleted Successfully";
		
	}
	
	@GetMapping("/getByType")
	public List<Library_Model> getByType(@RequestParam String genre)
	{
		return libRepo.findByGenre(genre);
	}


}
