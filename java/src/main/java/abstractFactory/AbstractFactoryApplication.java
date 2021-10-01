package abstractFactory;

import abstractFactory.factory.AppleWorkstationFactory;
import abstractFactory.factory.WorkstationFactory;

public class AbstractFactoryApplication {

  public static void main(String[] args) {
    WorkstationFactory appleWorkstationFactory = new AppleWorkstationFactory();

    System.out.println("Apple keyboard: " + appleWorkstationFactory.createKeyboard().getName());
    System.out.println("Apple Monitor: " + appleWorkstationFactory.createMonitor().getName());
    System.out.println("Apple mouse: " + appleWorkstationFactory.createMouse().getName());
    System.out.println("Apple operating system: " + appleWorkstationFactory.createOperatingSystem().getName());
  }

}
