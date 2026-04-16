package net.engineeringdigest.journalApp.repo;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepo;
import net.engineeringdigest.journalApp.repository.UserRepoImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class UserRepoImplTests {

    @Autowired
    private UserRepoImpl userRepo;

    @Test
    public void testSaveNewUser(){
        Assertions.assertNotNull(userRepo.getUserForSA());
    }

}
