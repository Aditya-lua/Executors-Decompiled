package p296n0;

/* JADX INFO: renamed from: n0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C8788m extends InterfaceC8721a2.c {

    /* JADX INFO: renamed from: a */
    public final int f31962a;

    /* JADX INFO: renamed from: b */
    public final String f31963b;

    /* JADX INFO: renamed from: c */
    public final int f31964c;

    /* JADX INFO: renamed from: d */
    public final int f31965d;

    /* JADX INFO: renamed from: e */
    public final int f31966e;

    /* JADX INFO: renamed from: f */
    public final int f31967f;

    /* JADX INFO: renamed from: g */
    public final int f31968g;

    /* JADX INFO: renamed from: h */
    public final int f31969h;

    /* JADX INFO: renamed from: i */
    public final int f31970i;

    /* JADX INFO: renamed from: j */
    public final int f31971j;

    public C8788m(int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f31962a = i10;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f31963b = str;
        this.f31964c = i11;
        this.f31965d = i12;
        this.f31966e = i13;
        this.f31967f = i14;
        this.f31968g = i15;
        this.f31969h = i16;
        this.f31970i = i17;
        this.f31971j = i18;
    }

    @Override // p296n0.InterfaceC8721a2.c
    /* JADX INFO: renamed from: b */
    public int mo34988b() {
        return this.f31969h;
    }

    @Override // p296n0.InterfaceC8721a2.c
    /* JADX INFO: renamed from: c */
    public int mo34989c() {
        return this.f31964c;
    }

    @Override // p296n0.InterfaceC8721a2.c
    /* JADX INFO: renamed from: d */
    public int mo34990d() {
        return this.f31970i;
    }

    @Override // p296n0.InterfaceC8721a2.c
    /* JADX INFO: renamed from: e */
    public int mo34991e() {
        return this.f31962a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC8721a2.c) {
            InterfaceC8721a2.c cVar = (InterfaceC8721a2.c) obj;
            if (this.f31962a == cVar.mo34991e() && this.f31963b.equals(cVar.mo34995i()) && this.f31964c == cVar.mo34989c() && this.f31965d == cVar.mo34992f() && this.f31966e == cVar.mo34998l() && this.f31967f == cVar.mo34994h() && this.f31968g == cVar.mo34996j() && this.f31969h == cVar.mo34988b() && this.f31970i == cVar.mo34990d() && this.f31971j == cVar.mo34993g()) {
                return true;
            }
        }
        return false;
    }

    @Override // p296n0.InterfaceC8721a2.c
    /* JADX INFO: renamed from: f */
    public int mo34992f() {
        return this.f31965d;
    }

    @Override // p296n0.InterfaceC8721a2.c
    /* JADX INFO: renamed from: g */
    public int mo34993g() {
        return this.f31971j;
    }

    @Override // p296n0.InterfaceC8721a2.c
    /* JADX INFO: renamed from: h */
    public int mo34994h() {
        return this.f31967f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f31962a ^ 1000003) * 1000003) ^ this.f31963b.hashCode()) * 1000003) ^ this.f31964c) * 1000003) ^ this.f31965d) * 1000003) ^ this.f31966e) * 1000003) ^ this.f31967f) * 1000003) ^ this.f31968g) * 1000003) ^ this.f31969h) * 1000003) ^ this.f31970i) * 1000003) ^ this.f31971j;
    }

    @Override // p296n0.InterfaceC8721a2.c
    /* JADX INFO: renamed from: i */
    public String mo34995i() {
        return this.f31963b;
    }

    @Override // p296n0.InterfaceC8721a2.c
    /* JADX INFO: renamed from: j */
    public int mo34996j() {
        return this.f31968g;
    }

    @Override // p296n0.InterfaceC8721a2.c
    /* JADX INFO: renamed from: l */
    public int mo34998l() {
        return this.f31966e;
    }

    public String toString() {
        return "VideoProfileProxy{codec=" + this.f31962a + ", mediaType=" + this.f31963b + ", bitrate=" + this.f31964c + ", frameRate=" + this.f31965d + ", width=" + this.f31966e + ", height=" + this.f31967f + ", profile=" + this.f31968g + ", bitDepth=" + this.f31969h + ", chromaSubsampling=" + this.f31970i + ", hdrFormat=" + this.f31971j + "}";
    }
}
