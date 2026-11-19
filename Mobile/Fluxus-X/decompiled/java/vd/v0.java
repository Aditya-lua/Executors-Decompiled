package vd;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 extends c.a.AbstractC0699a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f34335a;
    public byte b;

    @Override // vd.c.a.AbstractC0699a
    public final c.a a() {
        if (this.b == 3) {
            return new x0(this.f34335a, 0, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.b & 1) == 0) {
            sb2.append(" cloudProjectNumber");
        }
        if ((this.b & 2) == 0) {
            sb2.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // vd.c.a.AbstractC0699a
    public final c.a.AbstractC0699a b(long j10) {
        this.f34335a = j10;
        this.b = (byte) (this.b | 1);
        return this;
    }

    public final c.a.AbstractC0699a c(int i10) {
        this.b = (byte) (this.b | 2);
        return this;
    }
}
