package p268l9;

/* JADX INFO: renamed from: l9.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8040h0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8043i0 f30022a;

    public RunnableC8040h0(C8043i0 c8043i0) {
        this.f30022a = c8043i0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8046j0 c8046j0 = this.f30022a.f30024a;
        c8046j0.f30027b.disconnect(c8046j0.f30027b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
