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
    public final /* synthetic */ AtomicReference f25434a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzr f25436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tc f25437e;

    public cc(tc tcVar, AtomicReference atomicReference, String str, String str2, String str3, zzr zzrVar) {
        this.f25434a = atomicReference;
        this.b = str2;
        this.f25435c = str3;
        this.f25436d = zzrVar;
        Objects.requireNonNull(tcVar);
        this.f25437e = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f25434a;
        synchronized (atomicReference2) {
            try {
                try {
                    tc tcVar = this.f25437e;
                    d5 d5VarN = tcVar.N();
                    if (d5VarN == null) {
                        tcVar.f25625a.a().o().d("(legacy) Failed to get conditional properties; not connected to service", null, this.b, this.f25435c);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        zzr zzrVar = this.f25436d;
                        n9.m.l(zzrVar);
                        atomicReference2.set(d5VarN.e2(this.b, this.f25435c, zzrVar));
                    } else {
                        atomicReference2.set(d5VarN.M(null, this.b, this.f25435c));
                    }
                    tcVar.J();
                    atomicReference = this.f25434a;
                    atomicReference.notify();
                } catch (RemoteException e10) {
                    this.f25437e.f25625a.a().o().d("(legacy) Failed to get conditional properties; remote exception", null, this.b, e10);
                    this.f25434a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f25434a;
                }
            } catch (Throwable th2) {
                this.f25434a.notify();
                throw th2;
            }
        }
    }
}
