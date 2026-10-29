package xi;

import android.os.Bundle;
import androidx.p000lifecycle.r;
import e4.q;
import sg.a1;
import sg.m0;
import sg.t0;
import sg.x0;
import vh.k;

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
            q qVar = this.f35194a;
            int i10 = m0.f30842j;
            if (qVar.findViewById(i10) == null) {
                vi.g.b().q("robux_buildsclub_no_container_for_purchase");
            }
            if (this.f35194a.findViewById(i10) != null) {
                k kVar = new k();
                if (rVar != null) {
                    kVar.a().a(rVar);
                }
                kVar.O1(bundle);
                kVar.T2(a1.o());
                this.f35194a.l1().r().f("robuxPurchase").b(i10, kVar, "dialog").g();
            } else {
                bundle.putInt("dialogHeight", b());
                vh.h hVar = new vh.h();
                if (rVar != null) {
                    hVar.a().a(rVar);
                }
                hVar.O1(bundle);
                hVar.q3(a1.o());
                hVar.r2(1, hVar.j2());
                hVar.t2(this.f35194a.l1(), "dialog");
            }
            t0.e("nativeMain", "buildersClub", this.b);
        }
    }
}
