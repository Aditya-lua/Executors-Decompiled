package p306nb;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2383x1;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.qb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9258qb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzr f33413a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC2383x1 f33414b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9307tc f33415c;

    public RunnableC9258qb(C9307tc c9307tc, zzr zzrVar, InterfaceC2383x1 interfaceC2383x1) {
        this.f33413a = zzrVar;
        this.f33414b = interfaceC2383x1;
        Objects.requireNonNull(c9307tc);
        this.f33415c = c9307tc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2383x1 interfaceC2383x1;
        C9341ve c9341veM36308C;
        String strMo36089A0 = null;
        try {
            try {
                C9307tc c9307tc = this.f33415c;
                C9094g7 c9094g7 = c9307tc.f33067a;
                if (c9094g7.m36339x().m36450w().m36656o(EnumC9239p8.ANALYTICS_STORAGE)) {
                    InterfaceC9042d5 interfaceC9042d5M36873N = c9307tc.m36873N();
                    if (interfaceC9042d5M36873N != null) {
                        zzr zzrVar = this.f33413a;
                        C8953m.m36047l(zzrVar);
                        strMo36089A0 = interfaceC9042d5M36873N.mo36089A0(zzrVar);
                        if (strMo36089A0 != null) {
                            c9307tc.f33067a.m36307B().m36666E(strMo36089A0);
                            c9094g7.m36339x().f33120h.m36370b(strMo36089A0);
                        }
                        c9307tc.m36869J();
                        C9307tc c9307tc2 = this.f33415c;
                        interfaceC2383x1 = this.f33414b;
                        c9341veM36308C = c9307tc2.f33067a.m36308C();
                        c9341veM36308C.m36957a0(interfaceC2383x1, strMo36089A0);
                    }
                    c9094g7.mo36321a().m37003o().m36911a("Failed to get app instance id");
                } else {
                    c9094g7.mo36321a().m37008t().m36911a("Analytics storage consent denied; will not get app instance id");
                    c9307tc.f33067a.m36307B().m36666E(null);
                    c9094g7.m36339x().f33120h.m36370b(null);
                }
                c9341veM36308C = c9094g7.m36308C();
                interfaceC2383x1 = this.f33414b;
            } catch (RemoteException e10) {
                this.f33415c.f33067a.mo36321a().m37003o().m36912b("Failed to get app instance id", e10);
            }
            c9341veM36308C.m36957a0(interfaceC2383x1, strMo36089A0);
        } catch (Throwable th2) {
            C9307tc c9307tc3 = this.f33415c;
            c9307tc3.f33067a.m36308C().m36957a0(this.f33414b, null);
            throw th2;
        }
    }
}
