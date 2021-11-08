package br.com.alexandre.blog.service;

import java.util.Collection;

import br.com.alexandre.blog.model.Post;

public interface PostService {
	Post create(Post post);
	Collection<Post> listPost(int limit);
	Post get(Long id);
	Collection<Post> get(String title);
	Post update(Post post);
	Boolean delete(Long id);
}
