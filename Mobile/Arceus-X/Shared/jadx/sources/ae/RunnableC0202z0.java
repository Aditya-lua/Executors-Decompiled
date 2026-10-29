package ae;

/* JADX INFO: renamed from: ae.z0 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0202z0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0159e f605a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f606b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f607c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0151a1 f608d;

    public RunnableC0202z0(C0151a1 c0151a1, AbstractC0159e abstractC0159e, int i10, int i11) {
        this.f608d = c0151a1;
        this.f605a = abstractC0159e;
        this.f606b = i10;
        this.f607c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0151a1 c0151a1 = this.f608d;
        AbstractC0159e abstractC0159e = this.f605a;
        c0151a1.m482j(new C0163g(abstractC0159e.mo510h(), this.f606b, this.f607c, abstractC0159e.mo504a(), abstractC0159e.mo512j(), abstractC0159e.mo514l(), abstractC0159e.mo513k(), abstractC0159e.mo509g(), abstractC0159e.mo515m()));
    }
}
