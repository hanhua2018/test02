package hh.mywork.util;

public class TestService {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public void hello(){
        System.out.println("hello "+getName());
    }
}
