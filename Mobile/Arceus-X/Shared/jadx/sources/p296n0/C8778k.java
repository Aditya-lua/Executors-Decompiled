package p296n0;

/* JADX INFO: renamed from: n0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C8778k extends InterfaceC8721a2.a {

    /* JADX INFO: renamed from: a */
    public final int f31926a;

    /* JADX INFO: renamed from: b */
    public final String f31927b;

    /* JADX INFO: renamed from: c */
    public final int f31928c;

    /* JADX INFO: renamed from: d */
    public final int f31929d;

    /* JADX INFO: renamed from: e */
    public final int f31930e;

    /* JADX INFO: renamed from: f */
    public final int f31931f;

    public C8778k(int i10, String str, int i11, int i12, int i13, int i14) {
        this.f31926a = i10;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f31927b = str;
        this.f31928c = i11;
        this.f31929d = i12;
        this.f31930e = i13;
        this.f31931f = i14;
    }

    @Override // p296n0.InterfaceC8721a2.a
    /* JADX INFO: renamed from: b */
    public int mo34980b() {
        return this.f31928c;
    }

    @Override // p296n0.InterfaceC8721a2.a
    /* JADX INFO: renamed from: c */
    public int mo34981c() {
        return this.f31930e;
    }

    @Override // p296n0.InterfaceC8721a2.a
    /* JADX INFO: renamed from: d */
    public int mo34982d() {
        return this.f31926a;
    }

    @Override // p296n0.InterfaceC8721a2.a
    /* JADX INFO: renamed from: e */
    public String mo34983e() {
        return this.f31927b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC8721a2.a) {
            InterfaceC8721a2.a aVar = (InterfaceC8721a2.a) obj;
            if (this.f31926a == aVar.mo34982d() && this.f31927b.equals(aVar.mo34983e()) && this.f31928c == aVar.mo34980b() && this.f31929d == aVar.mo34985g() && this.f31930e == aVar.mo34981c() && this.f31931f == aVar.mo34984f()) {
                return true;
            }
        }
        return false;
    }

    @Override // p296n0.InterfaceC8721a2.a
    /* JADX INFO: renamed from: f */
    public int mo34984f() {
        return this.f31931f;
    }

    @Override // p296n0.InterfaceC8721a2.a
    /* JADX INFO: renamed from: g */
    public int mo34985g() {
        return this.f31929d;
    }

    public int hashCode() {
        return ((((((((((this.f31926a ^ 1000003) * 1000003) ^ this.f31927b.hashCode()) * 1000003) ^ this.f31928c) * 1000003) ^ this.f31929d) * 1000003) ^ this.f31930e) * 1000003) ^ this.f31931f;
    }

    public String toString() {
        return "AudioProfileProxy{codec=" + this.f31926a + ", mediaType=" + this.f31927b + ", bitrate=" + this.f31928c + ", sampleRate=" + this.f31929d + ", channels=" + this.f31930e + ", profile=" + this.f31931f + "}";
    }
}
