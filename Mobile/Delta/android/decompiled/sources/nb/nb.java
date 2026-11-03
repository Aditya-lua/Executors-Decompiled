package nb;

import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class nb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f26618a;
    public final /* synthetic */ boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzpl f26619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc f26620d;

    public nb(tc tcVar, zzr zzrVar, boolean z10, zzpl zzplVar) {
        this.f26618a = zzrVar;
        this.b = z10;
        this.f26619c = zzplVar;
        Objects.requireNonNull(tcVar);
        this.f26620d = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.f26620d;
        d5 d5VarN = tcVar.N();
        if (d5VarN == null) {
            tcVar.f26446a.a().o().a("Discarding data. Failed to set user property");
            return;
        }
        zzr zzrVar = this.f26618a;
        n9.m.l(zzrVar);
        tcVar.b0(d5VarN, this.b ? null : this.f26619c, zzrVar);
        tcVar.J();
    }
}
