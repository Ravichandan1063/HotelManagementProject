package com.example.HotelManagment.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoginController
{
    @Autowired
    LoginService loginService;

    @PostMapping("/rooms/register/user")
    public String register(@RequestBody UserLogin login)
    {
        loginService.register(login);
        return "success";
    }

    @PostMapping("/rooms/register/admin")
    public String register(@RequestBody AdminLogin login)
    {
        loginService.register(login);
        return "success";
    }

    @GetMapping("/rooms/admin/users")
    public List<UserLogin> getUsers()
    {
        return loginService.getUsers();
    }

    @DeleteMapping("/rooms/user/{id}")
    public  void deleteUser(@PathVariable("id") long id)
    {
        loginService.deleteUser(id);
    }

}
