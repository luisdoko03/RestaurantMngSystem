
package DAL;


import java.sql.Connection;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class EntMngClass {
    
  public EntMngClass(){
   }  
@PersistenceContext
   EntityManager em = Persistence.createEntityManagerFactory("RestaurantMngSystemPU").createEntityManager();

  
  public Connection Con(){  
    
      em.getTransaction().begin();
       java.sql.Connection connection = em.unwrap(java.sql.Connection.class);
       em.getTransaction().commit();
       return connection;
  }

    
  
  
}
