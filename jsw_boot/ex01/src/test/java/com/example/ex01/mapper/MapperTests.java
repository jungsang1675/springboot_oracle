package com.example.ex01.mapper;

import com.example.ex01.domain.ProductVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MapperTests {
    @Autowired
    private TimeMapper timeMapper;
    @Autowired
    private ProductMapper productMapper;
    @Test
    public void getTimeTest(){
        log.info((timeMapper.getTime()));
    }

    @Test
    public void insertTest(){
        ProductVO productVO = new ProductVO();
        productVO.setProductName("감자");
        productVO.setProductPrice(1500L);
        productVO.setProductStock(400L);
        productMapper.insert(productVO);
    }

    @Test
    public void selectTest(){
        ProductVO productVO = productMapper.select(1L);
        log.info(productVO.toString());
    }
}
