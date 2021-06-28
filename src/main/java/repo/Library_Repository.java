package repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Library_Model;

@Repository
public interface Library_Repository extends JpaRepository<Library_Model,String> 
{

	List<Library_Model> findByGenre(String genre);

//	List<Library_Model> findbyGenre(String genre);

}
