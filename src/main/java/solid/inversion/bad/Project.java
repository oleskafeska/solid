package solid.inversion.bad;

public class Project {

    private BackendDeveloper backendDeveloper = new BackendDeveloper();
    private FrontendDeveloper frontendDeveloper = new FrontendDeveloper();

    public void implement() {
        backendDeveloper.writeJava();
        frontendDeveloper.writeJavaScript();
    }
}
