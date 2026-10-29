package nb;

import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class nb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f25797a;
    public final /* synthetic */ boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzpl f25798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc f25799d;

    public nb(tc tcVar, zzr zzrVar, boolean z10, zzpl zzplVar) {
        this.f25797a = zzrVar;
        this.b = z10;
        this.f25798c = zzplVar;
        Objects.requireNonNull(tcVar);
        this.f25799d = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.f25799d;
        d5 d5VarN = tcVar.N();
        if (d5VarN == null) {
            tcVar.f25625a.a().o().a("Discarding data. Failed to set user property");
            return;
        }
        zzr zzrVar = this.f25797a;
        n9.m.l(zzrVar);
        tcVar.b0(d5VarN, this.b ? null : this.f25798c, zzrVar);
        tcVar.J();
    }
}
