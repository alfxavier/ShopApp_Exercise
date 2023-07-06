/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

//import java.util.Arrays;
import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.UnknownHostException;
import java.net.InetAddress;

/**
 *
 * @author opc
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        double tax = 0.2;
//        int measurement = 6;
//        double total = 0.0;
//
       System.out.println("Wecome to Duke Shop");
//
//        Customer c1 = new Customer("Pink", 14);
//
//        //c1.setName("Pink");
//        //c1.setSize();
//        //c1.setSize(measurement);
//        System.out.println("Min Price "+ Clothing.MIN_PRICE);

        //Exercise 3-2
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5.0, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");     
        

        Clothing[] items = {item1, item2, item3, item4};
       //System.out.println(teste);
//        double list1[] = {10.0, 50.5, 60.8, 85,5};
//        System.out.println("A lista é :"+list1);
        
        try{
            ItemList list = new ItemList(items);
            
            Routing routing = Routing.builder().get("/items", list).build();
            
            ServerConfiguration config = ServerConfiguration.builder().bindAddress(InetAddress.getLocalHost()).port(8888).build();
            
            WebServer ws = WebServer.create(config, routing);
            
            ws.start();
        } catch (UnknownHostException ex){
            ex.printStackTrace();
        }

        //double total = (item1.price + item2.price *2) * (1+tax);
//        System.out.println("Total price: "+total);
//        System.out.println("Item 1: "+item1.description +", Preço: " + item1.price + ", Tamanho: " + item1.size);
//        System.out.println("Item 2: "+item2.description +", Preço: " + item2.price + ", Tamanho: " + item2.size);
//        c1.addItems(items);
//
//        //System.out.println("Item " + item.getDescription() + "," + item.getPrice() + "," + item.getSize()+","+c1.getTotalClouthingCost());
//        
//        System.out.println("Customer is " + c1.getName() + ", " + c1.getSize()+", "+c1.getTotalClouthingCost());
//      
//        
//        for (Clothing item : c1.getItems()) {
//            System.out.println("Item output: "+ item);
//
//        }
//        // Practice 
//        
//        int average = 0;
//        int count = 0;
//        
//        for (Clothing item : c1.getItems()){
//            if (item.getSize().equals("L")){
//                count++;
//                average += item.getPrice();
//                
//            }
//        }
//        
//        try {
//            average = average / count;
//            System.out.println("Average Price "+average+", Count "+ count);
//        }catch (ArithmeticException e){
//            System.out.println("Don't divide by 0");
//        }
//        
//        Arrays.sort(c1.getItems());
//        for (Clothing item : c1.getItems()) {
//            System.out.println("Item output: "+ item);
//
//        }
        
    }

}
