package abstractFactory.components.microsoft;

import abstractFactory.components.Keyboard;

public class MicrosoftKeyboard implements Keyboard {

  @Override
  public String getName() {
    return "Microsoft Keyboard";
  }
}
