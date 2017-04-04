package in.javahome.springboot.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer>{
	public List<Student> findByName(String name);
}
