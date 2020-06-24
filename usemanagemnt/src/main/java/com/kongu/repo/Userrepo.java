package com.kongu.repo;

import com.kongu.model.Usermodel;
import org.springframework.data.repository.CrudRepository;

public interface Userrepo extends CrudRepository<Usermodel,Integer>
{

}
