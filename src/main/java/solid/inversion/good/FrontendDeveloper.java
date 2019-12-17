package solid.inversion.good;

public class FrontendDeveloper implements Developer {

    @Override
    public void develop() {
       writeJavaScript();
    }

    private void writeJavaScript() {

        System.out.println("Writing JS");
    }
}
