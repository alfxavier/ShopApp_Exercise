/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

/**
 *
 * @author opc
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tax = 0.2;
        int measurement = 6;
        double total = 0.0;

        System.out.println("Wecome to Duke Shop");

        Customer c1 = new Customer("Pink", 14);

        //c1.setName("Pink");
        //c1.setSize();
        //c1.setSize(measurement);
        System.out.println("Min Price "+ Clothing.MIN_PRICE);

        //Exercise 3-2
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        Clothing[] itens = {item1, item2, new Clothing("Green Scarf", 5.0, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};

        //double total = (item1.price + item2.price *2) * (1+tax);
//        System.out.println("Total price: "+total);
//        System.out.println("Item 1: "+item1.description +", Preço: " + item1.price + ", Tamanho: " + item1.size);
//        System.out.println("Item 2: "+item2.description +", Preço: " + item2.price + ", Tamanho: " + item2.size);
        c1.addItens(itens);

        //System.out.println("Item " + item.getDescription() + "," + item.getPrice() + "," + item.getSize()+","+c1.getTotalClouthingCost());
        
        System.out.println("Customer is " + c1.getName() + ", " + c1.getSize()+", "+c1.getTotalClouthingCost());
      
       
        for (Clothing item : c1.getItens()) {
            System.out.println("Itens " + item.getDescription());

        }
        // Practice 
        
        int average = 0;
        int count = 0;
        
        for (Clothing item : c1.getItens()){
            if (item.getSize().equals("L")){
                count++;
                average += item.getPrice();
                
            }
        }
        
        try {
            average = average / count;
            System.out.println("Average Price "+average+", Count "+ count);
        }catch (ArithmeticException e){
            System.out.println("Don't divide by 0");
        }
        
    }

}
