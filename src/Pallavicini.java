import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class Pallavicini
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				//aggiungere, togliere casi a seconda delle proprie scelte
				case 1:
					es1();
				break;
				case 2:
					//Inserire metodo statico
				break;
				case 3:
					//Inserire metodo statico
				break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		// Modificare il menù secondo le proprie scelte
		System.out.println("1 - Es n. * - Titolo es. *");
		System.out.println("2 - Es n. * - Titolo es. *");
		
	}

	static void es1()
	{
		double [] array1 = new double [6];
		double [] array2 = new double [3];
		int k=0;
		int h=1;
		//dichiaro variabili e array, k e h mi serviranno per indicare la posizione del secondo array
		for(int i=0; i<array1.length; i++)
			{
				System.out.println("inserisci 6 valori" + i);
				array1[i] =in.nextDouble();
			}
		//faccio il ciclo per dare 6 valori al primo array
		for(int j=0; j<array2.length; j++)
			{
			array2[j]=(array1[k]*array1[h]);
			k+=2;
			h+=2;
			System.out.println(array2[j]);
		//con questo ciclo faccio avazare la posizione di array2 e all'interno di esso
		//eseguo la moltiplicazione e incremento di 2 h e k in modo da passare alla prossima coppia da moltiplicare
			}
	}

}

