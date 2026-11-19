package lg;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import ng.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22142a;

    public r(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f22142a = bool;
    }

    public static boolean B(r rVar) {
        Object obj = rVar.f22142a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean A() {
        return this.f22142a instanceof Boolean;
    }

    public boolean C() {
        return this.f22142a instanceof Number;
    }

    public boolean D() {
        return this.f22142a instanceof String;
    }

    @Override // lg.l
    public boolean b() {
        return A() ? ((Boolean) this.f22142a).booleanValue() : Boolean.parseBoolean(l());
    }

    @Override // lg.l
    public double c() {
        return C() ? j().doubleValue() : Double.parseDouble(l());
    }

    @Override // lg.l
    public float d() {
        return C() ? j().floatValue() : Float.parseFloat(l());
    }

    @Override // lg.l
    public int e() {
        return C() ? j().intValue() : Integer.parseInt(l());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f22142a == null) {
            return rVar.f22142a == null;
        }
        if (B(this) && B(rVar)) {
            if ((this.f22142a instanceof BigInteger) || (rVar.f22142a instanceof BigInteger)) {
                return x().equals(rVar.x());
            }
            return j().longValue() == rVar.j().longValue();
        }
        Object obj2 = this.f22142a;
        if (obj2 instanceof Number) {
            Object obj3 = rVar.f22142a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return w().compareTo(rVar.w()) == 0;
                }
                double dC = c();
                double dC2 = rVar.c();
                return dC == dC2 || (Double.isNaN(dC) && Double.isNaN(dC2));
            }
        }
        return obj2.equals(rVar.f22142a);
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f22142a == null) {
            return 31;
        }
        if (B(this)) {
            jDoubleToLongBits = j().longValue();
        } else {
            Object obj = this.f22142a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(j().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    @Override // lg.l
    public long i() {
        return C() ? j().longValue() : Long.parseLong(l());
    }

    @Override // lg.l
    public Number j() {
        Object obj = this.f22142a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new ng.a0((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    @Override // lg.l
    public String l() {
        Object obj = this.f22142a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (C()) {
            return j().toString();
        }
        if (A()) {
            return ((Boolean) this.f22142a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f22142a.getClass());
    }

    @Override // lg.l
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public r a() {
        return this;
    }

    public BigDecimal w() {
        Object obj = this.f22142a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : c0.b(l());
    }

    public BigInteger x() {
        Object obj = this.f22142a;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        return B(this) ? BigInteger.valueOf(j().longValue()) : c0.c(l());
    }

    public r(Number number) {
        Objects.requireNonNull(number);
        this.f22142a = number;
    }

    public r(String str) {
        Objects.requireNonNull(str);
        this.f22142a = str;
    }
}
