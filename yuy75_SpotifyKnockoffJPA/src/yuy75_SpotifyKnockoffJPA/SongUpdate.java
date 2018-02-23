package yuy75_SpotifyKnockoffJPA;

import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SongUpdate {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("yuy75_SpotifyKnockoffJPA");
		
		EntityManager emanager = emfactory.createEntityManager();
		
		emanager.getTransaction().begin();
		
		Song s = emanager.find(Song.class, "32454afc-cd52-4af5-881d-c6f119c26cd0");
		s.setTitle("DATABASE SONGJPA");
		
		emanager.persist(s);
		emanager.getTransaction().commit();
		
		emanager.close();
		emfactory.close();
		
	}

}
