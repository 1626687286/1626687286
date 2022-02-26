package com.example.demo.pojo.params;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version 1.0
 * @Author Tang
 * @Date 2022/2/25 10:19
 * @注释
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlimonyParams {
    //姓名
    private String name;
    //缴费日期
    private String payTime;
    //缴费月份
    private Integer month;
    //状态 -1未缴费 1已缴费
    private Integer status;

}
