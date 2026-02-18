package net.engineeringdigest.journalApp;

import net.engineeringdigest.journalApp.Service.UserDetailsServiceImpl;
import net.engineeringdigest.journalApp.repository.UserRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest
public class UserDetailsServiceImplTest{

    @InjectMocks
    private UserDetailsServiceImpl userDetailsService;

    @Mock
    private UserRepo userRepo;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }


//    @Test
//    void loadUserByUserNameTest(){
//        when(userRepo.findByUserName(ArgumentMatchers.anyString()))
//                .thenReturn((net.engineeringdigest.journalApp.entity.User) User.builder()
//                        .username("testuser3")
//                        .password("abc")
//                        .roles()
//                        .build());
//        UserDetails user = userDetailsService.loadUserByUsername("testuser3");
//        Assertions.assertNotNull(user);
//    }
    @Test
    void loadUserByUserNameTest(){
        // 1. Create YOUR custom entity (not the Spring Security one)
        net.engineeringdigest.journalApp.entity.User userEntity = new net.engineeringdigest.journalApp.entity.User("testuser3","abc");
        userEntity.setRoles(new ArrayList<>()); // Initialize roles list

        // 2. Tell Mockito to return your entity
        when(userRepo.findByUserName(ArgumentMatchers.anyString()))
                .thenReturn(userEntity);

        // 3. Call the actual service method
        UserDetails user = userDetailsService.loadUserByUsername("testuser3");

        // 4. Check results
        Assertions.assertNotNull(user);
    }

}
