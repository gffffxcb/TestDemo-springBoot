package com.mgh.testdemospringboot.controller;

import com.mgh.testdemospringboot.entity.Bank;
import com.mgh.testdemospringboot.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author MGH
 * @create 2022-0125 3:56 下午
 */
@RestController("bankController")
@RequestMapping("/bank")
public class BankController {
    @Autowired
    private BankService bankService;
    @GetMapping("/findAll")
    public List<Bank> findAll(){
        List<Bank> allBank = bankService.findAllBank();
        System.out.println(allBank);
        return allBank;
    }
    @PostMapping("/saveOne")
    public String saveOne(Bank bank){
        System.out.println(bank);
        int i = bankService.insertOne(bank);
        if (i==1){
            return "添加成功";
        }else{
            return "添加失败";
        }
    }
    @DeleteMapping("/deleteOne")
    public String deleteOne(Integer id, HttpSession session){
        int i = bankService.deleteById(id);
        if (i>=1){
            return "删除成功！";
        }else{
            return "删除失败！";
        }
    }
}
