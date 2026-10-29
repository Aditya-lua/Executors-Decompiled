package p292mf;

/* JADX INFO: renamed from: mf.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C8511r {

    /* JADX INFO: renamed from: a */
    public final C8497e0<?> f31259a;

    /* JADX INFO: renamed from: b */
    public final int f31260b;

    /* JADX INFO: renamed from: c */
    public final int f31261c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8511r(Class<?> cls, int i10, int i11) {
        this((C8497e0<?>) C8497e0.m34316b(cls), i10, i11);
    }

    /* JADX INFO: renamed from: a */
    public static String m34355a(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static C8511r m34356g(Class<?> cls) {
        return new C8511r(cls, 0, 0);
    }

    /* JADX INFO: renamed from: h */
    public static C8511r m34357h(Class<?> cls) {
        return new C8511r(cls, 0, 1);
    }

    /* JADX INFO: renamed from: i */
    public static C8511r m34358i(C8497e0<?> c8497e0) {
        return new C8511r(c8497e0, 0, 1);
    }

    /* JADX INFO: renamed from: j */
    public static C8511r m34359j(Class<?> cls) {
        return new C8511r(cls, 1, 0);
    }

    /* JADX INFO: renamed from: k */
    public static C8511r m34360k(C8497e0<?> c8497e0) {
        return new C8511r(c8497e0, 1, 0);
    }

    /* JADX INFO: renamed from: l */
    public static C8511r m34361l(Class<?> cls) {
        return new C8511r(cls, 1, 1);
    }

    /* JADX INFO: renamed from: m */
    public static C8511r m34362m(Class<?> cls) {
        return new C8511r(cls, 2, 0);
    }

    /* JADX INFO: renamed from: b */
    public C8497e0<?> m34363b() {
        return this.f31259a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m34364c() {
        return this.f31261c == 2;
    }

    /* JADX INFO: renamed from: d */
    public boolean m34365d() {
        return this.f31261c == 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean m34366e() {
        return this.f31260b == 1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8511r) {
            C8511r c8511r = (C8511r) obj;
            if (this.f31259a.equals(c8511r.f31259a) && this.f31260b == c8511r.f31260b && this.f31261c == c8511r.f31261c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m34367f() {
        return this.f31260b == 2;
    }

    public int hashCode() {
        return ((((this.f31259a.hashCode() ^ 1000003) * 1000003) ^ this.f31260b) * 1000003) ^ this.f31261c;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f31259a);
        sb2.append(", type=");
        int i10 = this.f31260b;
        if (i10 == 1) {
            str = "required";
        } else {
            str = i10 == 0 ? "optional" : "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        sb2.append(m34355a(this.f31261c));
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8511r(C8497e0<?> c8497e0, int i10, int i11) {
        this.f31259a = (C8497e0) C8495d0.m34313c(c8497e0, "Null dependency anInterface.");
        this.f31260b = i10;
        this.f31261c = i11;
    }
}
