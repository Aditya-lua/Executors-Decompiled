package x0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends t.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36018a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y1.c.a<Void> f36019c;

    public a(int i10, int i11, y1.c.a<Void> aVar) {
        this.f36018a = i10;
        this.b = i11;
        if (aVar == null) {
            throw new NullPointerException("Null completer");
        }
        this.f36019c = aVar;
    }

    @Override // x0.t.b
    public y1.c.a<Void> a() {
        return this.f36019c;
    }

    @Override // x0.t.b
    public int b() {
        return this.f36018a;
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
            if (this.f36018a == bVar.b() && this.b == bVar.c() && this.f36019c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f36018a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f36019c.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f36018a + ", rotationDegrees=" + this.b + ", completer=" + this.f36019c + "}";
    }
}
