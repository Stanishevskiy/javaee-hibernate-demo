package io.tolstjak.hibernate.demo;

import io.tolstjak.hibernate.dto.User1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest1 {

    public static void main(String[] args) {
        User1 user = new User1();
        user.setId(1);
        user.setName("Boris Britva");

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }
}
