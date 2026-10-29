package l9;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f23030a;

    public h0(i0 i0Var) {
        this.f23030a = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j0 j0Var = this.f23030a.f23032a;
        j0Var.b.disconnect(j0Var.b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
