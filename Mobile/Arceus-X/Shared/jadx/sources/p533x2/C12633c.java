package p533x2;

/* JADX INFO: renamed from: x2.c */
/* JADX INFO: loaded from: classes.dex */
public class C12633c<F, S> {

    /* JADX INFO: renamed from: a */
    public final F f44955a;

    /* JADX INFO: renamed from: b */
    public final S f44956b;

    public C12633c(F f10, S s8) {
        this.f44955a = f10;
        this.f44956b = s8;
    }

    /* JADX INFO: renamed from: a */
    public static <A, B> C12633c<A, B> m47065a(A a10, B b) {
        return new C12633c<>(a10, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12633c)) {
            return false;
        }
        C12633c c12633c = (C12633c) obj;
        return C12632b.m47060a(c12633c.f44955a, this.f44955a) && C12632b.m47060a(c12633c.f44956b, this.f44956b);
    }

    public int hashCode() {
        F f10 = this.f44955a;
        int iHashCode = f10 == null ? 0 : f10.hashCode();
        S s8 = this.f44956b;
        return iHashCode ^ (s8 != null ? s8.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f44955a + " " + this.f44956b + "}";
    }
}
