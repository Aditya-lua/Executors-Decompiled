package p306nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: nb.w9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9352w9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f33609a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9257qa f33610b;

    public RunnableC9352w9(C9257qa c9257qa, AtomicReference atomicReference) {
        this.f33609a = atomicReference;
        Objects.requireNonNull(c9257qa);
        this.f33610b = c9257qa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f33609a;
        synchronized (atomicReference) {
            try {
                try {
                    C9257qa c9257qa = this.f33610b;
                    atomicReference.set(Double.valueOf(c9257qa.f33067a.m36338w().m36405G(c9257qa.f33067a.m36317L().m36432q(), C9395z4.f33773f0)));
                    this.f33609a.notify();
                } catch (Throwable th2) {
                    this.f33609a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
