package Unsigned.Integer;

import java.lang.annotation.Native;

@jdk.internal.ValueBased
public class UInt64 extends Number {
    private final long uValue;

    @Native private static final byte MIN_VALUE = 0x00;

    @Native public static final int SIZE = 64;

    public UInt64(long value) {
        if (value < MIN_VALUE)
            throw new IllegalArgumentException("Value out of range");

        this.uValue = (int) value;
    }

    public UInt64 sum(UInt64 value) {
        if (value == null)
            throw new NullPointerException("Value is null");

        var sum = this.longValue() + value.longValue();

        return new UInt64(sum);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (this == obj) return true;

        if (!(obj instanceof UInt64)) return false;

        return uValue == ((UInt64) obj).uValue;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(uValue);
    }

    @Override
    public String toString() {
        return Long.toString(longValue());
    }

    @Override
    public int intValue() {
        return (int) uValue;
    }

    @Override
    public long longValue() {
        return uValue & 0x7FFFFFFFFFFFFFFFL;
    }

    @Override
    public float floatValue() {
        return uValue & 0x7FFFFFFFFFFFFFFFL;
    }

    @Override
    public double doubleValue() {
        return uValue & 0x7FFFFFFFFFFFFFFFL;
    }
}
