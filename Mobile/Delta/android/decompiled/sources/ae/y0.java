package ae;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f471a;
    public final /* synthetic */ Intent b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f473d;

    public y0(a1 a1Var, e eVar, Intent intent, Context context) {
        this.f473d = a1Var;
        this.f471a = eVar;
        this.b = intent;
        this.f472c = context;
    }

    @Override // ae.i0
    public final void a(int i10) {
        a1 a1Var = this.f473d;
        a1Var.f407g.post(new z0(a1Var, this.f471a, 6, i10));
    }

    @Override // ae.i0
    public final void zza() {
        a1 a1Var = this.f473d;
        a1Var.f407g.post(new z0(a1Var, this.f471a, 5, 0));
    }

    @Override // ae.i0
    public final void zzc() {
        if (this.b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.f473d.f4026a.b("Splits copied and verified more than once.", new Object[0]);
        } else {
            this.b.putExtra("triggered_from_app_after_verification", true);
            this.f472c.sendBroadcast(this.b);
        }
    }
}
