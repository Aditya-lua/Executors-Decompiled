package p306nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: nb.t9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9304t9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f33500a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9257qa f33501b;

    public RunnableC9304t9(C9257qa c9257qa, AtomicReference atomicReference) {
        this.f33500a = atomicReference;
        Objects.requireNonNull(c9257qa);
        this.f33501b = c9257qa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f33500a;
        synchronized (atomicReference) {
            try {
                try {
                    C9257qa c9257qa = this.f33501b;
                    atomicReference.set(c9257qa.f33067a.m36338w().m36401C(c9257qa.f33067a.m36317L().m36432q(), C9395z4.f33764c0));
                    this.f33500a.notify();
                } catch (Throwable th2) {
                    this.f33500a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
