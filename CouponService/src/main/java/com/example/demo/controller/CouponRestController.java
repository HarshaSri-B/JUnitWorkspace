package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.CouponDao;
import com.example.demo.model.Coupon;

@RestController
public class CouponRestController {

	@Autowired
	CouponDao repo;
	
	@PostMapping("/CreateCoupon")
	public void create(@RequestBody Coupon coupon) {
		repo.save(coupon);
	}
	
	@GetMapping("/getCouponsByCode/{code}")
	public Coupon getCoupon(@PathVariable String code) {
		return repo.findByCode(code);
	}
	
	
}
