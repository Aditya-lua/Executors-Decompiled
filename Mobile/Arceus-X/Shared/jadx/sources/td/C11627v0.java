package td;

/* JADX INFO: renamed from: td.v0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11627v0 extends InterfaceC11571c.a.AbstractC14260a {

    /* JADX INFO: renamed from: a */
    public long f41029a;

    /* JADX INFO: renamed from: b */
    public byte f41030b;

    @Override // td.InterfaceC11571c.a.AbstractC14260a
    /* JADX INFO: renamed from: a */
    public final InterfaceC11571c.a mo43246a() {
        if (this.f41030b == 3) {
            return new C11631x0(this.f41029a, 0, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f41030b & 1) == 0) {
            sb2.append(" cloudProjectNumber");
        }
        if ((this.f41030b & 2) == 0) {
            sb2.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // td.InterfaceC11571c.a.AbstractC14260a
    /* JADX INFO: renamed from: b */
    public final InterfaceC11571c.a.AbstractC14260a mo43247b(long j10) {
        this.f41029a = j10;
        this.f41030b = (byte) (this.f41030b | 1);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC11571c.a.AbstractC14260a m43285c(int i10) {
        this.f41030b = (byte) (this.f41030b | 2);
        return this;
    }
}
