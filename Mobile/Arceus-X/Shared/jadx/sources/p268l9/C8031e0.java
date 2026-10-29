package p268l9;

/* JADX INFO: renamed from: l9.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8031e0 implements ComponentCallbacks2C8024c.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8033f f29989a;

    public C8031e0(C8033f c8033f) {
        this.f29989a = c8033f;
    }

    @Override // p268l9.ComponentCallbacks2C8024c.a
    /* JADX INFO: renamed from: a */
    public final void mo25278a(boolean z10) {
        C8033f c8033f = this.f29989a;
        c8033f.f30007s.sendMessage(c8033f.f30007s.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
