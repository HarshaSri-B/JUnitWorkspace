package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Coupon;

public interface CouponDao  extends JpaRepository<Coupon,Integer>{

	Coupon findByCode(String code);

}
