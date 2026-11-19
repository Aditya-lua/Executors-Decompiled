package m1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends q1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22750h;

    public e(int i10, int i11, int i12) {
        this.f22748f = i10;
        this.f22749g = i11;
        this.f22750h = i12;
    }

    @Override // m1.q1
    public int b() {
        return this.f22750h;
    }

    @Override // m1.q1
    public int c() {
        return this.f22748f;
    }

    @Override // m1.q1
    public int d() {
        return this.f22749g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            if (this.f22748f == q1Var.c() && this.f22749g == q1Var.d() && this.f22750h == q1Var.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f22748f ^ 1000003) * 1000003) ^ this.f22749g) * 1000003) ^ this.f22750h;
    }

    public String toString() {
        return "VideoEncoderDataSpace{standard=" + this.f22748f + ", transfer=" + this.f22749g + ", range=" + this.f22750h + "}";
    }
}
