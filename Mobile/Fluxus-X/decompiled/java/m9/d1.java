package m9;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rb.l f22984a;
    public final /* synthetic */ f1 b;

    public d1(f1 f1Var, rb.l lVar) {
        this.b = f1Var;
        this.f22984a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f1.t2(this.b, this.f22984a);
    }
}
