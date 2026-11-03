package y0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0.f f36285a;
    public final z0.f b;

    public a(z0.f fVar, z0.f fVar2) {
        if (fVar == null) {
            throw new NullPointerException("Null primaryOutConfig");
        }
        this.f36285a = fVar;
        if (fVar2 == null) {
            throw new NullPointerException("Null secondaryOutConfig");
        }
        this.b = fVar2;
    }

    @Override // y0.d
    public z0.f a() {
        return this.f36285a;
    }

    @Override // y0.d
    public z0.f b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f36285a.equals(dVar.a()) && this.b.equals(dVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f36285a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f36285a + ", secondaryOutConfig=" + this.b + "}";
    }
}
