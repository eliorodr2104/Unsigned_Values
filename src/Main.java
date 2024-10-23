import Unsigned.Integer.UInt64;

public class Main {
    public static void main(String[] args) {
        var uInt64 = new UInt64(9223372036854775806L);
        var uInt64B = new UInt64(1L);

        System.out.println(uInt64.sum(uInt64B));
    }
}