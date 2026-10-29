package p306nb;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.cc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9032cc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f32821a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f32822b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f32823c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzr f32824d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C9307tc f32825e;

    public RunnableC9032cc(C9307tc c9307tc, AtomicReference atomicReference, String str, String str2, String str3, zzr zzrVar) {
        this.f32821a = atomicReference;
        this.f32822b = str2;
        this.f32823c = str3;
        this.f32824d = zzrVar;
        Objects.requireNonNull(c9307tc);
        this.f32825e = c9307tc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f32821a;
        synchronized (atomicReference2) {
            try {
                try {
                    C9307tc c9307tc = this.f32825e;
                    InterfaceC9042d5 interfaceC9042d5M36873N = c9307tc.m36873N();
                    if (interfaceC9042d5M36873N == null) {
                        c9307tc.f33067a.mo36321a().m37003o().m36914d("(legacy) Failed to get conditional properties; not connected to service", null, this.f32822b, this.f32823c);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        zzr zzrVar = this.f32824d;
                        C8953m.m36047l(zzrVar);
                        atomicReference2.set(interfaceC9042d5M36873N.mo36104e2(this.f32822b, this.f32823c, zzrVar));
                    } else {
                        atomicReference2.set(interfaceC9042d5M36873N.mo36093K(null, this.f32822b, this.f32823c));
                    }
                    c9307tc.m36869J();
                    atomicReference = this.f32821a;
                    atomicReference.notify();
                } catch (RemoteException e10) {
                    this.f32825e.f33067a.mo36321a().m37003o().m36914d("(legacy) Failed to get conditional properties; remote exception", null, this.f32822b, e10);
                    this.f32821a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f32821a;
                }
            } catch (Throwable th2) {
                this.f32821a.notify();
                throw th2;
            }
        }
    }
}
