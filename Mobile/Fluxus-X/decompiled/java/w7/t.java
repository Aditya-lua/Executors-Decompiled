package w7;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f35654a;
    public final m b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f35655c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.google.android.gms.internal.play_billing.s0 f35659g = com.google.android.gms.internal.play_billing.s0.j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f35656d = new s(this, true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f35657e = new s(this, false);

    public t(Context context, m mVar, p1 p1Var, c0 c0Var, q qVar, h hVar, i1 i1Var) {
        this.f35654a = context;
        this.b = mVar;
        this.f35655c = i1Var;
    }

    public static /* bridge */ /* synthetic */ c0 a(t tVar) {
        tVar.getClass();
        return null;
    }

    public static /* bridge */ /* synthetic */ h c(t tVar) {
        tVar.getClass();
        return null;
    }

    public static /* bridge */ /* synthetic */ q f(t tVar) {
        tVar.getClass();
        return null;
    }

    public final m e() {
        return this.b;
    }

    public final void h(boolean z10) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f35658f = z10;
        s sVar = this.f35657e;
        Context context = this.f35654a;
        sVar.a(context, intentFilter2);
        if (this.f35658f) {
            this.f35656d.b(context, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f35656d.a(context, intentFilter);
        }
    }

    public final void i(com.google.android.gms.internal.play_billing.s0 s0Var) {
        this.f35659g = s0Var;
    }
}
