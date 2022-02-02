package com.mgh.testdemospringboot.service.impl;

import com.mgh.testdemospringboot.entity.Bank;
import com.mgh.testdemospringboot.mapper.BankMapper;
import com.mgh.testdemospringboot.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MGH
 * @create 2022-0125 3:58 下午
 */
@Service("bankServiceImpl")
public class BankServiceImpl implements BankService {
    @Autowired
    private BankMapper bankMapper;

    @Override
    public List<Bank> findAllBank() {
        return bankMapper.findAllBank();
    }

    @Override
    public int insertOne(Bank bank) {
        return bankMapper.insertOne(bank);
    }

    @Override
    public int deleteById(Integer id) {
        return bankMapper.deleteById(id);
    }
}
