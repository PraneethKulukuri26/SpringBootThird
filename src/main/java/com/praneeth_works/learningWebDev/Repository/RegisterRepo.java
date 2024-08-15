package com.praneeth_works.learningWebDev.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.praneeth_works.learningWebDev.Entity.RegisterEntity;

@Repository
public interface RegisterRepo extends JpaRepository<RegisterEntity,Integer> {
	
}
