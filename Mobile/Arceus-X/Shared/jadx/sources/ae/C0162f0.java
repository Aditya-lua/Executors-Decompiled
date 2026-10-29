package ae;

/* JADX INFO: renamed from: ae.f0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0162f0 {

    /* JADX INFO: renamed from: a */
    public C0169j f532a;

    public /* synthetic */ C0162f0(C0197x c0197x) {
    }

    /* JADX INFO: renamed from: a */
    public final C0162f0 m519a(C0169j c0169j) {
        this.f532a = c0169j;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0188s0 m520b() {
        C0169j c0169j = this.f532a;
        if (c0169j != null) {
            return new C0166h0(c0169j, null);
        }
        throw new IllegalStateException(String.valueOf(C0169j.class.getCanonicalName()).concat(" must be set"));
    }
}
