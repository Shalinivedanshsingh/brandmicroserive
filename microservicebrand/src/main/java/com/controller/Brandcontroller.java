package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Repository.BrandRepository;
import com.entity.Brand;

@RestController
@RequestMapping("/Brands")
public class Brandcontroller {

	@Autowired
	private BrandRepository repo;

	@PostMapping("/add")
	//@ResponseStatus(code = HttpStatus.CREATED)
	public Brand createBrands(@RequestBody Brand brand) {
		return repo.save(brand);

	}

	@GetMapping("/getAll")
	public List<Brand> getAllBrands() {

		List<Brand> Brands = repo.findAll();

		return Brands;
	}
	
	@GetMapping("/{id}")
	public List<Brand> ByProductidgetAllBrands(@PathVariable Integer id) {

		List<Brand> Brands = repo.findByProductId(id);

		return Brands;
	}

}
