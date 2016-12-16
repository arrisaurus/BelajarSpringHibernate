/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.springhibernate;

import com.belajar.springhibernate.service.MahasiswaService;
import com.belajar.springhibernate.view.MahasiswaView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author muhamad.fatah
 */
public class App {

    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring-configuration.xml");
        new MahasiswaView().setVisible(true);
    }

    public static MahasiswaService getMahasiswaService() {
        return (MahasiswaService) applicationContext.getBean("MahasiswaService");
    }

    /*Test Commit di Branch crazy-idea*/

    /*Test Commit menggunakan cmd 2 di Branch crazy-idea*/
}
