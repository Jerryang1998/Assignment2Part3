package yuy75_SpotifyKnockoffJPA;

import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteArtist {
	
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("yuy75_SpotifyKnockoffJPA");
		
		EntityManager emanager = emfactory.createEntityManager();
		
		emanager.getTransaction().begin();
		
		Artist ar = emanager.find(Artist.class, "45c386ce-c368-49f7-bff9-e585b4a66afd");
		emanager.remove(ar);
		
		emanager.getTransaction().commit();
		
		emanager.close();
		emfactory.close();

	}

}
