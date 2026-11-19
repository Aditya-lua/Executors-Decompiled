package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f6800a = new AtomicReference();
    public boolean b;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r2 = r2.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object v2(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e10) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e10);
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.x1
    public final void l(Bundle bundle) {
        AtomicReference atomicReference = this.f6800a;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.b = true;
                    this.f6800a.notify();
                } catch (Throwable th2) {
                    this.f6800a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final String s2(long j10) {
        return (String) v2(u2(j10), String.class);
    }

    public final Long t2(long j10) {
        return (Long) v2(u2(j10), Long.class);
    }

    public final Bundle u2(long j10) {
        Bundle bundle;
        AtomicReference atomicReference = this.f6800a;
        synchronized (atomicReference) {
            if (!this.b) {
                try {
                    atomicReference.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f6800a.get();
        }
        return bundle;
    }
}
