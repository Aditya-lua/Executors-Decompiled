package vi;

import android.os.Bundle;
import androidx.p000lifecycle.r;
import e4.q;
import rg.a1;
import rg.m0;
import rg.t0;
import rg.x0;
import th.k;

/* JADX INFO: loaded from: classes2.dex */
public class b extends a {
    public String b;

    public b(x0 x0Var, String str) {
        super(x0Var.p());
        this.b = str;
    }

    public void c(r rVar) {
        if (a()) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("showPremium", true);
            q qVar = this.f33516a;
            int i10 = m0.f30445j;
            if (qVar.findViewById(i10) == null) {
                ti.g.b().q("robux_buildsclub_no_container_for_purchase");
            }
            if (this.f33516a.findViewById(i10) != null) {
                k kVar = new k();
                if (rVar != null) {
                    kVar.a().a(rVar);
                }
                kVar.O1(bundle);
                kVar.T2(a1.o());
                this.f33516a.l1().r().f("robuxPurchase").b(i10, kVar, "dialog").g();
            } else {
                bundle.putInt("dialogHeight", b());
                th.h hVar = new th.h();
                if (rVar != null) {
                    hVar.a().a(rVar);
                }
                hVar.O1(bundle);
                hVar.q3(a1.o());
                hVar.r2(1, hVar.j2());
                hVar.t2(this.f33516a.l1(), "dialog");
            }
            t0.e("nativeMain", "buildersClub", this.b);
        }
    }
}
