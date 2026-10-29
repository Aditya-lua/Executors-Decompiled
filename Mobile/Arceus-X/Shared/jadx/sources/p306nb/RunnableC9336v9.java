package p306nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: nb.v9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9336v9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f33560a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9257qa f33561b;

    public RunnableC9336v9(C9257qa c9257qa, AtomicReference atomicReference) {
        this.f33560a = atomicReference;
        Objects.requireNonNull(c9257qa);
        this.f33561b = c9257qa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f33560a;
        synchronized (atomicReference) {
            try {
                try {
                    C9257qa c9257qa = this.f33561b;
                    atomicReference.set(Integer.valueOf(c9257qa.f33067a.m36338w().m36403E(c9257qa.f33067a.m36317L().m36432q(), C9395z4.f33770e0)));
                    this.f33560a.notify();
                } catch (Throwable th2) {
                    this.f33560a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
