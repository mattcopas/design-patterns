package abstractFactory.factory;

import abstractFactory.components.Keyboard;
import abstractFactory.components.Monitor;
import abstractFactory.components.Mouse;
import abstractFactory.components.OperatingSystem;

public interface WorkstationFactory {

  Keyboard createKeyboard();
  Mouse createMouse();
  Monitor createMonitor();
  OperatingSystem createOperatingSystem();
}
