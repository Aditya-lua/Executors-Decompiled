package ob;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f27952a;
    public final /* synthetic */ va b;

    public w9(va vaVar, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f27952a = x1Var;
        Objects.requireNonNull(vaVar);
        this.b = vaVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Long lValueOf;
        va vaVar = this.b;
        l7 l7Var = vaVar.f27641a.z().f27641a;
        if (l7Var.x().w().o(u8.ANALYTICS_STORAGE)) {
            if (!l7Var.x().A(l7Var.e().a()) && l7Var.x().f27698r.a() != 0) {
                lValueOf = Long.valueOf(l7Var.x().f27698r.a());
            }
            if (lValueOf == null) {
                vaVar.f27641a.C().b0(this.f27952a, lValueOf.longValue());
            } else {
                try {
                    this.f27952a.l(null);
                    return;
                } catch (RemoteException e10) {
                    this.b.f27641a.a().o().b("getSessionId failed with exception", e10);
                    return;
                }
            }
        }
        l7Var.a().t().a("Analytics storage consent denied; will not get session id");
        lValueOf = null;
        if (lValueOf == null) {
            this.f27952a.l(null);
            return;
        }
        vaVar.f27641a.C().b0(this.f27952a, lValueOf.longValue());
    }
}
