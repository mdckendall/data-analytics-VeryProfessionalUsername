import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    Scanner input = new Scanner(System.in);
    int caseNumber = 0;

    while(caseNumber != 5){
      
      System.out.println("Press 1 to learn about salary.\nPress 2 to learn about the job.");
      System.out.println("Press 3 to learn about demand.\nPress 4 to view current students.\nPress 5 to quit.");

      caseNumber = input.nextInt();
      
      switch(caseNumber){
        case 1: System.out.println("$98,345 average salary in South Florida!");
        break;
        case 2: System.out.println("US News - 100 Best Jobs!");
        break;
        case 3: System.out.println("Top 10 Forbes In-Demand Jobs!");
        break;
        case 4: System.out.println("$98,345 average salary in South Florida!");
        break;
      }
    }
	}
}