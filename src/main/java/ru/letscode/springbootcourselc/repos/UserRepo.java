package ru.letscode.springbootcourselc.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.letscode.springbootcourselc.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
