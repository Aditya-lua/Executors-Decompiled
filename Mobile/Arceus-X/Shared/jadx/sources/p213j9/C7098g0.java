package p213j9;

/* JADX INFO: renamed from: j9.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7098g0 {

    /* JADX INFO: renamed from: a */
    public String f27709a = null;

    /* JADX INFO: renamed from: b */
    public Boolean f27710b = null;

    /* JADX INFO: renamed from: c */
    public Boolean f27711c = null;

    public /* synthetic */ C7098g0(byte[] bArr) {
    }

    /* JADX INFO: renamed from: a */
    public final C7098g0 m29882a(String str) {
        this.f27709a = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C7098g0 m29883b(boolean z10) {
        this.f27710b = Boolean.valueOf(z10);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final C7098g0 m29884c(boolean z10) {
        this.f27711c = Boolean.valueOf(z10);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final C7100h0 m29885d() {
        Boolean bool = this.f27710b;
        if (bool == null) {
            throw new IllegalStateException("allowTestKeys must be set");
        }
        if (this.f27711c != null) {
            return new C7100h0(this.f27709a, bool.booleanValue(), false, false, this.f27711c.booleanValue(), false, null);
        }
        throw new IllegalStateException("isGoogleOrPlatformOnly must be set");
    }
}
