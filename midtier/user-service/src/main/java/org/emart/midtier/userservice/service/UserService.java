package org.emart.midtier.userservice.service;

import org.emart.midtier.userservice.entity.Buyer;
import org.emart.midtier.userservice.entity.Seller;
import org.emart.midtier.userservice.repository.BuyerRepository;
import org.emart.midtier.userservice.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {
    final BuyerRepository buyerRepository;
    final SellerRepository sellerRepository;
    @Autowired
    public UserService(BuyerRepository buyerRepository, SellerRepository sellerRepository) {
        this.buyerRepository = buyerRepository;
        this.sellerRepository = sellerRepository;
    }

    public Buyer findBuyer(Buyer buyer){
        String username = buyer.getUsername();
        Optional<Buyer> buyer1 = buyerRepository.findBuyerByUsername(username);
        return buyer1.map(s -> {
            String password = s.getPassword();
            String password1 = buyer.getPassword();
            return password.equals(password1) ? s : null;
        }).orElse(null);
    }
    public Seller findSeller(Seller seller){
        String username = seller.getUsername();
        Optional<Seller> seller1 = sellerRepository.findSellerByUsername(username);
        return seller1.map(s -> {
            String password = s.getPassword();
            String password1 = seller.getPassword();
            return password.equals(password1) ? s : null;
        }).orElse(null);
    }

    public Buyer newBuyer(Buyer buyer) {
        return this.buyerRepository.save(buyer);
    }

    public Seller newSeller(Seller seller) {
        return this.sellerRepository.save(seller);
    }
}
