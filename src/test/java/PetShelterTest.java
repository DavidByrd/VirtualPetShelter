import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class PetShelterTest {
	PetShelter underTest;
	AdoptablePet pet1;
	AdoptablePet pet2;

	@Before
	public void setUp() {
		underTest = new PetShelter();
		pet1 = new AdoptablePet("name", 10, 10, 10);
		pet2 = new AdoptablePet("name2", 20, 20, 20);

	}

	@Test
	public void shelterHasPets() {
		underTest = new PetShelter();
		pet1 = new AdoptablePet("name", 10, 10, 10);

	}

	@Test
	public void allowIntakeOfPet() {
		underTest = new PetShelter();
		underTest.add(pet1);
		AdoptablePet grabPet = underTest.findPet("name");
		assertThat(grabPet, is(pet1));

	}

	@Test
	public void allowIntakeOfTwoPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		Collection<AdoptablePet> allPets = underTest.getallPets();
//		assertThat(allPets, containsInAnyOrder(pet1,pet2));
		assertEquals(2,allPets.size());

	}
	
	@Test
	public void allowAdoptionOfPet() {
		underTest.add(pet1);
		underTest.add(pet2);
		Collection<AdoptablePet> allPets = underTest.getallPets();
	    assertThat(allPets, containsInAnyOrder(pet1,pet2));
	    underTest.adoptPet(pet1);
	    assertEquals(1,allPets.size());
		
		
	}
	
	@Test
	public void feedPets() {
		underTest = new PetShelter();
		
		
		
	}
	
	@Test
	public void petNames() {
	    underTest = new PetShelter();

	    AdoptablePet CrayCray = new AdoptablePet("Cray Cray", 0, 0, 0);
	    underTest.add(CrayCray);

	    AdoptablePet Bitey = new AdoptablePet("Bitey", 0, 0, 0);
	    underTest.add(Bitey);

	    AdoptablePet Demogorgon = new AdoptablePet("Demogorgon", 0, 0, 0);
	    underTest.add(Demogorgon);


	}
		
		
	}


