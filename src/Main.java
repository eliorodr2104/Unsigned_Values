import Unsigned.UInt16;
import Unsigned.UInt32;

public class Main {
    public static void main(String[] args) {
        var uInt32 = new UInt32(4294967294L);
        var uInt32B = new UInt32(2);

        System.out.println(uInt32.sum(uInt32B));
    }
}