package vd;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 extends c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34337a;

    public /* synthetic */ x0(long j10, int i10, w0 w0Var) {
        this.f34337a = j10;
    }

    @Override // vd.c.a
    public final int a() {
        return 0;
    }

    @Override // vd.c.a
    public final long b() {
        return this.f34337a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c.a) {
            c.a aVar = (c.a) obj;
            if (this.f34337a == aVar.b()) {
                aVar.a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f34337a;
        return (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + this.f34337a + ", webViewRequestMode=0}";
    }
}
