package com.mgh.testdemospringboot.service;

import com.mgh.testdemospringboot.entity.Bank;

import java.util.List;

/**
 * @author MGH
 * @create 2022-0125 3:57 下午
 */
public interface BankService {
    //查询所有
    List<Bank> findAllBank();
    //新增一条
    int insertOne(Bank bank);
    //删除一条
    int deleteById(Integer id);
}
