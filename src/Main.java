
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Santa Claus has come! Toys will be delivered to well-behaved boys and girls!");
        System.out.println("****************************************************************************");
        Random random = new Random();
        Queue<String> toyQueue = new LinkedList<>();
        toyQueue.offer("Jonny");
        toyQueue.offer("William");
        toyQueue.offer("Ivan");
        toyQueue.offer("Ferec");
        toyQueue.offer("Petek");
        toyQueue.offer("Jillian");
        toyQueue.offer("Rufad");
        toyQueue.offer("Sonya");
        toyQueue.offer("Vijayendra");
        toyQueue.offer("Chao");
        
        int toyAmount = 1 + random.nextInt(10);
        System.out.println("Santa has brought " + toyAmount + " toys. Only well-behaved will have those toys..");
        Thread.sleep(3000);
        while (toyAmount != 0) {
            System.out.println(toyQueue.poll() + " has received a toy. ");
            toyAmount--;
            Thread.sleep(1000);
        }
        System.out.println("All toys are over. Be a well-behaved kid next year to get your toy!");
    }
}
