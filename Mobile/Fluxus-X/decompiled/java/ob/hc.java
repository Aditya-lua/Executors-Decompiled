package ob;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class hc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f27416a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf f27418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yc f27419e;

    public hc(yc ycVar, AtomicReference atomicReference, String str, String str2, String str3, hf hfVar) {
        this.f27416a = atomicReference;
        this.b = str2;
        this.f27417c = str3;
        this.f27418d = hfVar;
        Objects.requireNonNull(ycVar);
        this.f27419e = ycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f27416a;
        synchronized (atomicReference2) {
            try {
                try {
                    yc ycVar = this.f27419e;
                    i5 i5VarN = ycVar.N();
                    if (i5VarN == null) {
                        ycVar.f27641a.a().o().d("(legacy) Failed to get conditional properties; not connected to service", null, this.b, this.f27417c);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        hf hfVar = this.f27418d;
                        o9.s.l(hfVar);
                        atomicReference2.set(i5VarN.l1(this.b, this.f27417c, hfVar));
                    } else {
                        atomicReference2.set(i5VarN.L(null, this.b, this.f27417c));
                    }
                    ycVar.J();
                    atomicReference = this.f27416a;
                    atomicReference.notify();
                } catch (RemoteException e10) {
                    this.f27419e.f27641a.a().o().d("(legacy) Failed to get conditional properties; remote exception", null, this.b, e10);
                    this.f27416a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f27416a;
                }
            } catch (Throwable th2) {
                this.f27416a.notify();
                throw th2;
            }
        }
    }
}
