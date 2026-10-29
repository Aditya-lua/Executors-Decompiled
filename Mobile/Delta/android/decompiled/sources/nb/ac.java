package nb;

import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ac implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f25336a;
    public final /* synthetic */ boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbg f25337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc f25338d;

    public ac(tc tcVar, boolean z10, zzr zzrVar, boolean z11, zzbg zzbgVar, String str) {
        this.f25336a = zzrVar;
        this.b = z11;
        this.f25337c = zzbgVar;
        Objects.requireNonNull(tcVar);
        this.f25338d = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.f25338d;
        d5 d5VarN = tcVar.N();
        if (d5VarN == null) {
            tcVar.f25625a.a().o().a("Discarding data. Failed to send event to service");
            return;
        }
        zzr zzrVar = this.f25336a;
        n9.m.l(zzrVar);
        tcVar.b0(d5VarN, this.b ? null : this.f25337c, zzrVar);
        tcVar.J();
    }
}
