package gb;

/* JADX INFO: loaded from: classes.dex */
public final class q1 implements l9.a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17662a;
    public final String b;

    public /* synthetic */ q1(int i10, String str, byte[] bArr) {
        this.f17662a = i10;
        this.b = str;
    }

    public static l1 a() {
        return new l1(null);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return this.f17662a == q1Var.f17662a && o9.q.b(this.b, q1Var.b);
    }

    public final int hashCode() {
        return o9.q.c(Integer.valueOf(this.f17662a), this.b);
    }
}
