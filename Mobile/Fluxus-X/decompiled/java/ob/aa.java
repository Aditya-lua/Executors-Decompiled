package ob;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class aa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f27077a;
    public final /* synthetic */ va b;

    public aa(va vaVar, AtomicReference atomicReference) {
        this.f27077a = atomicReference;
        Objects.requireNonNull(vaVar);
        this.b = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f27077a;
        synchronized (atomicReference) {
            try {
                try {
                    va vaVar = this.b;
                    atomicReference.set(Integer.valueOf(vaVar.f27641a.w().E(vaVar.f27641a.L().q(), e5.f27236e0)));
                    this.f27077a.notify();
                } catch (Throwable th2) {
                    this.f27077a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
