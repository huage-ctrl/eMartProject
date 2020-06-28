package org.emart.midtier.userservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.emart.midtier.userservice.entity.Buyer;
import org.emart.midtier.userservice.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserServiceApplicationTests {
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
    }
    private Buyer buyer;
    @BeforeEach
    void setUp() {
        Buyer buyer = new Buyer();
        buyer.setUsername("buyer001");
        buyer.setPassword("123456");
        buyer.setPhone("13800000000");
        this.buyer = userService.findBuyer(buyer);
    }

    @Test
    void newBuyer() {
        Buyer buyer = new Buyer();
        buyer.setUsername("buyer001");
        buyer.setPassword("123456");
        buyer.setPhone("13800000000");

        Buyer buyer1 = userService.findBuyer(buyer);

        assertEquals(this.buyer, buyer1);
    }

}
