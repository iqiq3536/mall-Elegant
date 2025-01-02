package com.example.mallxx.mapper;

import com.example.mallxx.entity.Seller;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SellerMapper {
    @Select("select * from seller")
    List<Seller> findAll();

}
