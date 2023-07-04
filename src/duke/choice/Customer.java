/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author opc
 */
public class Customer {

    private String name;
    private String size;

    private Clothing[] itens;

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }

    public void addItens(Clothing[] someItens) {
        itens = someItens;
    }

    public Clothing[] getItens() {
        return itens;
    }

    public double getTotalClouthingCost() {

        double total = 0.0;

        for (Clothing item : itens) {
            //if (c1.getSize().equals(item.getSize())) {
            total = +item.getPrice();
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {

        switch (measurement) {
            case 3, 2, 1:
                setSize("S");
                break;
            case 4, 5, 6:
                setSize("M");
                break;
            case 7, 8, 9:
                setSize("L");
                break;
            default:
                setSize("XL");
        }
    }

}
