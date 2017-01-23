/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolandopalermo.example.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author Rolando
 */
public class MyBatisConnectionFactory {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {

            String resource = "mybatis-config.xml";
            Reader reader = Resources.getResourceAsReader(resource);

            if (sqlSessionFactory == null) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public static SqlSessionFactory getSqlSessionFactory() {

        return sqlSessionFactory;
    }
}