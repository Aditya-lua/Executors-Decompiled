package n0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends a2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25012a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f25016f;

    public k(int i10, String str, int i11, int i12, int i13, int i14) {
        this.f25012a = i10;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.b = str;
        this.f25013c = i11;
        this.f25014d = i12;
        this.f25015e = i13;
        this.f25016f = i14;
    }

    @Override // n0.a2.a
    public int b() {
        return this.f25013c;
    }

    @Override // n0.a2.a
    public int c() {
        return this.f25015e;
    }

    @Override // n0.a2.a
    public int d() {
        return this.f25012a;
    }

    @Override // n0.a2.a
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2.a) {
            a2.a aVar = (a2.a) obj;
            if (this.f25012a == aVar.d() && this.b.equals(aVar.e()) && this.f25013c == aVar.b() && this.f25014d == aVar.g() && this.f25015e == aVar.c() && this.f25016f == aVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.a2.a
    public int f() {
        return this.f25016f;
    }

    @Override // n0.a2.a
    public int g() {
        return this.f25014d;
    }

    public int hashCode() {
        return ((((((((((this.f25012a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f25013c) * 1000003) ^ this.f25014d) * 1000003) ^ this.f25015e) * 1000003) ^ this.f25016f;
    }

    public String toString() {
        return "AudioProfileProxy{codec=" + this.f25012a + ", mediaType=" + this.b + ", bitrate=" + this.f25013c + ", sampleRate=" + this.f25014d + ", channels=" + this.f25015e + ", profile=" + this.f25016f + "}";
    }
}
