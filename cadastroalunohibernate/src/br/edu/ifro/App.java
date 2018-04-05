
package br.edu.ifro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
    // apenas ex
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        
        
        Aluno aluno1= new Aluno();
        aluno1.setNome("Fulano");
  
em.getTransaction().begin();
em.persist(aluno1);
em.getTransaction().commit();

//fimn do ex
        
        
        
        
        
        Parent root = FXMLLoader.load(getClass().getResource("telaprincipal.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
