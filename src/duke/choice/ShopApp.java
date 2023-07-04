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

        Customer c1 = new Customer();

        c1.setName("Pink");
        //c1.setSize();
        c1.setSize(measurement);

        System.out.println("Customer is " + c1.getName() + " " + c1.getSize());

        //Exercise 3-2
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        Clothing[] itens = {item1, item2, new Clothing(), new Clothing()};

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        itens[2].setDescription("Green Scarf");
        itens[2].setPrice(5.0);
        itens[2].setSize("S");

        itens[3].setDescription("Blue T-Shirt");
        itens[3].setPrice(10.5);
        itens[3].setSize("S");

        //double total = (item1.price + item2.price *2) * (1+tax);
//        System.out.println("Total price: "+total);
//        System.out.println("Item 1: "+item1.description +", Preço: " + item1.price + ", Tamanho: " + item1.size);
//        System.out.println("Item 2: "+item2.description +", Preço: " + item2.price + ", Tamanho: " + item2.size);
        c1.addItens(itens);

        //System.out.println("Item " + item.getDescription() + "," + item.getPrice() + "," + item.getSize()+","+c1.getTotalClouthingCost());
        
        for (Clothing item : c1.getItens()) {
            System.out.println("Itens " + item.getDescription());

        }
    }

}
