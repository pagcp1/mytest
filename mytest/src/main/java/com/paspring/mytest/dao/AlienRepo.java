package com.paspring.mytest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.paspring.mytest.model.Alien;



public interface AlienRepo extends JpaRepository<Alien,Integer>

{
 
}
