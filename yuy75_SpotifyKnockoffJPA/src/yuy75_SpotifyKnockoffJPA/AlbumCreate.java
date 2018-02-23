package yuy75_SpotifyKnockoffJPA;

import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlbumCreate {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("yuy75_SpotifyKnockoffJPA");
		
		EntityManager emanager = emfactory.createEntityManager();
		
		emanager.getTransaction().begin();
		
		Album al = new Album();
		al.setAlbumID(UUID.randomUUID().toString());
		al.setTitle("!@#$");
		al.setReleaseDate("2018_02-22");
		al.setCoverImagePath("");
		al.setRecordingCompany("");
		al.setNumberOfTracks(7);
		al.setPmrcRating("R");
		al.setLength(700);
		
		emanager.persist(al);
		emanager.getTransaction().commit();
		
		emanager.close();
		emfactory.close();
	}

}
