package dry;

public class DryExample {

  public static void main(String[] args) {

    // bad
    addUser("some user");
    addBook("some book");
  }

  private static void addUser(String user) {

    String nameOfTable = "user";

    try {

      String query = "Insert user into " + nameOfTable + user;

      System.out.println("executing query : " + query);

      Thread.sleep(10000);

      System.out.println("added data to table " + nameOfTable);

    } catch (Exception e) {

      System.err.println("Failure during inserting of data");

    } finally {

      System.out.println("Connection closed");
    }
  }

  private static void addBook(String book) {

    String nameOfTable = "book";
    try {

      String query = "Insert book into " + nameOfTable + book;

      System.out.println("executing query : " + query);

      Thread.sleep(10000);

      System.out.println("added data to table " + nameOfTable);

    } catch (Exception e) {

      System.err.println("Failure during inserting of data");

    } finally {

      System.out.println("Connection closed");
    }
  }

}
