package k9;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21270a = null;
    public Boolean b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f21271c = null;

    public /* synthetic */ l0(byte[] bArr) {
    }

    public final l0 a(String str) {
        this.f21270a = str;
        return this;
    }

    public final l0 b(boolean z10) {
        this.b = Boolean.valueOf(z10);
        return this;
    }

    public final l0 c(boolean z10) {
        this.f21271c = Boolean.valueOf(z10);
        return this;
    }

    public final m0 d() {
        Boolean bool = this.b;
        if (bool == null) {
            throw new IllegalStateException("allowTestKeys must be set");
        }
        if (this.f21271c != null) {
            return new m0(this.f21270a, bool.booleanValue(), false, false, this.f21271c.booleanValue(), false, null);
        }
        throw new IllegalStateException("isGoogleOrPlatformOnly must be set");
    }
}
