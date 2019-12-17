package dry;

public class DryExample {

  private static final String importantData = "I_am_important_data";

  public static void main(String[] args) {

    // some copy-paste
    printData();
    printDataWithSpecificCase();

    System.out.println("\n");

    // better
    printDataBetter(importantData);
    printDataWithSpecificCaseBetter(importantData);
  }

  /**
   * Bad, because some data just copy-pasted
   */
  private static void printData() {

    String formattedData = importantData.replace("_", " ");

    String formattedUpperCaseData = formattedData.toUpperCase();

    System.out.println(formattedUpperCaseData);
  }

  private static void printDataWithSpecificCase() {

    String message = "I am message";

    String formattedData = importantData.replace("_", " ");

    String formattedUpperCaseData = formattedData.toUpperCase();

    System.out.println(formattedUpperCaseData + ". " + message);
  }

  //-------------------------------------------------------------

  /**
   * Still not so good, but we move common logic to the separate method
   */
  private static String formatData(String importantData) {

    String formattedData = importantData.replace("_", " ");

    return formattedData.toUpperCase();
  }

  private static void printDataBetter(String importantData) {

    String formattedData = formatData(importantData);

    System.out.println(formattedData);
  }

  private static void printDataWithSpecificCaseBetter(String importantData) {

    String message = "I am message";

    String formattedData = formatData(importantData);

    System.out.println(formattedData + ". " + message);
  }
}
