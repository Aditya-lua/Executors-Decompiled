package n0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends a2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24714a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24718f;

    public k(int i10, String str, int i11, int i12, int i13, int i14) {
        this.f24714a = i10;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.b = str;
        this.f24715c = i11;
        this.f24716d = i12;
        this.f24717e = i13;
        this.f24718f = i14;
    }

    @Override // n0.a2.a
    public int b() {
        return this.f24715c;
    }

    @Override // n0.a2.a
    public int c() {
        return this.f24717e;
    }

    @Override // n0.a2.a
    public int d() {
        return this.f24714a;
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
            if (this.f24714a == aVar.d() && this.b.equals(aVar.e()) && this.f24715c == aVar.b() && this.f24716d == aVar.g() && this.f24717e == aVar.c() && this.f24718f == aVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.a2.a
    public int f() {
        return this.f24718f;
    }

    @Override // n0.a2.a
    public int g() {
        return this.f24716d;
    }

    public int hashCode() {
        return ((((((((((this.f24714a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f24715c) * 1000003) ^ this.f24716d) * 1000003) ^ this.f24717e) * 1000003) ^ this.f24718f;
    }

    public String toString() {
        return "AudioProfileProxy{codec=" + this.f24714a + ", mediaType=" + this.b + ", bitrate=" + this.f24715c + ", sampleRate=" + this.f24716d + ", channels=" + this.f24717e + ", profile=" + this.f24718f + "}";
    }
}
