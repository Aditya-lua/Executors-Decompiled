package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c2 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2463c2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC2529i2 f8941a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2452b2 f8942b;

    public RunnableC2463c2(InterfaceFutureC2529i2 interfaceFutureC2529i2, InterfaceC2452b2 interfaceC2452b2) {
        this.f8941a = interfaceFutureC2529i2;
        this.f8942b = interfaceC2452b2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.internal.play_billing.i2 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thM11640a;
        InterfaceFutureC2529i2 interfaceFutureC2529i2 = this.f8941a;
        if ((interfaceFutureC2529i2 instanceof AbstractC2595o2) && (thM11640a = C2606p2.m11640a((AbstractC2595o2) interfaceFutureC2529i2)) != null) {
            this.f8942b.zza(thM11640a);
            return;
        }
        try {
            if (!interfaceFutureC2529i2.isDone()) {
                throw new IllegalStateException(C2439a0.m11166b("Future was expected to be done: %s", interfaceFutureC2529i2));
            }
            boolean z10 = false;
            Future future = interfaceFutureC2529i2;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    future = future;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            this.f8942b.zzb(obj);
        } catch (ExecutionException e10) {
            this.f8942b.zza(e10.getCause());
        } catch (Throwable th3) {
            this.f8942b.zza(th3);
        }
    }

    public final String toString() {
        C2647t c2647tM11800a = C2669v.m11800a(this);
        c2647tM11800a.m11733a(this.f8942b);
        return c2647tM11800a.toString();
    }
}
