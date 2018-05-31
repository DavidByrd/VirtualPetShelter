
public class AdoptablePet {
	
	private String pet;
	private String adoptablePet;
	
	public static int hunger;
	public static int thirst;
	public static int boredom;
	public static String name;

	public AdoptablePet(String string, int hunger, int thirst, int boredom) {
		this.adoptablePet = adoptablePet; { 
	
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		}
	}
		
	public static  void getFeed() {
			
			hunger -= 3;
			thirst += 1;
			boredom += 1;
			System.out.println(name + " has been fed");
		System.out.println("hunger: " + hunger + " energy: " + thirst + " happy: " + boredom);	
		}	
		
		
	public static void getPlay() {
			
			hunger += 2;
			thirst -= 1;
			boredom += 3;
			System.out.println(name + " plays with you");
			System.out.println("hunger: " + hunger + " energy: " + thirst + " happy: " + boredom);	
			
		}
	public static void getNap() {
	
		hunger += 2;
		thirst += 5;
		boredom -= 1;
		System.out.println(name + " has taken a nap");
		System.out.println("hunger: " + hunger + " energy: " + thirst + " happy: " + boredom);
}
	
	public static String petName(String name) {
		return name; 
		
		

		  
	}
	
	public static void tick( ) {
		
		hunger += 1;
		thirst -= 1;
		boredom -= 1;
		System.out.println("Tick tock, tick tock,");
		System.out.println("hunger: " + hunger + " energy: " + thirst + " happy: " + boredom);
		
	}
	
	public static boolean death(){
		if (hunger > 15) {
			System.out.println( name +" has starved");
			System.out.println("Game Over");
			return false;
			
		}
		if (thirst > 15) {
			System.out.println(name +" sufferd dehydration and died");
			System.out.println("Game Over");
		return false;
		}
		if(boredom < 1) {
			
			System.out.println(name + " has jumped off a cliff.");
			System.out.println("Game Over");
			return false;
		}
		return true;
		
	}

//	public AdoptablePet(String adoptablePet, int hunger, int thirst, int boredom) {
//		this.adoptablePet = adoptablePet;
//		
//	}



	public String getAdoptablePet() {
		
		return adoptablePet;
	}
	
	

}
