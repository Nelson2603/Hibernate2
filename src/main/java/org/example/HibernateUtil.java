package org.example;

import org.example.entity.Auto;
import org.example.entity.Engine;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Auto.class)
                    .addAnnotatedClass(Engine.class)//добавляем класс в конфигурацию
                    .buildSessionFactory();
        }
        return sessionFactory;
    }
}
