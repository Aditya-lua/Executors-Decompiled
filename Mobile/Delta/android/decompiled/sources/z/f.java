package z;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36491a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f36493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f36494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f36495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f36496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f36497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Range<Integer> f36498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f36499j;

    public f(int i10, boolean z10, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range<Integer> range, boolean z16) {
        this.f36491a = i10;
        this.b = z10;
        this.f36492c = i11;
        this.f36493d = z11;
        this.f36494e = z12;
        this.f36495f = z13;
        this.f36496g = z14;
        this.f36497h = z15;
        if (range == null) {
            throw new NullPointerException("Null getTargetFpsRange");
        }
        this.f36498i = range;
        this.f36499j = z16;
    }

    @Override // z.g5.d
    public int a() {
        return this.f36491a;
    }

    @Override // z.g5.d
    public int b() {
        return this.f36492c;
    }

    @Override // z.g5.d
    public Range<Integer> c() {
        return this.f36498i;
    }

    @Override // z.g5.d
    public boolean d() {
        return this.b;
    }

    @Override // z.g5.d
    public boolean e() {
        return this.f36496g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g5.d) {
            g5.d dVar = (g5.d) obj;
            if (this.f36491a == dVar.a() && this.b == dVar.d() && this.f36492c == dVar.b() && this.f36493d == dVar.g() && this.f36494e == dVar.i() && this.f36495f == dVar.f() && this.f36496g == dVar.e() && this.f36497h == dVar.k() && this.f36498i.equals(dVar.c()) && this.f36499j == dVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // z.g5.d
    public boolean f() {
        return this.f36495f;
    }

    @Override // z.g5.d
    public boolean g() {
        return this.f36493d;
    }

    @Override // z.g5.d
    public boolean h() {
        return this.f36499j;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f36491a ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.f36492c) * 1000003) ^ (this.f36493d ? 1231 : 1237)) * 1000003) ^ (this.f36494e ? 1231 : 1237)) * 1000003) ^ (this.f36495f ? 1231 : 1237)) * 1000003) ^ (this.f36496g ? 1231 : 1237)) * 1000003) ^ (this.f36497h ? 1231 : 1237)) * 1000003) ^ this.f36498i.hashCode()) * 1000003) ^ (this.f36499j ? 1231 : 1237);
    }

    @Override // z.g5.d
    public boolean i() {
        return this.f36494e;
    }

    @Override // z.g5.d
    public boolean k() {
        return this.f36497h;
    }

    public String toString() {
        return "FeatureSettings{getCameraMode=" + this.f36491a + ", hasVideoCapture=" + this.b + ", getRequiredMaxBitDepth=" + this.f36492c + ", isPreviewStabilizationOn=" + this.f36493d + ", isUltraHdrOn=" + this.f36494e + ", isHighSpeedOn=" + this.f36495f + ", isFeatureComboInvocation=" + this.f36496g + ", requiresFeatureComboQuery=" + this.f36497h + ", getTargetFpsRange=" + this.f36498i + ", isStrictFpsRequired=" + this.f36499j + "}";
    }
}
