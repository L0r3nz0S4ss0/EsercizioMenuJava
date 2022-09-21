import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean isParsed = false;
        int n = 0;
        do{ 
            do{
                //Menu declaration
                System.out.println("Inserisci un opzione");
                System.out.println("0: Esci dal programma");
                System.out.println("1: Stampa hello world");
                System.out.println("2: Stampa dei numeri da 1 a 10");

                //Scanner instantiation
                Scanner sc = new Scanner(System.in);

                //Variable Input
                System.out.println("Inserisci la scelta: ");
                String s = sc.nextLine();

                //Parsing the string in to an integer
                try{
                    n = Integer.parseInt(s);
                    isParsed = true;
                }
                //If the string is not an integer give an error message
                catch(NumberFormatException nfe){
                    System.out.println("NON E' STATO INSERITO UN VALORE NUMERICO");
                    isParsed = false;
                }
            }while(!isParsed);
            //Variable control
            switch(n){
                case 0:
                    System.out.println("Grazie per aver usato il programma");
                return;
            
                case 1:
                    System.out.println("Hello world");
                break;
            
                case 2:
                    for(int i = 0; i < 10; i++){
                        System.out.println(i);
                    }
                break;
            
                default:
                    System.out.println("ERRORE, VALORE NON IN RANGE");
            }
        }while(true);
    }
}
