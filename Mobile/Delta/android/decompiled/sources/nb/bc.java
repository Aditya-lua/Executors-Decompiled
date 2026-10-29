package nb;

import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f25370a;
    public final /* synthetic */ boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzah f25371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc f25372d;

    public bc(tc tcVar, boolean z10, zzr zzrVar, boolean z11, zzah zzahVar, zzah zzahVar2) {
        this.f25370a = zzrVar;
        this.b = z11;
        this.f25371c = zzahVar;
        Objects.requireNonNull(tcVar);
        this.f25372d = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.f25372d;
        d5 d5VarN = tcVar.N();
        if (d5VarN == null) {
            tcVar.f25625a.a().o().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        zzr zzrVar = this.f25370a;
        n9.m.l(zzrVar);
        tcVar.b0(d5VarN, this.b ? null : this.f25371c, zzrVar);
        tcVar.J();
    }
}
