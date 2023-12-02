package com.example.onlineshop.service;

import com.example.onlineshop.entity.AppUser;
import com.example.onlineshop.entity.Cart;
import com.example.onlineshop.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartRepository cartRepository;

    public void createCart(AppUser appUser){
        var cart = Cart.builder()
                .user(appUser)
                .build();
        cartRepository.save(cart);
    }
}
