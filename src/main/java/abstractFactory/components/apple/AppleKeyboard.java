package abstractFactory.components.apple;

import abstractFactory.components.Keyboard;

public class AppleKeyboard implements Keyboard {

  @Override
  public String getName() {
    return "Apple Keyboard";
  }
}
