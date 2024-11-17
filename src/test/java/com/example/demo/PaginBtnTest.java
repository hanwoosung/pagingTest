package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PaginBtnTest {

    @Test
    public void pagingTest(){
        PagingBtn pgBtn = new PagingBtn(99,2);
        assertTrue(pgBtn.getTotalPage() == 10);
        assertTrue(pgBtn.getStartPage() == 1);
        assertTrue(pgBtn.getEndPage() == 10);
    }

    @Test
    public void pagingTest2(){
        PagingBtn pgBtn = new PagingBtn(255,23);
        assertTrue(pgBtn.getTotalPage() == 26);
        assertTrue(pgBtn.getStartPage() == 21);
        assertTrue(pgBtn.getEndPage() == 26);
        assertTrue(pgBtn.isNextBtn() == false);
    }


    @Test
    public void pagingTest3(){
        PagingBtn pgBtn = new PagingBtn(255,17);
        assertTrue(pgBtn.getTotalPage() == 26);
        assertTrue(pgBtn.getStartPage() == 11);
        assertTrue(pgBtn.getEndPage() == 20);
        assertTrue(pgBtn.isNextBtn() == true);
        assertTrue(pgBtn.isPrevBtn() == true);
    }

    @Test
    public void pagingTest4(){
        PagingBtn pgBtn = new PagingBtn(255,1);
        assertTrue(pgBtn.getTotalPage() == 26);
        assertTrue(pgBtn.getStartPage() == 1);
        assertTrue(pgBtn.getEndPage() == 10);
        assertTrue(pgBtn.isNextBtn() == true);
        assertTrue(pgBtn.isPrevBtn() == false);
    }


}
