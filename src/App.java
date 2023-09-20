import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
        try (Scanner tangentbord = new Scanner(System.in)) {
            System.out.println("skriv in din text:");
            String text = tangentbord.nextLine();
            int antal_bokstäver = text.length();
            System.out.println("Du skrev " +antal_bokstäver+ " bokstäver ");
            tangentbord.nextLine();

            System.out.println("skriv din bokstav: ");
            String tecken = tangentbord.nextLine();
            int plats = text.indexOf(tecken);
            plats = plats +1;
            System.out.println("din bokstav ligger på plats " +plats);

           System.out.print("ange startplats:");
           int startp= tangentbord.nextInt();
           tangentbord.nextLine();
           System.out.print("aneg slutplats: ");
           int steg_fram= tangentbord.nextInt();
           tangentbord.nextLine();
           String sträng1 = text.substring(startp, steg_fram);
           System.out.println(sträng1);
           
            int startplats = 0;
            int slutplats = text.length()-1;
            String del_sträng = text.substring(startplats,slutplats);
            System.out.print(del_sträng);

            tangentbord.nextLine();
            System.out.println("skriv din text som du vill veta är sant eller falskt: ");
            String sant_text =tangentbord.nextLine();             
             boolean b = text.contains(sant_text);
             
            System.out.print( b);
            tangentbord.nextLine();
            String nytext = text.replace( "Pigg", "Anka");
            System.out.print(nytext);


            
            
          
            
             

            
        }
    }
}
