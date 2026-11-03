package x0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends t.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35052a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y1.c.a<Void> f35053c;

    public a(int i10, int i11, y1.c.a<Void> aVar) {
        this.f35052a = i10;
        this.b = i11;
        if (aVar == null) {
            throw new NullPointerException("Null completer");
        }
        this.f35053c = aVar;
    }

    @Override // x0.t.b
    public y1.c.a<Void> a() {
        return this.f35053c;
    }

    @Override // x0.t.b
    public int b() {
        return this.f35052a;
    }

    @Override // x0.t.b
    public int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t.b) {
            t.b bVar = (t.b) obj;
            if (this.f35052a == bVar.b() && this.b == bVar.c() && this.f35053c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f35052a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f35053c.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f35052a + ", rotationDegrees=" + this.b + ", completer=" + this.f35053c + "}";
    }
}
