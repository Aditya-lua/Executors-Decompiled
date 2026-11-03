package nb;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class cc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26255a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzr f26257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tc f26258e;

    public cc(tc tcVar, AtomicReference atomicReference, String str, String str2, String str3, zzr zzrVar) {
        this.f26255a = atomicReference;
        this.b = str2;
        this.f26256c = str3;
        this.f26257d = zzrVar;
        Objects.requireNonNull(tcVar);
        this.f26258e = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f26255a;
        synchronized (atomicReference2) {
            try {
                try {
                    tc tcVar = this.f26258e;
                    d5 d5VarN = tcVar.N();
                    if (d5VarN == null) {
                        tcVar.f26446a.a().o().d("(legacy) Failed to get conditional properties; not connected to service", null, this.b, this.f26256c);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        zzr zzrVar = this.f26257d;
                        n9.m.l(zzrVar);
                        atomicReference2.set(d5VarN.e2(this.b, this.f26256c, zzrVar));
                    } else {
                        atomicReference2.set(d5VarN.K(null, this.b, this.f26256c));
                    }
                    tcVar.J();
                    atomicReference = this.f26255a;
                    atomicReference.notify();
                } catch (RemoteException e10) {
                    this.f26258e.f26446a.a().o().d("(legacy) Failed to get conditional properties; remote exception", null, this.b, e10);
                    this.f26255a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f26255a;
                }
            } catch (Throwable th2) {
                this.f26255a.notify();
                throw th2;
            }
        }
    }
}
