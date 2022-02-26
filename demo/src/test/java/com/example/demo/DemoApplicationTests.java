package com.example.demo;

import com.example.demo.pojo.Alimony;
import com.example.demo.pojo.params.AlimonyParams;
import com.example.demo.service.AlimonyService;
import com.example.demo.util.PageUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private AlimonyService alimonyService;

    /**
     * 测试查询接口
     */
    @Test
    void contextLoads() {
        PageUtil<Alimony> page = alimonyService.alimonyPage(new PageUtil<Alimony>(2,2), new AlimonyParams(null,null,null,null));
        for (Alimony alimony : page.getList()) {
            System.out.println(alimony);
        }
    }

    /**
     * 测试修改状态接口
     */
    @Test
    void test1(){
        alimonyService.updateStatus(2);
    }

}
