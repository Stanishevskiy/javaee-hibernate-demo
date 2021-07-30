package io.tolstjak.hibernate.demo;

import io.tolstjak.hibernate.dto.User3;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest3 {

    public static void main(String[] args) {
        User3 user = new User3();
        user.setId(3);
        user.setName("Kay");

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }
}
