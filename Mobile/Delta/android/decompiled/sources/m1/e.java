package m1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends q1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f23740h;

    public e(int i10, int i11, int i12) {
        this.f23738f = i10;
        this.f23739g = i11;
        this.f23740h = i12;
    }

    @Override // m1.q1
    public int b() {
        return this.f23740h;
    }

    @Override // m1.q1
    public int c() {
        return this.f23738f;
    }

    @Override // m1.q1
    public int d() {
        return this.f23739g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            if (this.f23738f == q1Var.c() && this.f23739g == q1Var.d() && this.f23740h == q1Var.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f23738f ^ 1000003) * 1000003) ^ this.f23739g) * 1000003) ^ this.f23740h;
    }

    public String toString() {
        return "VideoEncoderDataSpace{standard=" + this.f23738f + ", transfer=" + this.f23739g + ", range=" + this.f23740h + "}";
    }
}
