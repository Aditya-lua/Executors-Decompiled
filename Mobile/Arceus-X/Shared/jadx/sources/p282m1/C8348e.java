package p282m1;

/* JADX INFO: renamed from: m1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8348e extends AbstractC8386q1 {

    /* JADX INFO: renamed from: f */
    public final int f30798f;

    /* JADX INFO: renamed from: g */
    public final int f30799g;

    /* JADX INFO: renamed from: h */
    public final int f30800h;

    public C8348e(int i10, int i11, int i12) {
        this.f30798f = i10;
        this.f30799g = i11;
        this.f30800h = i12;
    }

    @Override // p282m1.AbstractC8386q1
    /* JADX INFO: renamed from: b */
    public int mo33927b() {
        return this.f30800h;
    }

    @Override // p282m1.AbstractC8386q1
    /* JADX INFO: renamed from: c */
    public int mo33928c() {
        return this.f30798f;
    }

    @Override // p282m1.AbstractC8386q1
    /* JADX INFO: renamed from: d */
    public int mo33929d() {
        return this.f30799g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8386q1) {
            AbstractC8386q1 abstractC8386q1 = (AbstractC8386q1) obj;
            if (this.f30798f == abstractC8386q1.mo33928c() && this.f30799g == abstractC8386q1.mo33929d() && this.f30800h == abstractC8386q1.mo33927b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f30798f ^ 1000003) * 1000003) ^ this.f30799g) * 1000003) ^ this.f30800h;
    }

    public String toString() {
        return "VideoEncoderDataSpace{standard=" + this.f30798f + ", transfer=" + this.f30799g + ", range=" + this.f30800h + "}";
    }
}
