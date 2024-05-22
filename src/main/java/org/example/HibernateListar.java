package org.example;

import jakarta.persistence.EntityManager;

import java.util.List;
//
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HibernateListar {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        List<Cliente> clientes = em.createQuery("select c from Cliente c",
                Cliente.class).getResultList();
        clientes.forEach(System.out::println);
        em.close();
    }
}