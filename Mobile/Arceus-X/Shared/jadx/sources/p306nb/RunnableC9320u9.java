package p306nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: nb.u9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9320u9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f33534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9257qa f33535b;

    public RunnableC9320u9(C9257qa c9257qa, AtomicReference atomicReference) {
        this.f33534a = atomicReference;
        Objects.requireNonNull(c9257qa);
        this.f33535b = c9257qa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f33534a;
        synchronized (atomicReference) {
            try {
                try {
                    C9257qa c9257qa = this.f33535b;
                    atomicReference.set(Long.valueOf(c9257qa.f33067a.m36338w().m36402D(c9257qa.f33067a.m36317L().m36432q(), C9395z4.f33767d0)));
                    this.f33534a.notify();
                } catch (Throwable th2) {
                    this.f33534a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
