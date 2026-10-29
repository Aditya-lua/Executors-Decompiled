package l9;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23027a;
    public final /* synthetic */ j0 b;

    public g0(j0 j0Var, int i10) {
        this.b = j0Var;
        this.f23027a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.i(this.f23027a);
    }
}
