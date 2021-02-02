package com.springboot.pjt1.wishList.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.pjt1.repository.dto.WishList;
import com.springboot.pjt1.repository.mapper.WishListMapper;

@Service
public class WishListServiceImpl implements WishListService {
	
	@Autowired
	WishListMapper mapper;
	
	@Override
	public List<WishList> searchWishListByMemberId(String memberId) {
		return mapper.selectWishListByMemberId(memberId);
	}

	@Override
	public String addWishListByMemberId(WishList wishList) {
		try {
			mapper.insertWishList(wishList);
			return "OK";
		} catch(Exception e) {
			return "FAIL";
		}
	}
	
	@Override
	public String removeWishListByNo(int wishNo) {
		try {
			mapper.deleteWishListByNo(wishNo);
			return "OK";
		} catch(Exception e) {
			return "FAIL";
		}
	}
	
}