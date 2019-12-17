package solid.inversion.good;

public class BackendDeveloper implements Developer {

    @Override
    public void develop() {

        writeJava();
    }

    private void writeJava() {
        System.out.println("Writing Java..");
    }
}
