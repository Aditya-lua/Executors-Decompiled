package m0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0.b0<androidx.camera.core.d> f23577a;
    public final int b;

    public d(x0.b0<androidx.camera.core.d> b0Var, int i10) {
        if (b0Var == null) {
            throw new NullPointerException("Null packet");
        }
        this.f23577a = b0Var;
        this.b = i10;
    }

    @Override // m0.b0.a
    public int a() {
        return this.b;
    }

    @Override // m0.b0.a
    public x0.b0<androidx.camera.core.d> b() {
        return this.f23577a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.a) {
            b0.a aVar = (b0.a) obj;
            if (this.f23577a.equals(aVar.b()) && this.b == aVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f23577a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        return "In{packet=" + this.f23577a + ", jpegQuality=" + this.b + "}";
    }
}
