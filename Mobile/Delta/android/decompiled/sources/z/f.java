package z;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37186a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f37188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f37189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f37190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f37191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f37192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Range<Integer> f37193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f37194j;

    public f(int i10, boolean z10, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range<Integer> range, boolean z16) {
        this.f37186a = i10;
        this.b = z10;
        this.f37187c = i11;
        this.f37188d = z11;
        this.f37189e = z12;
        this.f37190f = z13;
        this.f37191g = z14;
        this.f37192h = z15;
        if (range == null) {
            throw new NullPointerException("Null getTargetFpsRange");
        }
        this.f37193i = range;
        this.f37194j = z16;
    }

    @Override // z.g5.d
    public int a() {
        return this.f37186a;
    }

    @Override // z.g5.d
    public int b() {
        return this.f37187c;
    }

    @Override // z.g5.d
    public Range<Integer> c() {
        return this.f37193i;
    }

    @Override // z.g5.d
    public boolean d() {
        return this.b;
    }

    @Override // z.g5.d
    public boolean e() {
        return this.f37191g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g5.d) {
            g5.d dVar = (g5.d) obj;
            if (this.f37186a == dVar.a() && this.b == dVar.d() && this.f37187c == dVar.b() && this.f37188d == dVar.g() && this.f37189e == dVar.i() && this.f37190f == dVar.f() && this.f37191g == dVar.e() && this.f37192h == dVar.k() && this.f37193i.equals(dVar.c()) && this.f37194j == dVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // z.g5.d
    public boolean f() {
        return this.f37190f;
    }

    @Override // z.g5.d
    public boolean g() {
        return this.f37188d;
    }

    @Override // z.g5.d
    public boolean h() {
        return this.f37194j;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f37186a ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.f37187c) * 1000003) ^ (this.f37188d ? 1231 : 1237)) * 1000003) ^ (this.f37189e ? 1231 : 1237)) * 1000003) ^ (this.f37190f ? 1231 : 1237)) * 1000003) ^ (this.f37191g ? 1231 : 1237)) * 1000003) ^ (this.f37192h ? 1231 : 1237)) * 1000003) ^ this.f37193i.hashCode()) * 1000003) ^ (this.f37194j ? 1231 : 1237);
    }

    @Override // z.g5.d
    public boolean i() {
        return this.f37189e;
    }

    @Override // z.g5.d
    public boolean k() {
        return this.f37192h;
    }

    public String toString() {
        return "FeatureSettings{getCameraMode=" + this.f37186a + ", hasVideoCapture=" + this.b + ", getRequiredMaxBitDepth=" + this.f37187c + ", isPreviewStabilizationOn=" + this.f37188d + ", isUltraHdrOn=" + this.f37189e + ", isHighSpeedOn=" + this.f37190f + ", isFeatureComboInvocation=" + this.f37191g + ", requiresFeatureComboQuery=" + this.f37192h + ", getTargetFpsRange=" + this.f37193i + ", isStrictFpsRequired=" + this.f37194j + "}";
    }
}
