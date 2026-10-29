package p306nb;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2383x1;
import java.util.Objects;

/* JADX INFO: renamed from: nb.r9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9272r9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2383x1 f33437a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9257qa f33438b;

    public RunnableC9272r9(C9257qa c9257qa, InterfaceC2383x1 interfaceC2383x1) {
        this.f33437a = interfaceC2383x1;
        Objects.requireNonNull(c9257qa);
        this.f33438b = c9257qa;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Long lValueOf;
        C9257qa c9257qa = this.f33438b;
        C9094g7 c9094g7 = c9257qa.f33067a.m36341z().f33067a;
        if (c9094g7.m36339x().m36450w().m36656o(EnumC9239p8.ANALYTICS_STORAGE)) {
            if (!c9094g7.m36339x().m36440A(c9094g7.mo36325e().mo44175a()) && c9094g7.m36339x().f33130r.m36345a() != 0) {
                lValueOf = Long.valueOf(c9094g7.m36339x().f33130r.m36345a());
            }
            if (lValueOf == null) {
                c9257qa.f33067a.m36308C().m36958b0(this.f33437a, lValueOf.longValue());
            } else {
                try {
                    this.f33437a.mo10588l(null);
                    return;
                } catch (RemoteException e10) {
                    this.f33438b.f33067a.mo36321a().m37003o().m36912b("getSessionId failed with exception", e10);
                    return;
                }
            }
        }
        c9094g7.mo36321a().m37008t().m36911a("Analytics storage consent denied; will not get session id");
        lValueOf = null;
        if (lValueOf == null) {
            this.f33437a.mo10588l(null);
            return;
        }
        c9257qa.f33067a.m36308C().m36958b0(this.f33437a, lValueOf.longValue());
    }
}
