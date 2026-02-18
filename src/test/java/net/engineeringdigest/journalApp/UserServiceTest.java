package net.engineeringdigest.journalApp;

import net.engineeringdigest.journalApp.repository.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserRepo userRepo;


    @Test
    public void testFindByUserName(){
        assertNotNull(userRepo.findByUserName("testuser3"));
    }
}
