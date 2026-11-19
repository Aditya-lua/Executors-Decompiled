package ob;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class y9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f27996a;
    public final /* synthetic */ va b;

    public y9(va vaVar, AtomicReference atomicReference) {
        this.f27996a = atomicReference;
        Objects.requireNonNull(vaVar);
        this.b = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f27996a;
        synchronized (atomicReference) {
            try {
                try {
                    va vaVar = this.b;
                    atomicReference.set(vaVar.f27641a.w().C(vaVar.f27641a.L().q(), e5.f27230c0));
                    this.f27996a.notify();
                } catch (Throwable th2) {
                    this.f27996a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
