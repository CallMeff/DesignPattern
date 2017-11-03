package com.feng.singleton; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 
* LazyDLSingleBean Tester. 
* 
* @author tfly
* @since 11/03/2017
* @version 1.0 
*/ 
public class LazyDLSingleBeanTest { 

    private DateFormat df = new SimpleDateFormat("YYYY/MM/dd hh:mm:ss");
    private Date startDate;
    private Date endDate;

    @Before
    public void before() throws Exception {
        startDate = new Date();
        System.out.println("Start Time:" + df.format(startDate));
    }

    @After
    public void after() throws Exception {
        endDate = new Date();
        System.out.println("End Time:" + df.format(endDate));
        System.out.println("During Cast:" + (endDate.getTime() - startDate.getTime()) + "ms");
    }

    @Test
    public void testGetLazySingleBean() throws Exception {
        for (int i = 0; i < 10000; i++) {
            LazyDLSingleBean.getLazySingleBean();
        }
    } 


} 
