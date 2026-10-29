package nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class w9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26072a;
    public final /* synthetic */ qa b;

    public w9(qa qaVar, AtomicReference atomicReference) {
        this.f26072a = atomicReference;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f26072a;
        synchronized (atomicReference) {
            try {
                try {
                    qa qaVar = this.b;
                    atomicReference.set(Double.valueOf(qaVar.f25625a.w().G(qaVar.f25625a.L().q(), z4.f26164f0)));
                    this.f26072a.notify();
                } catch (Throwable th2) {
                    this.f26072a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
