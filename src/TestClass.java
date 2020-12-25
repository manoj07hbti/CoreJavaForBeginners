import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

public class TestClass {

    int firstlimit = 5;
    int secondlimit = 10;

    public Date addSeconds(Date date, long seconds) {
        return Date.from(date.toInstant().plusSeconds(seconds));
    }

    public long findMinutes() {
        Date dt = new Date();
        Date dt2 = new Date();
        LocalDateTime startDate = LocalDateTime.now().minusDays(1);
        LocalDateTime endDate = LocalDateTime.now();
        long minutes = Duration.between(startDate, endDate).toMinutes();
        return minutes;
    }

    public void check(int genOtp, int valOtp) {
        int quoatientGen = genOtp / firstlimit;
        int quoatientVal = valOtp / firstlimit;
        if ((genOtp != 0 && genOtp % firstlimit == 0) || (valOtp != 0 && valOtp % firstlimit == 0)) {
            if ((quoatientGen + quoatientVal) % 2 == 0) {
                System.out.println("Apply 24 Hr Suspension ");
            } else {
                System.out.println("Apply 15 min Suspension ");

            }

        }
    }

    public static void main(String[] args) {
        TestClass obj = new TestClass();
        // System.out.println(obj.findMinutes());
        int genOtp;
        int valOtp;
        obj.check(7, 5);
    }
}
