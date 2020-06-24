package com.kongu.Service;

import com.kongu.model.Usermodel;
import com.kongu.repo.Userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Userservice {
    @Autowired
    Userrepo userrepo;
    public Usermodel createuser(Usermodel usermodel){
        return userrepo.save(usermodel);
    }

    public void  DeleteUser(int id){
        userrepo.deleteById(id);

    }
    /*public int enabled(boolean id){
         return userrepo.save(id);

    }
    public boolean userEnabled(Object Enabled) {
        if (this == Enabled) {
            return true;
        }
    }*/
    public Usermodel updateUser(Usermodel userModel) {
        return userrepo.save(userModel);
    }
    public  Usermodel updateUserstatus(int id){
        Usermodel usermodel=userrepo.findById(id).get();
        if (usermodel.isEnabled()){
            usermodel.setEnabled(false);
        }
        else {
            usermodel.setEnabled(true);
        }
       return userrepo.save(usermodel);

    }
    public List< Usermodel> findAll() {
        return (List<Usermodel>) userrepo.findAll();
    }
}
