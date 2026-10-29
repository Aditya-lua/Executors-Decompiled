package lf;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0<?> f23176a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23177c;

    public r(Class<?> cls, int i10, int i11) {
        this((e0<?>) e0.b(cls), i10, i11);
    }

    public static String a(int i10) {
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
    public static r g(Class<?> cls) {
        return new r(cls, 0, 0);
    }

    public static r h(Class<?> cls) {
        return new r(cls, 0, 1);
    }

    public static r i(e0<?> e0Var) {
        return new r(e0Var, 0, 1);
    }

    public static r j(Class<?> cls) {
        return new r(cls, 1, 0);
    }

    public static r k(e0<?> e0Var) {
        return new r(e0Var, 1, 0);
    }

    public static r l(Class<?> cls) {
        return new r(cls, 1, 1);
    }

    public static r m(Class<?> cls) {
        return new r(cls, 2, 0);
    }

    public e0<?> b() {
        return this.f23176a;
    }

    public boolean c() {
        return this.f23177c == 2;
    }

    public boolean d() {
        return this.f23177c == 0;
    }

    public boolean e() {
        return this.b == 1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f23176a.equals(rVar.f23176a) && this.b == rVar.b && this.f23177c == rVar.f23177c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.b == 2;
    }

    public int hashCode() {
        return ((((this.f23176a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f23177c;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f23176a);
        sb2.append(", type=");
        int i10 = this.b;
        if (i10 == 1) {
            str = "required";
        } else {
            str = i10 == 0 ? "optional" : "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        sb2.append(a(this.f23177c));
        sb2.append("}");
        return sb2.toString();
    }

    public r(e0<?> e0Var, int i10, int i11) {
        this.f23176a = (e0) d0.c(e0Var, "Null dependency anInterface.");
        this.b = i10;
        this.f23177c = i11;
    }
}
