package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserServiceTests {
    @Mock
    private FakeRepo fakeRepo;

    @InjectMocks
    private UserServiceImpl userService;

    

    @Test
    void addUser_shouldReturnConfirmation() {
        when(fakeRepo.insertUser(anyLong(), anyString(), anyString()))
            .thenReturn("TestUser");
        
        String result = userService.addUser("TestUser", "TestSurname");
        assertEquals("TestUser added", result);
    }
@Test
void getNonExistentUser_shouldReturnNotFound() {
    when(fakeRepo.findUserById(anyLong())).thenReturn(null);
    assertEquals("User not found", userService.getUser(999L));
}

}
