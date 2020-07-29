package ru.innopolis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.innopolis.model.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {

}
