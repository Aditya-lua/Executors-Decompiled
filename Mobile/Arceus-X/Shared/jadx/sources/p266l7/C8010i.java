package p266l7;

import p533x2.C12633c;

/* JADX INFO: renamed from: l7.i */
/* JADX INFO: loaded from: classes3.dex */
public class C8010i<T> {

    /* JADX INFO: renamed from: a */
    public T f29965a;

    /* JADX INFO: renamed from: b */
    public T f29966b;

    /* JADX INFO: renamed from: a */
    public static boolean m33089a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m33090b(T t8, T t10) {
        this.f29965a = t8;
        this.f29966b = t10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12633c)) {
            return false;
        }
        C12633c c12633c = (C12633c) obj;
        return m33089a(c12633c.f44955a, this.f29965a) && m33089a(c12633c.f44956b, this.f29966b);
    }

    public int hashCode() {
        T t8 = this.f29965a;
        int iHashCode = t8 == null ? 0 : t8.hashCode();
        T t10 = this.f29966b;
        return iHashCode ^ (t10 != null ? t10.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f29965a + " " + this.f29966b + "}";
    }
}
