package n0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends a2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25566a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f25570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f25571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f25572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f25573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f25574j;

    public m(int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f25566a = i10;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.b = str;
        this.f25567c = i11;
        this.f25568d = i12;
        this.f25569e = i13;
        this.f25570f = i14;
        this.f25571g = i15;
        this.f25572h = i16;
        this.f25573i = i17;
        this.f25574j = i18;
    }

    @Override // n0.a2.c
    public int b() {
        return this.f25572h;
    }

    @Override // n0.a2.c
    public int c() {
        return this.f25567c;
    }

    @Override // n0.a2.c
    public int d() {
        return this.f25573i;
    }

    @Override // n0.a2.c
    public int e() {
        return this.f25566a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2.c) {
            a2.c cVar = (a2.c) obj;
            if (this.f25566a == cVar.e() && this.b.equals(cVar.i()) && this.f25567c == cVar.c() && this.f25568d == cVar.f() && this.f25569e == cVar.l() && this.f25570f == cVar.h() && this.f25571g == cVar.j() && this.f25572h == cVar.b() && this.f25573i == cVar.d() && this.f25574j == cVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.a2.c
    public int f() {
        return this.f25568d;
    }

    @Override // n0.a2.c
    public int g() {
        return this.f25574j;
    }

    @Override // n0.a2.c
    public int h() {
        return this.f25570f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f25566a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f25567c) * 1000003) ^ this.f25568d) * 1000003) ^ this.f25569e) * 1000003) ^ this.f25570f) * 1000003) ^ this.f25571g) * 1000003) ^ this.f25572h) * 1000003) ^ this.f25573i) * 1000003) ^ this.f25574j;
    }

    @Override // n0.a2.c
    public String i() {
        return this.b;
    }

    @Override // n0.a2.c
    public int j() {
        return this.f25571g;
    }

    @Override // n0.a2.c
    public int l() {
        return this.f25569e;
    }

    public String toString() {
        return "VideoProfileProxy{codec=" + this.f25566a + ", mediaType=" + this.b + ", bitrate=" + this.f25567c + ", frameRate=" + this.f25568d + ", width=" + this.f25569e + ", height=" + this.f25570f + ", profile=" + this.f25571g + ", bitDepth=" + this.f25572h + ", chromaSubsampling=" + this.f25573i + ", hdrFormat=" + this.f25574j + "}";
    }
}
