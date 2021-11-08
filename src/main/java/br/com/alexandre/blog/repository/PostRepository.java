package br.com.alexandre.blog.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alexandre.blog.model.Author;
import br.com.alexandre.blog.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

	List<Post> findByAuthor(Author author);
	List<Post> findByDatePost(Date datePost);
	List<Post> findByTitle(String title);
}
