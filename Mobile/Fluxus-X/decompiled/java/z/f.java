package z;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38291a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f38294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f38295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f38296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f38297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Range<Integer> f38298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f38299j;

    public f(int i10, boolean z10, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range<Integer> range, boolean z16) {
        this.f38291a = i10;
        this.b = z10;
        this.f38292c = i11;
        this.f38293d = z11;
        this.f38294e = z12;
        this.f38295f = z13;
        this.f38296g = z14;
        this.f38297h = z15;
        if (range == null) {
            throw new NullPointerException("Null getTargetFpsRange");
        }
        this.f38298i = range;
        this.f38299j = z16;
    }

    @Override // z.g5.d
    public int a() {
        return this.f38291a;
    }

    @Override // z.g5.d
    public int b() {
        return this.f38292c;
    }

    @Override // z.g5.d
    public Range<Integer> c() {
        return this.f38298i;
    }

    @Override // z.g5.d
    public boolean d() {
        return this.b;
    }

    @Override // z.g5.d
    public boolean e() {
        return this.f38296g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g5.d) {
            g5.d dVar = (g5.d) obj;
            if (this.f38291a == dVar.a() && this.b == dVar.d() && this.f38292c == dVar.b() && this.f38293d == dVar.g() && this.f38294e == dVar.i() && this.f38295f == dVar.f() && this.f38296g == dVar.e() && this.f38297h == dVar.k() && this.f38298i.equals(dVar.c()) && this.f38299j == dVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // z.g5.d
    public boolean f() {
        return this.f38295f;
    }

    @Override // z.g5.d
    public boolean g() {
        return this.f38293d;
    }

    @Override // z.g5.d
    public boolean h() {
        return this.f38299j;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f38291a ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.f38292c) * 1000003) ^ (this.f38293d ? 1231 : 1237)) * 1000003) ^ (this.f38294e ? 1231 : 1237)) * 1000003) ^ (this.f38295f ? 1231 : 1237)) * 1000003) ^ (this.f38296g ? 1231 : 1237)) * 1000003) ^ (this.f38297h ? 1231 : 1237)) * 1000003) ^ this.f38298i.hashCode()) * 1000003) ^ (this.f38299j ? 1231 : 1237);
    }

    @Override // z.g5.d
    public boolean i() {
        return this.f38294e;
    }

    @Override // z.g5.d
    public boolean k() {
        return this.f38297h;
    }

    public String toString() {
        return "FeatureSettings{getCameraMode=" + this.f38291a + ", hasVideoCapture=" + this.b + ", getRequiredMaxBitDepth=" + this.f38292c + ", isPreviewStabilizationOn=" + this.f38293d + ", isUltraHdrOn=" + this.f38294e + ", isHighSpeedOn=" + this.f38295f + ", isFeatureComboInvocation=" + this.f38296g + ", requiresFeatureComboQuery=" + this.f38297h + ", getTargetFpsRange=" + this.f38298i + ", isStrictFpsRequired=" + this.f38299j + "}";
    }
}
