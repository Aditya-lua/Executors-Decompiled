package ga;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f17974d = new q(new p(null));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17975a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17976c;

    public q(p pVar) {
        this.f17975a = pVar.e();
        this.b = pVar.f();
        this.f17976c = pVar.g();
    }

    public static p d() {
        return new p(null);
    }

    public final boolean a() {
        return this.f17975a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.f17976c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f17975a == qVar.f17975a && this.b == qVar.b && this.f17976c == qVar.f17976c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f17975a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + (this.f17976c ? 1 : 0);
    }

    public /* synthetic */ q(p pVar, byte[] bArr) {
        this(pVar);
    }
}
