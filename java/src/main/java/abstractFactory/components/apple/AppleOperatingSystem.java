package abstractFactory.components.apple;

import abstractFactory.components.OperatingSystem;

public class AppleOperatingSystem implements OperatingSystem {

  @Override
  public String getName() {
    return "Mac OSX";
  }
}
