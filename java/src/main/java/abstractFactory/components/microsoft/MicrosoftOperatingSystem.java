package abstractFactory.components.microsoft;

import abstractFactory.components.OperatingSystem;

public class MicrosoftOperatingSystem implements OperatingSystem {

  @Override
  public String getName() {
    return "Windows";
  }
}
