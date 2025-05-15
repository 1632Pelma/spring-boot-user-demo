package com.example.demo.service;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserServiceTests {
    @Mock
    private FakeRepo fakeRepo;

    @InjectMocks
    private UserServiceImpl userService;

}
