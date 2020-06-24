package com.kongu.controller;

import com.kongu.Service.Userservice;
import com.kongu.model.Usermodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class usercontroller {
    @Autowired
    Userservice userservice;

    @PostMapping("/admin/createUser")
    public Usermodel createuser(@RequestBody Usermodel Usermodel) {
        return userservice.createuser(Usermodel);
    }

    @DeleteMapping("/admin/DeleteUser/{id}")
    public void deleteUser(@PathVariable int id) {
        userservice.DeleteUser(id);
    }

    /*@RequestMapping("/admin/EnabledUser{Enabled}")
     public void enabled(@PathVariable boolean id) {
         userservice.enabled(id);
     }
    @RequestMapping("/admin/EnabledUser")
    @ResponseBody
    public Boolean Enabled() {
        return Enabled();
    }*/
    //Updating Record
    @RequestMapping(value = "/admin/update", method = RequestMethod.PUT)
    public Usermodel updateUser(@RequestBody Usermodel userModel) {
        return userservice.updateUser(userModel);
    }

    @RequestMapping("admin/UpdateUserstatus/{id}")
    public Usermodel updateUserstatus(@PathVariable int id) {
        return userservice.updateUserstatus(id);
    }
    @GetMapping("admin/showallusers")
    public List<Usermodel> allUsers() {

        return userservice.findAll();
    }


}
