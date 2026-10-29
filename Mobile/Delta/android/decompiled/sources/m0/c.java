package m0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends y.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.core.d f23574a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0.f1.h f23575c;

    public c(androidx.camera.core.d dVar, int i10, g0.f1.h hVar) {
        if (dVar == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.f23574a = dVar;
        this.b = i10;
        if (hVar == null) {
            throw new NullPointerException("Null outputFileOptions");
        }
        this.f23575c = hVar;
    }

    @Override // m0.y.a
    public androidx.camera.core.d a() {
        return this.f23574a;
    }

    @Override // m0.y.a
    public g0.f1.h b() {
        return this.f23575c;
    }

    @Override // m0.y.a
    public int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y.a) {
            y.a aVar = (y.a) obj;
            if (this.f23574a.equals(aVar.a()) && this.b == aVar.c() && this.f23575c.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f23574a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f23575c.hashCode();
    }

    public String toString() {
        return "In{imageProxy=" + this.f23574a + ", rotationDegrees=" + this.b + ", outputFileOptions=" + this.f23575c + "}";
    }
}
