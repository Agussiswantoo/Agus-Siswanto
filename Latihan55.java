/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan55;

/**
 *
 * @author ASUS VIVOBOOK
 */
public class Latihan55 {

   private final String manufaktur = "Iphone 11";
    private final String os = "IOS";
    private final String model = "Grand";
    private final int harga = 30000000;
    private final String androidKeyStore = "234ibfd3840fo";

    public void displayProduct() {
        System.out.println("Manufaktur: " + manufaktur);
        System.out.println("OS: " + os);
        System.out.println("Model: " + model);
        System.out.println("Harga: " + harga);
       String IosKeyStore = null;
        System.out.println("Ios Key Store: " + IosKeyStore);
    }

    public static void main(String[] args) {
        Latihan55 hp = new Latihan55();
        hp.displayProduct();
    }
}
    
    

