package com.kongu.repo;

import com.kongu.model.Userprofile;
import org.springframework.data.repository.CrudRepository;

public interface authrepo extends CrudRepository<Userprofile,Integer> {

}
