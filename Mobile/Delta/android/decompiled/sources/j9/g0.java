package j9;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21760a = null;
    public Boolean b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f21761c = null;

    public /* synthetic */ g0(byte[] bArr) {
    }

    public final g0 a(String str) {
        this.f21760a = str;
        return this;
    }

    public final g0 b(boolean z10) {
        this.b = Boolean.valueOf(z10);
        return this;
    }

    public final g0 c(boolean z10) {
        this.f21761c = Boolean.valueOf(z10);
        return this;
    }

    public final h0 d() {
        Boolean bool = this.b;
        if (bool == null) {
            throw new IllegalStateException("allowTestKeys must be set");
        }
        if (this.f21761c != null) {
            return new h0(this.f21760a, bool.booleanValue(), false, false, this.f21761c.booleanValue(), false, null);
        }
        throw new IllegalStateException("isGoogleOrPlatformOnly must be set");
    }
}
