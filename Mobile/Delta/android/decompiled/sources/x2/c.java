package x2;

/* JADX INFO: loaded from: classes.dex */
public class c<F, S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f34681a;
    public final S b;

    public c(F f10, S s8) {
        this.f34681a = f10;
        this.b = s8;
    }

    public static <A, B> c<A, B> a(A a10, B b) {
        return new c<>(a10, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return b.a(cVar.f34681a, this.f34681a) && b.a(cVar.b, this.b);
    }

    public int hashCode() {
        F f10 = this.f34681a;
        int iHashCode = f10 == null ? 0 : f10.hashCode();
        S s8 = this.b;
        return iHashCode ^ (s8 != null ? s8.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f34681a + " " + this.b + "}";
    }
}
