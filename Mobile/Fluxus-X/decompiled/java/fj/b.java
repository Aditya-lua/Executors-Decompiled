package fj;

import android.os.Bundle;
import androidx.p000lifecycle.r;
import bh.a1;
import bh.m0;
import bh.t0;
import bh.x0;
import di.j;

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
            if (this.f16122a.findViewById(m0.f4146j) == null) {
                dj.g.b().q("robux_buildsclub_no_container_for_purchase");
            }
            if (this.f16122a.findViewById(m0.f4146j) != null) {
                j jVar = new j();
                if (rVar != null) {
                    jVar.a().a(rVar);
                }
                jVar.O1(bundle);
                jVar.T2(a1.o());
                this.f16122a.l1().r().f("robuxPurchase").b(m0.f4146j, jVar, "dialog").g();
            } else {
                bundle.putInt("dialogHeight", b());
                di.g gVar = new di.g();
                if (rVar != null) {
                    gVar.a().a(rVar);
                }
                gVar.O1(bundle);
                gVar.q3(a1.o());
                gVar.r2(1, gVar.j2());
                gVar.t2(this.f16122a.l1(), "dialog");
            }
            t0.e("nativeMain", "buildersClub", this.b);
        }
    }
}
