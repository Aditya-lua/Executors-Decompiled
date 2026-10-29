package kg;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: renamed from: kg.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C7602r extends AbstractC7596l {

    /* JADX INFO: renamed from: a */
    public final Object f29114a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7602r(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f29114a = bool;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m31480B(C7602r c7602r) {
        Object obj = c7602r.f29114a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* JADX INFO: renamed from: A */
    public boolean m31481A() {
        return this.f29114a instanceof Boolean;
    }

    /* JADX INFO: renamed from: C */
    public boolean m31482C() {
        return this.f29114a instanceof Number;
    }

    /* JADX INFO: renamed from: D */
    public boolean m31483D() {
        return this.f29114a instanceof String;
    }

    @Override // kg.AbstractC7596l
    /* JADX INFO: renamed from: b */
    public boolean mo31445b() {
        return m31481A() ? ((Boolean) this.f29114a).booleanValue() : Boolean.parseBoolean(mo31451l());
    }

    @Override // kg.AbstractC7596l
    /* JADX INFO: renamed from: c */
    public double mo31446c() {
        return m31482C() ? mo31450k().doubleValue() : Double.parseDouble(mo31451l());
    }

    @Override // kg.AbstractC7596l
    /* JADX INFO: renamed from: d */
    public float mo31447d() {
        return m31482C() ? mo31450k().floatValue() : Float.parseFloat(mo31451l());
    }

    @Override // kg.AbstractC7596l
    /* JADX INFO: renamed from: e */
    public int mo31448e() {
        return m31482C() ? mo31450k().intValue() : Integer.parseInt(mo31451l());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7602r.class != obj.getClass()) {
            return false;
        }
        C7602r c7602r = (C7602r) obj;
        if (this.f29114a == null) {
            return c7602r.f29114a == null;
        }
        if (m31480B(this) && m31480B(c7602r)) {
            if ((this.f29114a instanceof BigInteger) || (c7602r.f29114a instanceof BigInteger)) {
                return m31486z().equals(c7602r.m31486z());
            }
            return mo31450k().longValue() == c7602r.mo31450k().longValue();
        }
        Object obj2 = this.f29114a;
        if (obj2 instanceof Number) {
            Object obj3 = c7602r.f29114a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return m31485y().compareTo(c7602r.m31485y()) == 0;
                }
                double dMo31446c = mo31446c();
                double dMo31446c2 = c7602r.mo31446c();
                return dMo31446c == dMo31446c2 || (Double.isNaN(dMo31446c) && Double.isNaN(dMo31446c2));
            }
        }
        return obj2.equals(c7602r.f29114a);
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f29114a == null) {
            return 31;
        }
        if (m31480B(this)) {
            jDoubleToLongBits = mo31450k().longValue();
        } else {
            Object obj = this.f29114a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(mo31450k().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    @Override // kg.AbstractC7596l
    /* JADX INFO: renamed from: i */
    public long mo31449i() {
        return m31482C() ? mo31450k().longValue() : Long.parseLong(mo31451l());
    }

    @Override // kg.AbstractC7596l
    /* JADX INFO: renamed from: k */
    public Number mo31450k() {
        Object obj = this.f29114a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new LazilyParsedNumber((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    @Override // kg.AbstractC7596l
    /* JADX INFO: renamed from: l */
    public String mo31451l() {
        Object obj = this.f29114a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (m31482C()) {
            return mo31450k().toString();
        }
        if (m31481A()) {
            return ((Boolean) this.f29114a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f29114a.getClass());
    }

    /* JADX DEBUG: Method merged with bridge method: a()Lkg/l; */
    @Override // kg.AbstractC7596l
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public C7602r mo31444a() {
        return this;
    }

    /* JADX INFO: renamed from: y */
    public BigDecimal m31485y() {
        Object obj = this.f29114a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : NumberLimits.parseBigDecimal(mo31451l());
    }

    /* JADX INFO: renamed from: z */
    public BigInteger m31486z() {
        Object obj = this.f29114a;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        return m31480B(this) ? BigInteger.valueOf(mo31450k().longValue()) : NumberLimits.parseBigInteger(mo31451l());
    }

    public C7602r(Number number) {
        Objects.requireNonNull(number);
        this.f29114a = number;
    }

    public C7602r(String str) {
        Objects.requireNonNull(str);
        this.f29114a = str;
    }
}
