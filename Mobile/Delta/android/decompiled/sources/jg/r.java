package jg;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21441a;

    public r(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f21441a = bool;
    }

    public static boolean B(r rVar) {
        Object obj = rVar.f21441a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean A() {
        return this.f21441a instanceof Boolean;
    }

    public boolean C() {
        return this.f21441a instanceof Number;
    }

    public boolean D() {
        return this.f21441a instanceof String;
    }

    @Override // jg.l
    public boolean b() {
        return A() ? ((Boolean) this.f21441a).booleanValue() : Boolean.parseBoolean(l());
    }

    @Override // jg.l
    public double c() {
        return C() ? k().doubleValue() : Double.parseDouble(l());
    }

    @Override // jg.l
    public float d() {
        return C() ? k().floatValue() : Float.parseFloat(l());
    }

    @Override // jg.l
    public int e() {
        return C() ? k().intValue() : Integer.parseInt(l());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f21441a == null) {
            return rVar.f21441a == null;
        }
        if (B(this) && B(rVar)) {
            if ((this.f21441a instanceof BigInteger) || (rVar.f21441a instanceof BigInteger)) {
                return z().equals(rVar.z());
            }
            return k().longValue() == rVar.k().longValue();
        }
        Object obj2 = this.f21441a;
        if (obj2 instanceof Number) {
            Object obj3 = rVar.f21441a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return y().compareTo(rVar.y()) == 0;
                }
                double dC = c();
                double dC2 = rVar.c();
                return dC == dC2 || (Double.isNaN(dC) && Double.isNaN(dC2));
            }
        }
        return obj2.equals(rVar.f21441a);
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f21441a == null) {
            return 31;
        }
        if (B(this)) {
            jDoubleToLongBits = k().longValue();
        } else {
            Object obj = this.f21441a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(k().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    @Override // jg.l
    public long i() {
        return C() ? k().longValue() : Long.parseLong(l());
    }

    @Override // jg.l
    public Number k() {
        Object obj = this.f21441a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new LazilyParsedNumber((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    @Override // jg.l
    public String l() {
        Object obj = this.f21441a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (C()) {
            return k().toString();
        }
        if (A()) {
            return ((Boolean) this.f21441a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f21441a.getClass());
    }

    @Override // jg.l
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public r a() {
        return this;
    }

    public BigDecimal y() {
        Object obj = this.f21441a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : NumberLimits.parseBigDecimal(l());
    }

    public BigInteger z() {
        Object obj = this.f21441a;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        return B(this) ? BigInteger.valueOf(k().longValue()) : NumberLimits.parseBigInteger(l());
    }

    public r(Number number) {
        Objects.requireNonNull(number);
        this.f21441a = number;
    }

    public r(String str) {
        Objects.requireNonNull(str);
        this.f21441a = str;
    }
}
