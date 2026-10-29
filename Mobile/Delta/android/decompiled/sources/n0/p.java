package n0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3 f24790a;
    public final d3 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d3 f24791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d3 f24792d;

    public p(d3 d3Var, d3 d3Var2, d3 d3Var3, d3 d3Var4) {
        if (d3Var == null) {
            throw new NullPointerException("Null previewOutputSurface");
        }
        this.f24790a = d3Var;
        if (d3Var2 == null) {
            throw new NullPointerException("Null imageCaptureOutputSurface");
        }
        this.b = d3Var2;
        this.f24791c = d3Var3;
        this.f24792d = d3Var4;
    }

    @Override // n0.e3
    public d3 b() {
        return this.f24791c;
    }

    @Override // n0.e3
    public d3 c() {
        return this.b;
    }

    @Override // n0.e3
    public d3 d() {
        return this.f24792d;
    }

    @Override // n0.e3
    public d3 e() {
        return this.f24790a;
    }

    public boolean equals(Object obj) {
        d3 d3Var;
        d3 d3Var2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e3) {
            e3 e3Var = (e3) obj;
            if (this.f24790a.equals(e3Var.e()) && this.b.equals(e3Var.c()) && ((d3Var = this.f24791c) != null ? d3Var.equals(e3Var.b()) : e3Var.b() == null) && ((d3Var2 = this.f24792d) != null ? d3Var2.equals(e3Var.d()) : e3Var.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f24790a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        d3 d3Var = this.f24791c;
        int iHashCode2 = (iHashCode ^ (d3Var == null ? 0 : d3Var.hashCode())) * 1000003;
        d3 d3Var2 = this.f24792d;
        return iHashCode2 ^ (d3Var2 != null ? d3Var2.hashCode() : 0);
    }

    public String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.f24790a + ", imageCaptureOutputSurface=" + this.b + ", imageAnalysisOutputSurface=" + this.f24791c + ", postviewOutputSurface=" + this.f24792d + "}";
    }
}
