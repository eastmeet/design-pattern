package singleton;

import java.util.Calendar;
import java.util.Objects;

public class ConnectionPoolMain {
    public static void main(String[] args) {

        ConnectionPool instance1 = ConnectionPool.getInstance();
        ConnectionPool instance2 = ConnectionPool.getInstance();

        if (Objects.equals(instance1, instance2)) {
            System.out.println("같네요");
        } else {
            System.out.println("다르네요");
        }

        // 자바 calendar 예시
        Calendar calendar = Calendar.getInstance();

    }
}
