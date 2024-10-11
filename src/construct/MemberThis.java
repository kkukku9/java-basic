package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        this.nameField = nameParameter; //이 경우에는 this 생략 가능.
    }
}
