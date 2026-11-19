package n0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends a2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25043a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f25047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f25048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f25049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f25050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f25051j;

    public m(int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f25043a = i10;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.b = str;
        this.f25044c = i11;
        this.f25045d = i12;
        this.f25046e = i13;
        this.f25047f = i14;
        this.f25048g = i15;
        this.f25049h = i16;
        this.f25050i = i17;
        this.f25051j = i18;
    }

    @Override // n0.a2.c
    public int b() {
        return this.f25049h;
    }

    @Override // n0.a2.c
    public int c() {
        return this.f25044c;
    }

    @Override // n0.a2.c
    public int d() {
        return this.f25050i;
    }

    @Override // n0.a2.c
    public int e() {
        return this.f25043a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2.c) {
            a2.c cVar = (a2.c) obj;
            if (this.f25043a == cVar.e() && this.b.equals(cVar.i()) && this.f25044c == cVar.c() && this.f25045d == cVar.f() && this.f25046e == cVar.l() && this.f25047f == cVar.h() && this.f25048g == cVar.j() && this.f25049h == cVar.b() && this.f25050i == cVar.d() && this.f25051j == cVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.a2.c
    public int f() {
        return this.f25045d;
    }

    @Override // n0.a2.c
    public int g() {
        return this.f25051j;
    }

    @Override // n0.a2.c
    public int h() {
        return this.f25047f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f25043a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f25044c) * 1000003) ^ this.f25045d) * 1000003) ^ this.f25046e) * 1000003) ^ this.f25047f) * 1000003) ^ this.f25048g) * 1000003) ^ this.f25049h) * 1000003) ^ this.f25050i) * 1000003) ^ this.f25051j;
    }

    @Override // n0.a2.c
    public String i() {
        return this.b;
    }

    @Override // n0.a2.c
    public int j() {
        return this.f25048g;
    }

    @Override // n0.a2.c
    public int l() {
        return this.f25046e;
    }

    public String toString() {
        return "VideoProfileProxy{codec=" + this.f25043a + ", mediaType=" + this.b + ", bitrate=" + this.f25044c + ", frameRate=" + this.f25045d + ", width=" + this.f25046e + ", height=" + this.f25047f + ", profile=" + this.f25048g + ", bitDepth=" + this.f25049h + ", chromaSubsampling=" + this.f25050i + ", hdrFormat=" + this.f25051j + "}";
    }
}
