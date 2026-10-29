package sb;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: sb.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11273o0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C11271n0 f39591a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Callable f39592b;

    public RunnableC11273o0(C11271n0 c11271n0, Callable callable) {
        this.f39591a = c11271n0;
        this.f39592b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f39591a.m42344q(this.f39592b.call());
        } catch (Exception e10) {
            this.f39591a.m42343p(e10);
        } catch (Throwable th2) {
            this.f39591a.m42343p(new RuntimeException(th2));
        }
    }
}
