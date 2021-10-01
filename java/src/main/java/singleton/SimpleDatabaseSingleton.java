package singleton;

public class SimpleDatabaseSingleton {

  private DatabaseService instance;

  private SimpleDatabaseSingleton() {}

  public DatabaseService getInstance() {
    if(instance == null) {
      return new DatabaseService();
    }
    return instance;
  }
}
