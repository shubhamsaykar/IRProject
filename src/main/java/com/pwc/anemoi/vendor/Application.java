package com.pwc.anemoi.vendor;

import dbConnection.MSSQLServerInstance;

//import java.io.IOException;
//import java.util.Date;
//
//import com.pwc.anemoi.vendor.roles.serviceImpl.SmsClass;

import io.micronaut.runtime.Micronaut;

public class Application {
    public static void main(String[] args) {
    	
        Micronaut.run(Application.class, args);
        String dataBaseName="vendor";
        System.out.println("creating the database*********"+dataBaseName);
        MSSQLServerInstance.createDataBases(dataBaseName);
//        try {
//			SmsClass.sendSms("hello this is my message "+ new Date().toLocaleString(), "7499186835");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
    }
}
