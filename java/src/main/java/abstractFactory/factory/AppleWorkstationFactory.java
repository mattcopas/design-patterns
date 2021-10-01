package abstractFactory.factory;

import abstractFactory.components.Keyboard;
import abstractFactory.components.Monitor;
import abstractFactory.components.Mouse;
import abstractFactory.components.OperatingSystem;
import abstractFactory.components.apple.AppleKeyboard;
import abstractFactory.components.apple.AppleMonitor;
import abstractFactory.components.apple.AppleMouse;
import abstractFactory.components.apple.AppleOperatingSystem;

public class AppleWorkstationFactory implements WorkstationFactory {

  @Override
  public Keyboard createKeyboard() {
    return new AppleKeyboard();
  }

  @Override
  public Mouse createMouse() {
    return new AppleMouse();
  }

  @Override
  public Monitor createMonitor() {
    return new AppleMonitor();
  }

  @Override
  public OperatingSystem createOperatingSystem() {
    return new AppleOperatingSystem();
  }
}
