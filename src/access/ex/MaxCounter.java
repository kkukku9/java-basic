package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count < max) {
            System.out.println("숫자를 하나 증가합니다.");
            count++;
        } else {
            System.out.println("최대값에 도달했습니다.");
        }
    }
    public int getCount() {
        System.out.println("지금까지 증가한 값을 반환합니다: " + count);
        return count;
    }
}


