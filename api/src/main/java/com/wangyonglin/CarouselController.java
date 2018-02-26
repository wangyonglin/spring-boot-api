package com.wangyonglin;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarouselController {
	@Autowired
	private CarouselRepository carouselRepository;

	@GetMapping(value = "/carousels")
	public List<Carousel> carouselList(){
		return carouselRepository.findAll();
	}
	
	@PostMapping(value = "/carousels")
	public Carousel AddCarousel(@RequestParam("imgsrc") String imgsrc,
									  @RequestParam("title")  String title,
									  @RequestParam("href") String href,
									  @RequestParam("category") Integer category) {
		Carousel carousel = new Carousel();
		carousel.setImgsrc(imgsrc);
		carousel.setHref(href);
		carousel.setTitle(title);
		carousel.setCategory(category);
		return carouselRepository.save(carousel);	
	}
	
	@GetMapping(value = "/carousel/{id}")
	public Carousel GetCarouselFindOne(@PathVariable("id") Integer id) {
		return carouselRepository.findOne(id);
	}
	
	@PutMapping(value = "/carousel/{id}")
	public Carousel UpdateCarousel(@PathVariable("id") Integer id,
											 @RequestParam("imgsrc") String imgsrc,
											 @RequestParam("title")  String title,
											 @RequestParam("href") String href,
											 @RequestParam("category") Integer category) {
		
		Carousel carousel = new Carousel();
		carousel.setId(id);
		carousel.setImgsrc(imgsrc);
		carousel.setHref(href);
		carousel.setTitle(title);
		carousel.setCategory(category);
		return carouselRepository.save(carousel);	
		
	}
	
	@DeleteMapping(value = "/carousel/{id}")
	public void DeleteCarousel(@PathVariable("id") Integer id) {
		carouselRepository.delete(id);
	}
	
	@GetMapping(value = "/carousels/category/{category}")
	public List<Carousel>SelectCarousel(@PathVariable("category") Integer category){
		return carouselRepository.findByCategory(category);
	}
}
