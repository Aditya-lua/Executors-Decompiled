package p589z;

import android.util.Range;

/* JADX INFO: renamed from: z.f */
/* JADX INFO: loaded from: classes.dex */
public final class C13515f extends C13529g5.d {

    /* JADX INFO: renamed from: a */
    public final int f47278a;

    /* JADX INFO: renamed from: b */
    public final boolean f47279b;

    /* JADX INFO: renamed from: c */
    public final int f47280c;

    /* JADX INFO: renamed from: d */
    public final boolean f47281d;

    /* JADX INFO: renamed from: e */
    public final boolean f47282e;

    /* JADX INFO: renamed from: f */
    public final boolean f47283f;

    /* JADX INFO: renamed from: g */
    public final boolean f47284g;

    /* JADX INFO: renamed from: h */
    public final boolean f47285h;

    /* JADX INFO: renamed from: i */
    public final Range<Integer> f47286i;

    /* JADX INFO: renamed from: j */
    public final boolean f47287j;

    public C13515f(int i10, boolean z10, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, Range<Integer> range, boolean z16) {
        this.f47278a = i10;
        this.f47279b = z10;
        this.f47280c = i11;
        this.f47281d = z11;
        this.f47282e = z12;
        this.f47283f = z13;
        this.f47284g = z14;
        this.f47285h = z15;
        if (range == null) {
            throw new NullPointerException("Null getTargetFpsRange");
        }
        this.f47286i = range;
        this.f47287j = z16;
    }

    @Override // p589z.C13529g5.d
    /* JADX INFO: renamed from: a */
    public int mo49221a() {
        return this.f47278a;
    }

    @Override // p589z.C13529g5.d
    /* JADX INFO: renamed from: b */
    public int mo49222b() {
        return this.f47280c;
    }

    @Override // p589z.C13529g5.d
    /* JADX INFO: renamed from: c */
    public Range<Integer> mo49223c() {
        return this.f47286i;
    }

    @Override // p589z.C13529g5.d
    /* JADX INFO: renamed from: d */
    public boolean mo49224d() {
        return this.f47279b;
    }

    @Override // p589z.C13529g5.d
    /* JADX INFO: renamed from: e */
    public boolean mo49225e() {
        return this.f47284g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13529g5.d) {
            C13529g5.d dVar = (C13529g5.d) obj;
            if (this.f47278a == dVar.mo49221a() && this.f47279b == dVar.mo49224d() && this.f47280c == dVar.mo49222b() && this.f47281d == dVar.mo49227g() && this.f47282e == dVar.mo49229i() && this.f47283f == dVar.mo49226f() && this.f47284g == dVar.mo49225e() && this.f47285h == dVar.mo49230k() && this.f47286i.equals(dVar.mo49223c()) && this.f47287j == dVar.mo49228h()) {
                return true;
            }
        }
        return false;
    }

    @Override // p589z.C13529g5.d
    /* JADX INFO: renamed from: f */
    public boolean mo49226f() {
        return this.f47283f;
    }

    @Override // p589z.C13529g5.d
    /* JADX INFO: renamed from: g */
    public boolean mo49227g() {
        return this.f47281d;
    }

    @Override // p589z.C13529g5.d
    /* JADX INFO: renamed from: h */
    public boolean mo49228h() {
        return this.f47287j;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f47278a ^ 1000003) * 1000003) ^ (this.f47279b ? 1231 : 1237)) * 1000003) ^ this.f47280c) * 1000003) ^ (this.f47281d ? 1231 : 1237)) * 1000003) ^ (this.f47282e ? 1231 : 1237)) * 1000003) ^ (this.f47283f ? 1231 : 1237)) * 1000003) ^ (this.f47284g ? 1231 : 1237)) * 1000003) ^ (this.f47285h ? 1231 : 1237)) * 1000003) ^ this.f47286i.hashCode()) * 1000003) ^ (this.f47287j ? 1231 : 1237);
    }

    @Override // p589z.C13529g5.d
    /* JADX INFO: renamed from: i */
    public boolean mo49229i() {
        return this.f47282e;
    }

    @Override // p589z.C13529g5.d
    /* JADX INFO: renamed from: k */
    public boolean mo49230k() {
        return this.f47285h;
    }

    public String toString() {
        return "FeatureSettings{getCameraMode=" + this.f47278a + ", hasVideoCapture=" + this.f47279b + ", getRequiredMaxBitDepth=" + this.f47280c + ", isPreviewStabilizationOn=" + this.f47281d + ", isUltraHdrOn=" + this.f47282e + ", isHighSpeedOn=" + this.f47283f + ", isFeatureComboInvocation=" + this.f47284g + ", requiresFeatureComboQuery=" + this.f47285h + ", getTargetFpsRange=" + this.f47286i + ", isStrictFpsRequired=" + this.f47287j + "}";
    }
}
