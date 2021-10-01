package singleton;

public class ThreadSafeDatabaseSingleton {

  private static volatile DatabaseService instance;

  private ThreadSafeDatabaseSingleton() {}

  public DatabaseService getInstance() {
    if(instance == null) {
      synchronized (ThreadSafeDatabaseSingleton.class) {
        if(instance == null) {
          return new DatabaseService();
        }
      }
    }
    return instance;
  }

}
