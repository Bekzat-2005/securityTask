package kz.bitlab.springboot.springsecuritytask.repository;



import kz.bitlab.springboot.springsecuritytask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
