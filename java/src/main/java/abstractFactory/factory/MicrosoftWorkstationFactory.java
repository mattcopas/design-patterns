package abstractFactory.factory;

import abstractFactory.components.Keyboard;
import abstractFactory.components.Monitor;
import abstractFactory.components.Mouse;
import abstractFactory.components.OperatingSystem;
import abstractFactory.components.microsoft.MicrosoftKeyboard;
import abstractFactory.components.microsoft.MicrosoftMonitor;
import abstractFactory.components.microsoft.MicrosoftMouse;
import abstractFactory.components.microsoft.MicrosoftOperatingSystem;

public class MicrosoftWorkstationFactory implements WorkstationFactory {

  @Override
  public Keyboard createKeyboard() {
    return new MicrosoftKeyboard();
  }

  @Override
  public Mouse createMouse() {
    return new MicrosoftMouse();
  }

  @Override
  public Monitor createMonitor() {
    return new MicrosoftMonitor();
  }

  @Override
  public OperatingSystem createOperatingSystem() {
    return new MicrosoftOperatingSystem();
  }
}
