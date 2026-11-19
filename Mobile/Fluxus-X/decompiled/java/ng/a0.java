package ng;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25524a;

    public a0(String str) {
        this.f25524a = str;
    }

    public final BigDecimal a() {
        return c0.b(this.f25524a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f25524a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f25524a.equals(((a0) obj).f25524a);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f25524a);
    }

    public int hashCode() {
        return this.f25524a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f25524a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f25524a);
            }
        } catch (NumberFormatException unused2) {
            return a().intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f25524a);
        } catch (NumberFormatException unused) {
            return a().longValue();
        }
    }

    public String toString() {
        return this.f25524a;
    }
}
