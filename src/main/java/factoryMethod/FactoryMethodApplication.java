package factoryMethod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import strategy.Logger;

public class FactoryMethodApplication {

  public static void main(String[] args) throws IOException {

    Logger consoleLogger = LoggerFactory.createConsoleLogger();

    consoleLogger.log("Log to console logger");

    Path logFilePath = Paths.get("src/main/resources/log-factory.txt");

    File logFile;

    if(Files.notExists(logFilePath)) {
      logFile = Files.createFile(logFilePath).toFile();
    } else {
      logFile = logFilePath.toFile();
    }

    Logger fileLogger = LoggerFactory.createFileLogger(logFile);

    fileLogger.log("Log to file");
  }

}
