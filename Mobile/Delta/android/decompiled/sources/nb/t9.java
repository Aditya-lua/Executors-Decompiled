package nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class t9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26802a;
    public final /* synthetic */ qa b;

    public t9(qa qaVar, AtomicReference atomicReference) {
        this.f26802a = atomicReference;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f26802a;
        synchronized (atomicReference) {
            try {
                try {
                    qa qaVar = this.b;
                    atomicReference.set(qaVar.f26446a.w().C(qaVar.f26446a.L().q(), z4.f26976c0));
                    this.f26802a.notify();
                } catch (Throwable th2) {
                    this.f26802a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
