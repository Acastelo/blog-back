package br.com.alexandre.blog.service.implementation;

import java.util.Collection;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.alexandre.blog.model.Post;
import br.com.alexandre.blog.repository.PostRepository;
import br.com.alexandre.blog.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class PostServiceImpl implements PostService{
	
	private final PostRepository repository;
	
	@Override
	public Post create(Post post) {
		log.info("Creating new post: {}", post.getTitle());
		return repository.save(post);
	}

	@Override
	public Collection<Post> listPost(int limit) {
		log.info("Listing all posts");
		return repository.findAll(PageRequest.of(0, limit)).toList();
	}

	@Override
	public Post get(Long id) {
		log.info("Listing post by id: {}", id);
		return repository.findById(id).get();
	}

	@Override
	public Collection<Post> get(String title) {
		log.info("Listing post by title: {}", title);
		return repository.findByTitle(title);
	}
	
	@Override
	public Post update(Post post) {
		log.info("Updating the post: {}", post.getTitle());
		return repository.save(post);
	}

	@Override
	public Boolean delete(Long id) {
		log.info("Deleting post by id: {}", id);
		repository.deleteById(id);
		return Boolean.TRUE;
	}
}
