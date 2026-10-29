package p306nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: nb.k9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9160k9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f33145a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9257qa f33146b;

    public RunnableC9160k9(C9257qa c9257qa, AtomicReference atomicReference) {
        this.f33145a = atomicReference;
        Objects.requireNonNull(c9257qa);
        this.f33146b = c9257qa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f33145a;
        synchronized (atomicReference) {
            try {
                try {
                    C9257qa c9257qa = this.f33146b;
                    atomicReference.set(Boolean.valueOf(c9257qa.f33067a.m36338w().m36406H(c9257qa.f33067a.m36317L().m36432q(), C9395z4.f33761b0)));
                    this.f33145a.notify();
                } catch (Throwable th2) {
                    this.f33145a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
