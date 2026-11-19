package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class c2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2 f7021a;
    public final b2 b;

    public c2(i2 i2Var, b2 b2Var) {
        this.f7021a = i2Var;
        this.b = b2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable thA;
        i2 i2Var = this.f7021a;
        if ((i2Var instanceof o2) && (thA = p2.a((o2) i2Var)) != null) {
            this.b.zza(thA);
            return;
        }
        try {
            if (!i2Var.isDone()) {
                throw new IllegalStateException(a0.b("Future was expected to be done: %s", i2Var));
            }
            boolean z10 = false;
            Future future = i2Var;
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
            this.b.zzb(obj);
        } catch (ExecutionException e10) {
            this.b.zza(e10.getCause());
        } catch (Throwable th3) {
            this.b.zza(th3);
        }
    }

    public final String toString() {
        t tVarA = v.a(this);
        tVarA.a(this.b);
        return tVarA.toString();
    }
}
