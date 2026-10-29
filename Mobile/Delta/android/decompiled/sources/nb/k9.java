package nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class k9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f25696a;
    public final /* synthetic */ qa b;

    public k9(qa qaVar, AtomicReference atomicReference) {
        this.f25696a = atomicReference;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f25696a;
        synchronized (atomicReference) {
            try {
                try {
                    qa qaVar = this.b;
                    atomicReference.set(Boolean.valueOf(qaVar.f25625a.w().H(qaVar.f25625a.L().q(), z4.f26152b0)));
                    this.f25696a.notify();
                } catch (Throwable th2) {
                    this.f25696a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
