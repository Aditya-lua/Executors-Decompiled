package g0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w.b f17362a;
    public final w.a b;

    public e(w.b bVar, w.a aVar) {
        if (bVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f17362a = bVar;
        this.b = aVar;
    }

    @Override // g0.w
    public w.a c() {
        return this.b;
    }

    @Override // g0.w
    public w.b d() {
        return this.f17362a;
    }

    public boolean equals(Object obj) {
        w.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f17362a.equals(wVar.d()) && ((aVar = this.b) != null ? aVar.equals(wVar.c()) : wVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f17362a.hashCode() ^ 1000003) * 1000003;
        w.a aVar = this.b;
        return iHashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f17362a + ", error=" + this.b + "}";
    }
}
