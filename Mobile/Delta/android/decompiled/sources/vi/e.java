package vi;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.p000lifecycle.r;
import e4.q;
import ek.t;
import rg.a1;
import rg.k0;
import rg.l0;
import rg.m0;
import rg.o0;
import rg.r0;
import rg.t0;
import rg.x0;
import th.k;

/* JADX INFO: loaded from: classes2.dex */
public class e extends vi.a {
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bk.c f33527c;

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
        public static final /* synthetic */ int[] f33529a;

        static {
            int[] iArr = new int[ml.a.values().length];
            f33529a = iArr;
            try {
                iArr[ml.a.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33529a[ml.a.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33529a[ml.a.CLASSIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e(x0 x0Var, String str) {
        super(x0Var.p());
        this.b = str;
        this.f33527c = new bk.f();
    }

    public final int c(ml.a aVar) {
        return b.f33529a[aVar.ordinal()] != 1 ? r0.b : r0.f30598a;
    }

    public final int d(ml.a aVar) {
        return l0.f30424y;
    }

    public MenuItem e(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(o0.b, menu);
        MenuItem menuItemFindItem = menu.findItem(m0.b);
        View actionView = menuItemFindItem.getActionView();
        actionView.setOnClickListener(new a());
        ((ImageView) actionView.findViewById(m0.H)).setImageResource(d(this.f33527c.getTheme()));
        return menuItemFindItem;
    }

    public void f() {
        g(null);
    }

    public void g(r rVar) {
        String strF0;
        int iB;
        if (a()) {
            q qVar = this.f33516a;
            if (qVar == null || qVar.isFinishing() || this.f33516a.l1().U0()) {
                ti.g.b().q("robux_menuoption_attempt_after_state_save");
                return;
            }
            if (t.j() && rh.h.a().i()) {
                iB = this.f33516a.getResources().getDimensionPixelSize(k0.f30398f);
                strF0 = "";
            } else if (rh.h.a().E0()) {
                strF0 = h.a();
                iB = b();
            } else {
                strF0 = a1.F0();
                iB = b();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("showRobux", true);
            if (rh.h.a().E0()) {
                bundle.putBoolean("hideNativeHeader", true);
            }
            q qVar2 = this.f33516a;
            int i10 = m0.f30445j;
            if (qVar2.findViewById(i10) == null) {
                ti.g.b().q("robux_menuoption_no_container_for_purchase");
            }
            FragmentManager fragmentManagerL1 = this.f33516a.l1();
            if (this.f33516a.findViewById(i10) != null) {
                k kVar = new k();
                kVar.O1(bundle);
                kVar.T2(strF0);
                if (rVar != null) {
                    kVar.a().a(rVar);
                }
                if (fragmentManagerL1.U0()) {
                    ti.g.b().q("robux_menuoption_committed_after_state_save");
                    ek.q.e("RobuxMenuOption", "State has already been saved. Attempting to show premium fragment, allowing state loss.");
                }
                fragmentManagerL1.r().f("robuxPurchase").b(i10, kVar, "dialog").h();
            } else {
                bundle.putInt("dialogHeight", iB);
                th.h hVar = new th.h();
                hVar.O1(bundle);
                hVar.q3(strF0);
                hVar.r2(1, c(this.f33527c.getTheme()));
                if (rVar != null) {
                    hVar.a().a(rVar);
                }
                if (fragmentManagerL1.U0()) {
                    ti.g.b().q("robux_menuoption_not_shown_after_state_save");
                    ek.q.e("RobuxMenuOption", "State has already been saved. Do not show premium dialog fragment.");
                } else {
                    hVar.t2(fragmentManagerL1, "dialog");
                }
            }
            t0.e("nativeMain", "robux", this.b);
        }
    }
}
