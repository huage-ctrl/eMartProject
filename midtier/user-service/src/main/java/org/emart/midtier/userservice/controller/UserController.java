package org.emart.midtier.userservice.controller;

import org.emart.midtier.userservice.entity.Buyer;
import org.emart.midtier.userservice.entity.Seller;
import org.emart.midtier.userservice.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * user login and profile details表控制层
 *
 * @author makejava
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/buyerLogin")
    public Buyer buyerLogin(@RequestBody Buyer buyer) {
        Buyer user = userService.findBuyer(buyer);
        return user;
    }


    @GetMapping("/sellerLogin")
    public Seller sellerLogin(@RequestBody Seller seller) {
        Seller user = userService.findSeller(seller);
        return user;
    }

    @PostMapping("/buyerSignUp")
    public Buyer buyerSignUp(@RequestBody Buyer buyer) {
        return userService.newBuyer(buyer);
    }
    @PostMapping("/sellerSignUp")
    public Seller sellerSignUp(@RequestBody Seller seller) {
        return userService.newSeller(seller);
    }
}
