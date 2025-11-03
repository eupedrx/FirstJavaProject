package org.example.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {

    private static EntityManagerFactory emf;

    static {
        try {
            // O nome aqui deve ser o mesmo do persistence.xml
            emf = Persistence.createEntityManagerFactory("CursoIngles");
        } catch (Exception e) {
            System.err.println("Erro ao criar EntityManagerFactory!");
            e.printStackTrace();
        }
    }

    public static EntityManager getEntityManager() {
        if (emf == null) {
            throw new IllegalStateException("EntityManagerFactory não foi inicializado!");
        }
        return emf.createEntityManager();
    }

    public static void closeEntityManagerFactory() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}
