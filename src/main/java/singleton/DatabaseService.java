package singleton;

import java.util.List;

public class DatabaseService {

  public List<String> getData() {
    return List.of("Data 1...", "Data 2...", "Data 3...");
  }
}
