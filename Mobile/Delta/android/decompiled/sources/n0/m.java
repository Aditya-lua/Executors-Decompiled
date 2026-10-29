package n0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends a2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24745a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f24753j;

    public m(int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f24745a = i10;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.b = str;
        this.f24746c = i11;
        this.f24747d = i12;
        this.f24748e = i13;
        this.f24749f = i14;
        this.f24750g = i15;
        this.f24751h = i16;
        this.f24752i = i17;
        this.f24753j = i18;
    }

    @Override // n0.a2.c
    public int b() {
        return this.f24751h;
    }

    @Override // n0.a2.c
    public int c() {
        return this.f24746c;
    }

    @Override // n0.a2.c
    public int d() {
        return this.f24752i;
    }

    @Override // n0.a2.c
    public int e() {
        return this.f24745a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2.c) {
            a2.c cVar = (a2.c) obj;
            if (this.f24745a == cVar.e() && this.b.equals(cVar.i()) && this.f24746c == cVar.c() && this.f24747d == cVar.f() && this.f24748e == cVar.l() && this.f24749f == cVar.h() && this.f24750g == cVar.j() && this.f24751h == cVar.b() && this.f24752i == cVar.d() && this.f24753j == cVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.a2.c
    public int f() {
        return this.f24747d;
    }

    @Override // n0.a2.c
    public int g() {
        return this.f24753j;
    }

    @Override // n0.a2.c
    public int h() {
        return this.f24749f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f24745a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f24746c) * 1000003) ^ this.f24747d) * 1000003) ^ this.f24748e) * 1000003) ^ this.f24749f) * 1000003) ^ this.f24750g) * 1000003) ^ this.f24751h) * 1000003) ^ this.f24752i) * 1000003) ^ this.f24753j;
    }

    @Override // n0.a2.c
    public String i() {
        return this.b;
    }

    @Override // n0.a2.c
    public int j() {
        return this.f24750g;
    }

    @Override // n0.a2.c
    public int l() {
        return this.f24748e;
    }

    public String toString() {
        return "VideoProfileProxy{codec=" + this.f24745a + ", mediaType=" + this.b + ", bitrate=" + this.f24746c + ", frameRate=" + this.f24747d + ", width=" + this.f24748e + ", height=" + this.f24749f + ", profile=" + this.f24750g + ", bitDepth=" + this.f24751h + ", chromaSubsampling=" + this.f24752i + ", hdrFormat=" + this.f24753j + "}";
    }
}
