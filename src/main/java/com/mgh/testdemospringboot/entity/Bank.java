package com.mgh.testdemospringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author MGH
 * @create 2022-0125 3:47 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Bank {
    private Integer id;
    private String name;
    private Double money;
}
