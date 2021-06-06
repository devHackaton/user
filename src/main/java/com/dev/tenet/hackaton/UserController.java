package com.dev.tenet.hackaton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/checkTransferLimit/{userId}")
    public boolean checkIfTransferLimitIsNotExceeded(@RequestParam Integer userId) {
        return userService.checkIfTransferLimitIsNotExceeded(userId);
    }

}
