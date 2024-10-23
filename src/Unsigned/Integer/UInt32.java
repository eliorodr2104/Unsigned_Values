package Unsigned.Integer;

import java.lang.annotation.Native;

@jdk.internal.ValueBased
public class UInt32 extends Number {
    private final int uValue;

    @Native private static final long MAX_VALUE = 0xFFFFFFFFL;
    @Native private static final byte MIN_VALUE = 0x00;

    @Native public static final int SIZE = 32;

    public UInt32(long value) {
        if (value < MIN_VALUE || value > MAX_VALUE)
            throw new IllegalArgumentException("Value out of range");

        this.uValue = (int) value;
    }

    public UInt32 sum(UInt32 value) {
        if (value == null)
            throw new NullPointerException("Value is null");

        var sum = this.longValue() + value.longValue();

        if (sum > MAX_VALUE)
            throw new IllegalArgumentException("Value out of range");

        return new UInt32(sum);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (this == obj) return true;

        if (!(obj instanceof UInt32)) return false;

        return uValue == ((UInt32) obj).uValue;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(uValue);
    }

    @Override
    public String toString() {
        return Long.toString(longValue());
    }

    @Override
    public int intValue() {
        return (int) (uValue & 0xFFFFFFFFL);
    }

    @Override
    public long longValue() {
        return uValue & 0xFFFFFFFFL;
    }

    @Override
    public float floatValue() {
        return uValue & 0xFFFFFFFFL;
    }

    @Override
    public double doubleValue() {
        return uValue & 0xFFFFFFFFL;
    }
}
