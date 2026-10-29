package m0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends b1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23600a;
    public final g0.h1 b;

    public i(int i10, g0.h1 h1Var) {
        this.f23600a = i10;
        if (h1Var == null) {
            throw new NullPointerException("Null imageCaptureException");
        }
        this.b = h1Var;
    }

    @Override // m0.b1.a
    public g0.h1 a() {
        return this.b;
    }

    @Override // m0.b1.a
    public int b() {
        return this.f23600a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1.a) {
            b1.a aVar = (b1.a) obj;
            if (this.f23600a == aVar.b() && this.b.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f23600a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "CaptureError{requestId=" + this.f23600a + ", imageCaptureException=" + this.b + "}";
    }
}
