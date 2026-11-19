package ha;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f18150d = new r(new q(null));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18151a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18152c;

    public r(q qVar) {
        this.f18151a = qVar.e();
        this.b = qVar.f();
        this.f18152c = qVar.g();
    }

    public static q d() {
        return new q(null);
    }

    public final boolean a() {
        return this.f18151a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.f18152c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f18151a == rVar.f18151a && this.b == rVar.b && this.f18152c == rVar.f18152c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f18151a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + (this.f18152c ? 1 : 0);
    }

    public /* synthetic */ r(q qVar, byte[] bArr) {
        this(qVar);
    }
}
