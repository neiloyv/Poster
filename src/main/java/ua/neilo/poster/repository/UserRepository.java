package ua.neilo.poster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.neilo.poster.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin(String login);
}
