package ob;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ba implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f27121a;
    public final /* synthetic */ va b;

    public ba(va vaVar, AtomicReference atomicReference) {
        this.f27121a = atomicReference;
        Objects.requireNonNull(vaVar);
        this.b = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f27121a;
        synchronized (atomicReference) {
            try {
                try {
                    va vaVar = this.b;
                    atomicReference.set(Double.valueOf(vaVar.f27641a.w().G(vaVar.f27641a.L().q(), e5.f27239f0)));
                    this.f27121a.notify();
                } catch (Throwable th2) {
                    this.f27121a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
