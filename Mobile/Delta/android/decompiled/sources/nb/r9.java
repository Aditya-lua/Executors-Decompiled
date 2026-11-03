package nb;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f26751a;
    public final /* synthetic */ qa b;

    public r9(qa qaVar, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f26751a = x1Var;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Long lValueOf;
        qa qaVar = this.b;
        g7 g7Var = qaVar.f26446a.z().f26446a;
        if (g7Var.x().w().o(p8.ANALYTICS_STORAGE)) {
            if (!g7Var.x().A(g7Var.e().a()) && g7Var.x().f26504r.a() != 0) {
                lValueOf = Long.valueOf(g7Var.x().f26504r.a());
            }
            if (lValueOf == null) {
                qaVar.f26446a.C().b0(this.f26751a, lValueOf.longValue());
            } else {
                try {
                    this.f26751a.l(null);
                    return;
                } catch (RemoteException e10) {
                    this.b.f26446a.a().o().b("getSessionId failed with exception", e10);
                    return;
                }
            }
        }
        g7Var.a().t().a("Analytics storage consent denied; will not get session id");
        lValueOf = null;
        if (lValueOf == null) {
            this.f26751a.l(null);
            return;
        }
        qaVar.f26446a.C().b0(this.f26751a, lValueOf.longValue());
    }
}
