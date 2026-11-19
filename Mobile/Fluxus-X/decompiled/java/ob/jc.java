package ob;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class jc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f27494a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf f27496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f27497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yc f27498f;

    public jc(yc ycVar, AtomicReference atomicReference, String str, String str2, String str3, hf hfVar, boolean z10) {
        this.f27494a = atomicReference;
        this.b = str2;
        this.f27495c = str3;
        this.f27496d = hfVar;
        this.f27497e = z10;
        Objects.requireNonNull(ycVar);
        this.f27498f = ycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f27494a;
        synchronized (atomicReference2) {
            try {
                try {
                    yc ycVar = this.f27498f;
                    i5 i5VarN = ycVar.N();
                    if (i5VarN == null) {
                        ycVar.f27641a.a().o().d("(legacy) Failed to get user properties; not connected to service", null, this.b, this.f27495c);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        hf hfVar = this.f27496d;
                        o9.s.l(hfVar);
                        atomicReference2.set(i5VarN.x1(this.b, this.f27495c, this.f27497e, hfVar));
                    } else {
                        atomicReference2.set(i5VarN.o(null, this.b, this.f27495c, this.f27497e));
                    }
                    ycVar.J();
                    atomicReference = this.f27494a;
                    atomicReference.notify();
                } catch (RemoteException e10) {
                    this.f27498f.f27641a.a().o().d("(legacy) Failed to get user properties; remote exception", null, this.b, e10);
                    this.f27494a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f27494a;
                }
            } catch (Throwable th2) {
                this.f27494a.notify();
                throw th2;
            }
        }
    }
}
