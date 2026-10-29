package p306nb;

import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.nb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9210nb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzr f33275a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f33276b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzpl f33277c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9307tc f33278d;

    public RunnableC9210nb(C9307tc c9307tc, zzr zzrVar, boolean z10, zzpl zzplVar) {
        this.f33275a = zzrVar;
        this.f33276b = z10;
        this.f33277c = zzplVar;
        Objects.requireNonNull(c9307tc);
        this.f33278d = c9307tc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9307tc c9307tc = this.f33278d;
        InterfaceC9042d5 interfaceC9042d5M36873N = c9307tc.m36873N();
        if (interfaceC9042d5M36873N == null) {
            c9307tc.f33067a.mo36321a().m37003o().m36911a("Discarding data. Failed to set user property");
            return;
        }
        zzr zzrVar = this.f33275a;
        C8953m.m36047l(zzrVar);
        c9307tc.m36886b0(interfaceC9042d5M36873N, this.f33276b ? null : this.f33277c, zzrVar);
        c9307tc.m36869J();
    }
}
