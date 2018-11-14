package com.web.dao;

import com.web.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsDao extends JpaRepository<Goods,Integer> {
}
