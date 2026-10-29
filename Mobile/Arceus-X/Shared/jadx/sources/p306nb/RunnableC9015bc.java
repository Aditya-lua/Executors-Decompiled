package p306nb;

import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.bc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9015bc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzr f32730a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f32731b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzah f32732c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9307tc f32733d;

    public RunnableC9015bc(C9307tc c9307tc, boolean z10, zzr zzrVar, boolean z11, zzah zzahVar, zzah zzahVar2) {
        this.f32730a = zzrVar;
        this.f32731b = z11;
        this.f32732c = zzahVar;
        Objects.requireNonNull(c9307tc);
        this.f32733d = c9307tc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9307tc c9307tc = this.f32733d;
        InterfaceC9042d5 interfaceC9042d5M36873N = c9307tc.m36873N();
        if (interfaceC9042d5M36873N == null) {
            c9307tc.f33067a.mo36321a().m37003o().m36911a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        zzr zzrVar = this.f32730a;
        C8953m.m36047l(zzrVar);
        c9307tc.m36886b0(interfaceC9042d5M36873N, this.f32731b ? null : this.f32732c, zzrVar);
        c9307tc.m36869J();
    }
}
