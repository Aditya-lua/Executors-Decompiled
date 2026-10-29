package nb;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ec implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f25491a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzr f25493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f25494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc f25495f;

    public ec(tc tcVar, AtomicReference atomicReference, String str, String str2, String str3, zzr zzrVar, boolean z10) {
        this.f25491a = atomicReference;
        this.b = str2;
        this.f25492c = str3;
        this.f25493d = zzrVar;
        this.f25494e = z10;
        Objects.requireNonNull(tcVar);
        this.f25495f = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f25491a;
        synchronized (atomicReference2) {
            try {
                try {
                    tc tcVar = this.f25495f;
                    d5 d5VarN = tcVar.N();
                    if (d5VarN == null) {
                        tcVar.f25625a.a().o().d("(legacy) Failed to get user properties; not connected to service", null, this.b, this.f25492c);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        zzr zzrVar = this.f25493d;
                        n9.m.l(zzrVar);
                        atomicReference2.set(d5VarN.Y1(this.b, this.f25492c, this.f25494e, zzrVar));
                    } else {
                        atomicReference2.set(d5VarN.o(null, this.b, this.f25492c, this.f25494e));
                    }
                    tcVar.J();
                    atomicReference = this.f25491a;
                    atomicReference.notify();
                } catch (RemoteException e10) {
                    this.f25495f.f25625a.a().o().d("(legacy) Failed to get user properties; remote exception", null, this.b, e10);
                    this.f25491a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f25491a;
                }
            } catch (Throwable th2) {
                this.f25491a.notify();
                throw th2;
            }
        }
    }
}
