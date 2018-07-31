package com.jpa.repository;

import com.jpa.vo.Poetry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PoetryRepository extends JpaRepository<Poetry,Integer>{

}
