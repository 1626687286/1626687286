package com.example.demo.dao;

import com.example.demo.pojo.Alimony;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @Author Tang
 * @Date 2022/2/24 11:38
 * @注释
 */
@Mapper
@Repository
public interface AlimonyDao {

    //查询全部月度消费总额
    List<Alimony> alimonyList(Map<String,Object> map);

    //修改状态
    int updateStatus(Integer id);
}
