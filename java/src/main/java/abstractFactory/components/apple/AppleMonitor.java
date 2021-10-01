package abstractFactory.components.apple;

import abstractFactory.components.Monitor;

public class AppleMonitor implements Monitor {

  @Override
  public String getName() {
    return "Apple Monitor";
  }
}
