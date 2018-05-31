import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PetShelter {

	Map<String, AdoptablePet> pets = new HashMap<>();

	public void add(AdoptablePet pet) {
		
		

	    AdoptablePet CrayCray = new AdoptablePet("Cray Cray", 0, 0, 0);
	    pets.put(pet.getAdoptablePet(),CrayCray);

	    AdoptablePet Bitey = new AdoptablePet("Bitey", 0, 0, 0);
	    pets.put(pet.getAdoptablePet(), Bitey);

	    AdoptablePet Demogorgon = new AdoptablePet("Demogorgon", 0, 0, 0);
	    pets.put(pet.getAdoptablePet(),Demogorgon);

	}

	public Collection<AdoptablePet> getallPets() {

		return pets.values();
	}

	public AdoptablePet findPet(String petName) {

		return pets.get(petName);
	}

	public void adoptPet(AdoptablePet pet) {
		for(int p = pets.size() - 1; p >= 0; p--) {
//		if(pet.findPet(null).equals(pet)) {
			if(pets.get(p).getAdoptablePet().equals(pet)) {
			pets.remove(p);
			
		}
			
		}
		// TODO Auto-generated method stub
		
	}

}
