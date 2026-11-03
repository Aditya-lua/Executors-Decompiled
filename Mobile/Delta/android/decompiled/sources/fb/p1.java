package fb;

/* JADX INFO: loaded from: classes.dex */
public final class p1 implements k9.a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17163a;
    public final String b;

    public /* synthetic */ p1(int i10, String str, byte[] bArr) {
        this.f17163a = i10;
        this.b = str;
    }

    public static k1 a() {
        return new k1(null);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.f17163a == p1Var.f17163a && n9.k.b(this.b, p1Var.b);
    }

    public final int hashCode() {
        return n9.k.c(Integer.valueOf(this.f17163a), this.b);
    }
}
