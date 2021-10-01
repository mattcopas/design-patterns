package abstractFactory.components.microsoft;

import abstractFactory.components.Monitor;

public class MicrosoftMonitor implements Monitor {

  @Override
  public String getName() {
    return "Microsoft Monitor";
  }
}
