package factoryMethod;

import java.io.File;
import strategy.ConsoleLogger;
import strategy.FileLogger;
import strategy.Logger;

public class LoggerFactory {

  public static Logger createFileLogger(File file) {
    return new FileLogger(file);
  }

  public static Logger createConsoleLogger() {
    return new ConsoleLogger();
  }

}
