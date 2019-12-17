package solid.inversion.good;

import java.util.List;

public class Project {

    private List<Developer> developerList;

    public Project(List<Developer> developerList) {
        this.developerList = developerList;
    }

    public void implement() {

        developerList.forEach(Developer::develop);
    }
}
