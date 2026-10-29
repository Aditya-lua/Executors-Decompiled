package nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class u9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26009a;
    public final /* synthetic */ qa b;

    public u9(qa qaVar, AtomicReference atomicReference) {
        this.f26009a = atomicReference;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f26009a;
        synchronized (atomicReference) {
            try {
                try {
                    qa qaVar = this.b;
                    atomicReference.set(Long.valueOf(qaVar.f25625a.w().D(qaVar.f25625a.L().q(), z4.f26158d0)));
                    this.f26009a.notify();
                } catch (Throwable th2) {
                    this.f26009a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
