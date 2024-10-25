import java.util.Scanner;

class PrintItColor {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		boolean done = false;
		do {
			System.out.print(EMOJI + "-> ");
			String imput = scan.nextLine();
			if (imput.equals("q")) done = true;
			else PrintItColor(imput);
			System.out.println();
		} while (!done);
		scan.close();		
		System.out.println(EMOJI + "Buy!");
	}

	public static void PrintItColor(String imput) {
		for (int i = 0; i < imput.length(); i++) {
			char symbol = imput.charAt(i);
			String paintedSymbol;
			int colorCode = (int)(Math.random() * 3) + 1;
			switch (colorCode) {
				case 1 : paintedSymbol = BLUE + symbol + RESET; break;
				case 2 : paintedSymbol = GREEN + symbol + RESET; break;
				case 3 : paintedSymbol = YELLOW + symbol + RESET; break;
				default : paintedSymbol = RESET + symbol; break;
			}
			System.out.print(paintedSymbol);
		}
	}

	public static final String EMOJI = "<^'^> ";
	public static final String RESET = "\u001B[0m";
	public static final String BLUE = "\u001B[34m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
}

