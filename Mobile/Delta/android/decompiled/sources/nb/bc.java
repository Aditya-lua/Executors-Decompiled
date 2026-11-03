package nb;

import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f26191a;
    public final /* synthetic */ boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzah f26192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc f26193d;

    public bc(tc tcVar, boolean z10, zzr zzrVar, boolean z11, zzah zzahVar, zzah zzahVar2) {
        this.f26191a = zzrVar;
        this.b = z11;
        this.f26192c = zzahVar;
        Objects.requireNonNull(tcVar);
        this.f26193d = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.f26193d;
        d5 d5VarN = tcVar.N();
        if (d5VarN == null) {
            tcVar.f26446a.a().o().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        zzr zzrVar = this.f26191a;
        n9.m.l(zzrVar);
        tcVar.b0(d5VarN, this.b ? null : this.f26192c, zzrVar);
        tcVar.J();
    }
}
