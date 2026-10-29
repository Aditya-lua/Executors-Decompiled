package p306nb;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.ec */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9066ec implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f32893a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f32894b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f32895c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzr f32896d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f32897e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C9307tc f32898f;

    public RunnableC9066ec(C9307tc c9307tc, AtomicReference atomicReference, String str, String str2, String str3, zzr zzrVar, boolean z10) {
        this.f32893a = atomicReference;
        this.f32894b = str2;
        this.f32895c = str3;
        this.f32896d = zzrVar;
        this.f32897e = z10;
        Objects.requireNonNull(c9307tc);
        this.f32898f = c9307tc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f32893a;
        synchronized (atomicReference2) {
            try {
                try {
                    C9307tc c9307tc = this.f32898f;
                    InterfaceC9042d5 interfaceC9042d5M36873N = c9307tc.m36873N();
                    if (interfaceC9042d5M36873N == null) {
                        c9307tc.f33067a.mo36321a().m37003o().m36914d("(legacy) Failed to get user properties; not connected to service", null, this.f32894b, this.f32895c);
                        atomicReference2.set(Collections.EMPTY_LIST);
                        atomicReference2.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        zzr zzrVar = this.f32896d;
                        C8953m.m36047l(zzrVar);
                        atomicReference2.set(interfaceC9042d5M36873N.mo36101Y1(this.f32894b, this.f32895c, this.f32897e, zzrVar));
                    } else {
                        atomicReference2.set(interfaceC9042d5M36873N.mo36107o(null, this.f32894b, this.f32895c, this.f32897e));
                    }
                    c9307tc.m36869J();
                    atomicReference = this.f32893a;
                    atomicReference.notify();
                } catch (RemoteException e10) {
                    this.f32898f.f33067a.mo36321a().m37003o().m36914d("(legacy) Failed to get user properties; remote exception", null, this.f32894b, e10);
                    this.f32893a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f32893a;
                }
            } catch (Throwable th2) {
                this.f32893a.notify();
                throw th2;
            }
        }
    }
}
