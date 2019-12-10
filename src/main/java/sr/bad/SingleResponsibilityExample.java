package sr.bad;

public class SingleResponsibilityExample {

    public static void main(String[] args) {

        SuperUser superUser = new SuperUser();

        superUser.setName("John");
        superUser.setUserId("1234");
        superUser.setPost("Hey, this is my very first post here!", superUser.getUserId());

        System.out.println(superUser.getPost(superUser.getUserId()));
    }
}
