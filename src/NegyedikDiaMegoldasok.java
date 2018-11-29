
public class NegyedikDiaMegoldasok {

	public static void main(String[] args) {

		// 1. Feladat: megadott paratméterek kiírása
		
		System.out.println("1.Feladat \n a megadott paraméterek a következők:");
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		} else
			System.err.println("Nem adtál meg paramétert!");

		// 2. Feladat: 1-20 közti páros számok kiírása egymás mellé
		
		System.out.println("\n" + "2.Feladat:");

		for (int i = 1; i < 21; i++) {
			if (i % 2 == 0)
				System.out.print(i + ", ");
		}

		// 3. Feladat: paraméterként megadott két szám közé eső 3-mal osztható számok
		
		System.out.println("\n" + "3.Feladat \n a két megadott paraméter közti számok melyek 3-al oszthatók:");
		
		if(args.length>=2)
			{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			for (int i = x; i <= y; i++)
				{
				if (i % 3 == 0)
				System.out.print(i + ", ");
				}
			}
		else System.err.println("Nem adtál meg  két paramétert!");
		
			
		}
		
		

	}


