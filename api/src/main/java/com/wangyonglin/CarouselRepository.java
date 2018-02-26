package com.wangyonglin;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarouselRepository extends JpaRepository<Carousel,Integer>{
	public List<Carousel> findByCategory(Integer category);

}
