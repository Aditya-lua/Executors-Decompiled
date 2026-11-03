package m1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends q1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24390h;

    public e(int i10, int i11, int i12) {
        this.f24388f = i10;
        this.f24389g = i11;
        this.f24390h = i12;
    }

    @Override // m1.q1
    public int b() {
        return this.f24390h;
    }

    @Override // m1.q1
    public int c() {
        return this.f24388f;
    }

    @Override // m1.q1
    public int d() {
        return this.f24389g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            if (this.f24388f == q1Var.c() && this.f24389g == q1Var.d() && this.f24390h == q1Var.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f24388f ^ 1000003) * 1000003) ^ this.f24389g) * 1000003) ^ this.f24390h;
    }

    public String toString() {
        return "VideoEncoderDataSpace{standard=" + this.f24388f + ", transfer=" + this.f24389g + ", range=" + this.f24390h + "}";
    }
}
