package m0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends u0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f24248a;
    public final androidx.camera.core.d b;

    public h(v0 v0Var, androidx.camera.core.d dVar) {
        if (v0Var == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f24248a = v0Var;
        if (dVar == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.b = dVar;
    }

    @Override // m0.u0.b
    public androidx.camera.core.d a() {
        return this.b;
    }

    @Override // m0.u0.b
    public v0 b() {
        return this.f24248a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u0.b) {
            u0.b bVar = (u0.b) obj;
            if (this.f24248a.equals(bVar.b()) && this.b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f24248a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f24248a + ", imageProxy=" + this.b + "}";
    }
}
