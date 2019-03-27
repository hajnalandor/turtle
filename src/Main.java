import java.util.Scanner;

public class Main {
    public static void main (String... args) {
        System.out.println("CSA BAZZEG");
        Scanner scanner = new Scanner(System.in);
         Map map = new Map(10,10);
        String text = scanner.nextLine();
        while (!"KILEP".equals(text)) {
           Turtle turtle =  map.getTurtle();
            map.doCommand(text);
            map.drawMap();
            System.out.println(turtle.getX()+"ASD"+turtle.getY());

            text = scanner.nextLine();
        }
        scanner.close();
    }
}
