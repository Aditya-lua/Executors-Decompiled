package p306nb;

import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.ac */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8998ac implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzr f32687a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f32688b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzbg f32689c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9307tc f32690d;

    public RunnableC8998ac(C9307tc c9307tc, boolean z10, zzr zzrVar, boolean z11, zzbg zzbgVar, String str) {
        this.f32687a = zzrVar;
        this.f32688b = z11;
        this.f32689c = zzbgVar;
        Objects.requireNonNull(c9307tc);
        this.f32690d = c9307tc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9307tc c9307tc = this.f32690d;
        InterfaceC9042d5 interfaceC9042d5M36873N = c9307tc.m36873N();
        if (interfaceC9042d5M36873N == null) {
            c9307tc.f33067a.mo36321a().m37003o().m36911a("Discarding data. Failed to send event to service");
            return;
        }
        zzr zzrVar = this.f32687a;
        C8953m.m36047l(zzrVar);
        c9307tc.m36886b0(interfaceC9042d5M36873N, this.f32688b ? null : this.f32689c, zzrVar);
        c9307tc.m36869J();
    }
}
