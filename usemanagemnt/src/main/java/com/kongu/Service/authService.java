package com.kongu.Service;

import com.kongu.model.Userprofile;
import com.kongu.repo.authrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class authService {
    @Autowired
    authrepo authrepo;
    public Userprofile showUser(Userprofile Userprofile){
        return authrepo.save(Userprofile);
    }


}
