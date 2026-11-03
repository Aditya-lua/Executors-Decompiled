package n0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends a2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25535a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f25539f;

    public k(int i10, String str, int i11, int i12, int i13, int i14) {
        this.f25535a = i10;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.b = str;
        this.f25536c = i11;
        this.f25537d = i12;
        this.f25538e = i13;
        this.f25539f = i14;
    }

    @Override // n0.a2.a
    public int b() {
        return this.f25536c;
    }

    @Override // n0.a2.a
    public int c() {
        return this.f25538e;
    }

    @Override // n0.a2.a
    public int d() {
        return this.f25535a;
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
            if (this.f25535a == aVar.d() && this.b.equals(aVar.e()) && this.f25536c == aVar.b() && this.f25537d == aVar.g() && this.f25538e == aVar.c() && this.f25539f == aVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.a2.a
    public int f() {
        return this.f25539f;
    }

    @Override // n0.a2.a
    public int g() {
        return this.f25537d;
    }

    public int hashCode() {
        return ((((((((((this.f25535a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f25536c) * 1000003) ^ this.f25537d) * 1000003) ^ this.f25538e) * 1000003) ^ this.f25539f;
    }

    public String toString() {
        return "AudioProfileProxy{codec=" + this.f25535a + ", mediaType=" + this.b + ", bitrate=" + this.f25536c + ", sampleRate=" + this.f25537d + ", channels=" + this.f25538e + ", profile=" + this.f25539f + "}";
    }
}
