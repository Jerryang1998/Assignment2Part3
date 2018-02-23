package yuy75_SpotifyKnockoffJPA;

import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ArtistCreate {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("yuy75_SpotifyKnockoffJPA");
		
		EntityManager emanager = emfactory.createEntityManager();
		
		emanager.getTransaction().begin();
		
		Artist ar = new Artist();
		ar.setArtistID(UUID.randomUUID().toString());
		ar.setFirstName("Adam");
		ar.setLastName("Levine");
		ar.setBandName("Maroon 5");
		
		emanager.persist(ar);
		emanager.getTransaction().commit();
		
		emanager.close();
		emfactory.close();

	}

}
