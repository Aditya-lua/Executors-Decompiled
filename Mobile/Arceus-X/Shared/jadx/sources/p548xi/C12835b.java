package p548xi;

import android.os.Bundle;
import androidx.p616lifecycle.InterfaceC0978r;
import p093e4.ActivityC4831q;
import p491vh.C12204h;
import p491vh.C12207k;
import sg.C11295a1;
import sg.C11335m0;
import sg.C11356t0;
import sg.C11368x0;
import vi.C12216g;

/* JADX INFO: renamed from: xi.b */
/* JADX INFO: loaded from: classes2.dex */
public class C12835b extends AbstractC12834a {

    /* JADX INFO: renamed from: b */
    public String f45634b;

    public C12835b(C11368x0 c11368x0, String str) {
        super(c11368x0.m4693p());
        this.f45634b = str;
    }

    /* JADX INFO: renamed from: c */
    public void m47774c(InterfaceC0978r interfaceC0978r) {
        if (m47772a()) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("showPremium", true);
            ActivityC4831q activityC4831q = this.f45633a;
            int i10 = C11335m0.f39813j;
            if (activityC4831q.findViewById(i10) == null) {
                C12216g.m45228b().m45278q("robux_buildsclub_no_container_for_purchase");
            }
            if (this.f45633a.findViewById(i10) != null) {
                C12207k c12207k = new C12207k();
                if (interfaceC0978r != null) {
                    c12207k.mo4656a().mo4935a(interfaceC0978r);
                }
                c12207k.m4625O1(bundle);
                c12207k.m42649T2(C11295a1.m42466o());
                this.f45633a.m23360l1().m4452r().m4779f("robuxPurchase").m4775b(i10, c12207k, "dialog").mo4508g();
            } else {
                bundle.putInt("dialogHeight", m47773b());
                C12204h c12204h = new C12204h();
                if (interfaceC0978r != null) {
                    c12204h.mo4656a().mo4935a(interfaceC0978r);
                }
                c12204h.m4625O1(bundle);
                c12204h.m15021q3(C11295a1.m42466o());
                c12204h.m23337r2(1, c12204h.m23330j2());
                c12204h.mo23339t2(this.f45633a.m23360l1(), "dialog");
            }
            C11356t0.m42535e("nativeMain", "buildersClub", this.f45634b);
        }
    }
}
