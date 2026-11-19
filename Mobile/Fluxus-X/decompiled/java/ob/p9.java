package ob;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class p9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f27711a;
    public final /* synthetic */ va b;

    public p9(va vaVar, AtomicReference atomicReference) {
        this.f27711a = atomicReference;
        Objects.requireNonNull(vaVar);
        this.b = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f27711a;
        synchronized (atomicReference) {
            try {
                try {
                    va vaVar = this.b;
                    atomicReference.set(Boolean.valueOf(vaVar.f27641a.w().H(vaVar.f27641a.L().q(), e5.f27227b0)));
                    this.f27711a.notify();
                } catch (Throwable th2) {
                    this.f27711a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
