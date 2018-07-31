package com.jpa.repository;

import com.jpa.vo.Wife;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WifeRepository extends JpaRepository<Wife,Integer>{



}
