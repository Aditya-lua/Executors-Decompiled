package xi;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.p000lifecycle.r;
import e4.q;
import gk.p;
import gk.s;
import sg.a1;
import sg.k0;
import sg.l0;
import sg.m0;
import sg.o0;
import sg.r0;
import sg.t0;
import sg.x0;
import vh.k;

/* JADX INFO: loaded from: classes2.dex */
public class e extends xi.a {
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dk.c f35205c;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.f();
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35207a;

        static {
            int[] iArr = new int[ol.a.values().length];
            f35207a = iArr;
            try {
                iArr[ol.a.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35207a[ol.a.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35207a[ol.a.CLASSIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e(x0 x0Var, String str) {
        super(x0Var.p());
        this.b = str;
        this.f35205c = new dk.f();
    }

    public final int c(ol.a aVar) {
        return b.f35207a[aVar.ordinal()] != 1 ? r0.b : r0.f30993a;
    }

    public final int d(ol.a aVar) {
        return l0.f30821y;
    }

    public MenuItem e(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(o0.b, menu);
        MenuItem menuItemFindItem = menu.findItem(m0.b);
        View actionView = menuItemFindItem.getActionView();
        actionView.setOnClickListener(new a());
        ((ImageView) actionView.findViewById(m0.H)).setImageResource(d(this.f35205c.getTheme()));
        return menuItemFindItem;
    }

    public void f() {
        g(null);
    }

    public void g(r rVar) {
        String strE0;
        int iB;
        if (a()) {
            q qVar = this.f35194a;
            if (qVar == null || qVar.isFinishing() || this.f35194a.l1().U0()) {
                vi.g.b().q("robux_menuoption_attempt_after_state_save");
                return;
            }
            if (s.j() && th.h.a().h()) {
                iB = this.f35194a.getResources().getDimensionPixelSize(k0.f30795f);
                strE0 = "";
            } else if (th.h.a().A0()) {
                strE0 = h.a();
                iB = b();
            } else {
                strE0 = a1.E0();
                iB = b();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("showRobux", true);
            if (th.h.a().A0()) {
                bundle.putBoolean("hideNativeHeader", true);
            }
            q qVar2 = this.f35194a;
            int i10 = m0.f30842j;
            if (qVar2.findViewById(i10) == null) {
                vi.g.b().q("robux_menuoption_no_container_for_purchase");
            }
            FragmentManager fragmentManagerL1 = this.f35194a.l1();
            if (this.f35194a.findViewById(i10) != null) {
                k kVar = new k();
                kVar.O1(bundle);
                kVar.T2(strE0);
                if (rVar != null) {
                    kVar.a().a(rVar);
                }
                if (fragmentManagerL1.U0()) {
                    vi.g.b().q("robux_menuoption_committed_after_state_save");
                    p.e("RobuxMenuOption", "State has already been saved. Attempting to show premium fragment, allowing state loss.");
                }
                fragmentManagerL1.r().f("robuxPurchase").b(i10, kVar, "dialog").h();
            } else {
                bundle.putInt("dialogHeight", iB);
                vh.h hVar = new vh.h();
                hVar.O1(bundle);
                hVar.q3(strE0);
                hVar.r2(1, c(this.f35205c.getTheme()));
                if (rVar != null) {
                    hVar.a().a(rVar);
                }
                if (fragmentManagerL1.U0()) {
                    vi.g.b().q("robux_menuoption_not_shown_after_state_save");
                    p.e("RobuxMenuOption", "State has already been saved. Do not show premium dialog fragment.");
                } else {
                    hVar.t2(fragmentManagerL1, "dialog");
                }
            }
            t0.e("nativeMain", "robux", this.b);
        }
    }
}
