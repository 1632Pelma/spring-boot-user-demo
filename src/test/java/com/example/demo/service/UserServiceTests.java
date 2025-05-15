package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.repo.FakeRepo;

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

@Test
void removeUser_shouldReturnConfirmation() {
    when(fakeRepo.deleteUser(anyLong())).thenReturn("TestUser");
    String result = userService.removeUser(123L);
    assertEquals("TestUser removed", result);
}


}
