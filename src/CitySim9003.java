import java.util.Random;

public class CitySim9003 {

	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("Usage: java CitySim9003 <seed>");
			System.exit(1);
		}
		int seed = 0;
		try {
			seed = Integer.parseInt(args[0]);
		}
		catch(NumberFormatException e) {
			System.out.println("Please enter integer seed!");
			System.exit(1);
		}
		Random rand = new Random(seed);
		City city = new City(rand);
		Driver d;
		String[] move= new String[3];
		//begin the simulation of 5 drivers
		for(int i = 1; i <= 5; i++){
			d = city.initDriver();
			while(d.inTown()) {
				move = city.moveDriver();
				System.out.printf("\nDriver %d heading from %s to %s via %s", i, move[0], move[1], move[2]);
			}
			if(d.getLocation().toString().equals("CLE"))
				System.out.printf("\nDriver %d has gone to Cleveland!", i);
			if(d.getLocation().toString().equals("PHI"))
				System.out.printf("\nDriver %d has gone to Philadelphia!", i);
			System.out.printf("\nDriver %d got %d cup(s) of coffee.", i, d.getNumCoffee());
			System.out.println("\n-------------------------------------------------");
		}
	}

}
