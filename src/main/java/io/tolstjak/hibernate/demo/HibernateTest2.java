package io.tolstjak.hibernate.demo;

import io.tolstjak.hibernate.dto.User1;
import io.tolstjak.hibernate.dto.User2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest2 {

    public static void main(String[] args) {
        User2 user = new User2();
        user.setId(2);
        user.setName("Zangiev");

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }
}
