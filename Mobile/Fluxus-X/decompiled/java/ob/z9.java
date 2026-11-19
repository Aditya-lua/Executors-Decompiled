package ob;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class z9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f28034a;
    public final /* synthetic */ va b;

    public z9(va vaVar, AtomicReference atomicReference) {
        this.f28034a = atomicReference;
        Objects.requireNonNull(vaVar);
        this.b = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f28034a;
        synchronized (atomicReference) {
            try {
                try {
                    va vaVar = this.b;
                    atomicReference.set(Long.valueOf(vaVar.f27641a.w().D(vaVar.f27641a.L().q(), e5.f27233d0)));
                    this.f28034a.notify();
                } catch (Throwable th2) {
                    this.f28034a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
