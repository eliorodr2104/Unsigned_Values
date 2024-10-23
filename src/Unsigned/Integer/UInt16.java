package Unsigned.Integer;

import java.lang.annotation.Native;

@jdk.internal.ValueBased //Recent add
public class UInt16 extends Number{
    private final short uValue;

    @Native private static final int MAX_VALUE = 0xFFFF;
    @Native private static final byte MIN_VALUE = 0x00;

    @Native public static final int SIZE = 16;

    public UInt16(int value) {
        if (value < MIN_VALUE || value > MAX_VALUE)
            throw new IllegalArgumentException("Value out of range");

        this.uValue = (short) value;
    }

    public UInt16 sum(UInt16 value) {
        if (value == null)
            throw new NullPointerException("Value is null");

        var sum = this.intValue() + value.intValue();

        if (sum > MAX_VALUE)
            throw new IllegalArgumentException("Value out of range");

        return new UInt16(sum);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (this == obj) return true;

        if (!(obj instanceof UInt16)) return false;

        return uValue == ((UInt16) obj).uValue;
    }

    @Override
    public int hashCode() {
        return Short.hashCode(uValue);
    }

    @Override
    public String toString() {
        return Integer.toString(intValue());
    }

    @Override
    public int intValue() {
        return uValue & 0xFFFF;
    }

    @Override
    public long longValue() {
        return uValue & 0xFFFF;
    }

    @Override
    public float floatValue() {
        return uValue & 0xFFFF;
    }

    @Override
    public double doubleValue() {
        return uValue & 0xFFFF;
    }
}
