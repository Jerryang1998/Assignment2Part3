package yuy75_SpotifyKnockoffJPA;

import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlbumUpdate {
	
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("yuy75_SpotifyKnockoffJPA");
		
		EntityManager emanager = emfactory.createEntityManager();
		
		emanager.getTransaction().begin();
		
		Album al = emanager.find(Album.class, "43530eb7-a65f-4776-8601-6ddc91260e42");
		al.setTitle("$%&*");
		
		emanager.persist(al);
		emanager.getTransaction().commit();
		
		emanager.close();
		emfactory.close();
	}

}
