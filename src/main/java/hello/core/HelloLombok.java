package hello.core;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombok {

    // 롬복 체험하기
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("Adfas");

        String name = helloLombok.getName();
        System.out.println("name = " + name);
    }
}
