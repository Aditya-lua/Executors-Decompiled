package td;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 extends c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32303a;

    public /* synthetic */ x0(long j10, int i10, w0 w0Var) {
        this.f32303a = j10;
    }

    @Override // td.c.a
    public final int a() {
        return 0;
    }

    @Override // td.c.a
    public final long b() {
        return this.f32303a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c.a) {
            c.a aVar = (c.a) obj;
            if (this.f32303a == aVar.b()) {
                aVar.a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f32303a;
        return (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + this.f32303a + ", webViewRequestMode=0}";
    }
}
