package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r1 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2275r1 extends AbstractBinderC2365w1 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f8601a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public boolean f8602b;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r2 = r2.get("r");
     */
    /* JADX INFO: renamed from: v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m10587v2(Bundle bundle, Class cls) {
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

    @Override // com.google.android.gms.internal.measurement.InterfaceC2383x1
    /* JADX INFO: renamed from: l */
    public final void mo10588l(Bundle bundle) {
        AtomicReference atomicReference = this.f8601a;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f8602b = true;
                    this.f8601a.notify();
                } catch (Throwable th2) {
                    this.f8601a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final String m10589s2(long j10) {
        return (String) m10587v2(m10591u2(j10), String.class);
    }

    /* JADX INFO: renamed from: t2 */
    public final Long m10590t2(long j10) {
        return (Long) m10587v2(m10591u2(j10), Long.class);
    }

    /* JADX INFO: renamed from: u2 */
    public final Bundle m10591u2(long j10) {
        Bundle bundle;
        AtomicReference atomicReference = this.f8601a;
        synchronized (atomicReference) {
            if (!this.f8602b) {
                try {
                    atomicReference.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f8601a.get();
        }
        return bundle;
    }
}
