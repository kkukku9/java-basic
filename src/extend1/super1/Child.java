package extend1.super1;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); //this 생략 가능
        System.out.println("this value = " + super.value); //super 생략 불가

        this.hello();
        super.hello();

    }
}
