/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NonAcc_Modifier;

/**
 *
 * @author windows
 */

final class Vehicle1 {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class Final0 extends Vehicle1 {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    Final0 myFastCar = new Final0();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}



