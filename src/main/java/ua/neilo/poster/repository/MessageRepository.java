package ua.neilo.poster.repository;

import org.springframework.data.repository.CrudRepository;
import ua.neilo.poster.domain.Message;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Integer> {

    List<Message> findByTag(String tag);
}
