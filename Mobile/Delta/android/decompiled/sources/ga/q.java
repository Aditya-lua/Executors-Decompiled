package ga;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f18513d = new q(new p(null));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18514a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18515c;

    public q(p pVar) {
        this.f18514a = pVar.e();
        this.b = pVar.f();
        this.f18515c = pVar.g();
    }

    public static p d() {
        return new p(null);
    }

    public final boolean a() {
        return this.f18514a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.f18515c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f18514a == qVar.f18514a && this.b == qVar.b && this.f18515c == qVar.f18515c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f18514a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + (this.f18515c ? 1 : 0);
    }

    public /* synthetic */ q(p pVar, byte[] bArr) {
        this(pVar);
    }
}
