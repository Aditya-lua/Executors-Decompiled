package td;

/* JADX INFO: renamed from: td.x0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11631x0 extends InterfaceC11571c.a {

    /* JADX INFO: renamed from: a */
    public final long f41032a;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [td.v0.a():td.c$a] */
    public /* synthetic */ C11631x0(long j10, int i10, C11629w0 c11629w0) {
        this.f41032a = j10;
    }

    @Override // td.InterfaceC11571c.a
    /* JADX INFO: renamed from: a */
    public final int mo43244a() {
        return 0;
    }

    @Override // td.InterfaceC11571c.a
    /* JADX INFO: renamed from: b */
    public final long mo43245b() {
        return this.f41032a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC11571c.a) {
            InterfaceC11571c.a aVar = (InterfaceC11571c.a) obj;
            if (this.f41032a == aVar.mo43245b()) {
                aVar.mo43244a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f41032a;
        return (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + this.f41032a + ", webViewRequestMode=0}";
    }
}
