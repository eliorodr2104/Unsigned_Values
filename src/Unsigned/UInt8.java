package Unsigned;

import java.lang.annotation.Native;

@jdk.internal.ValueBased
public class UInt8 extends Number{
    private final byte uValue;

    @Native private static final short MAX_VALUE = 0xFF;
    @Native private static final byte MIN_VALUE = 0x00;

    @Native public static final byte SIZE = 8;

    public UInt8(int value) {
        if (value < MIN_VALUE || value > MAX_VALUE)
            throw new IllegalArgumentException("Value out of range");

       this.uValue = (byte) value;
    }

    public UInt8 sum(UInt8 value) {
        if (value == null)
            throw new NullPointerException("Value is null");

        var sum = this.intValue() + value.intValue();

        if (sum > MAX_VALUE)
            throw new IllegalArgumentException("Value out of range");

        return new UInt8(sum);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (this == obj) return true;

        if (!(obj instanceof UInt8)) return false;

        return uValue == ((UInt8) obj).uValue;
    }

    @Override
    public int hashCode() {
        return Byte.hashCode(uValue);
    }

    @Override
    public String toString() {
        return Integer.toString(intValue());
    }

    @Override
    public int intValue() {
        return uValue & 0xFF;
    }

    @Override
    public long longValue() {
        return uValue & 0xFF;
    }

    @Override
    public float floatValue() {
        return uValue & 0xFF;
    }

    @Override
    public double doubleValue() {
        return uValue & 0xFF;
    }
}