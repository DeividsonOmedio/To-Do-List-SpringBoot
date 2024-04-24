package toDoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import toDoList.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
