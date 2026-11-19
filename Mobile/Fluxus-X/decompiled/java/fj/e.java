package fj;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.p000lifecycle.r;
import bh.a1;
import bh.k0;
import bh.l0;
import bh.m0;
import bh.o0;
import bh.r0;
import bh.t0;
import bh.x0;
import com.github.luben.zstd.BuildConfig;
import di.j;
import f4.v;
import ok.q;
import ok.t;

/* JADX INFO: loaded from: classes2.dex */
public class e extends fj.a {
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public lk.c f16133c;

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
        public static final /* synthetic */ int[] f16135a;

        static {
            int[] iArr = new int[cm.a.values().length];
            f16135a = iArr;
            try {
                iArr[cm.a.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16135a[cm.a.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16135a[cm.a.CLASSIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e(x0 x0Var, String str) {
        super(x0Var.p());
        this.b = str;
        this.f16133c = new lk.f();
    }

    public final int c(cm.a aVar) {
        return b.f16135a[aVar.ordinal()] != 1 ? r0.f4301c : r0.b;
    }

    public final int d(cm.a aVar) {
        return l0.f4125y;
    }

    public MenuItem e(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(o0.b, menu);
        MenuItem menuItemFindItem = menu.findItem(m0.b);
        View actionView = menuItemFindItem.getActionView();
        actionView.setOnClickListener(new a());
        ((ImageView) actionView.findViewById(m0.H)).setImageResource(d(this.f16133c.getTheme()));
        return menuItemFindItem;
    }

    public void f() {
        g(null);
    }

    public void g(r rVar) {
        String strF0;
        int iB;
        if (a()) {
            v vVar = this.f16122a;
            if (vVar == null || vVar.isFinishing() || this.f16122a.l1().U0()) {
                dj.g.b().q("robux_menuoption_attempt_after_state_save");
                return;
            }
            if (t.j() && bi.h.a().i()) {
                iB = this.f16122a.getResources().getDimensionPixelSize(k0.f4099f);
                strF0 = BuildConfig.FLAVOR;
            } else if (bi.h.a().I0()) {
                strF0 = h.a();
                iB = b();
            } else {
                strF0 = a1.F0();
                iB = b();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("showRobux", true);
            if (bi.h.a().I0()) {
                bundle.putBoolean("hideNativeHeader", true);
            }
            if (this.f16122a.findViewById(m0.f4146j) == null) {
                dj.g.b().q("robux_menuoption_no_container_for_purchase");
            }
            f4.k0 k0VarL1 = this.f16122a.l1();
            if (this.f16122a.findViewById(m0.f4146j) != null) {
                j jVar = new j();
                jVar.O1(bundle);
                jVar.T2(strF0);
                if (rVar != null) {
                    jVar.a().a(rVar);
                }
                if (k0VarL1.U0()) {
                    dj.g.b().q("robux_menuoption_committed_after_state_save");
                    q.e("RobuxMenuOption", "State has already been saved. Attempting to show premium fragment, allowing state loss.");
                }
                k0VarL1.r().f("robuxPurchase").b(m0.f4146j, jVar, "dialog").h();
            } else {
                bundle.putInt("dialogHeight", iB);
                di.g gVar = new di.g();
                gVar.O1(bundle);
                gVar.q3(strF0);
                gVar.r2(1, c(this.f16133c.getTheme()));
                if (rVar != null) {
                    gVar.a().a(rVar);
                }
                if (k0VarL1.U0()) {
                    dj.g.b().q("robux_menuoption_not_shown_after_state_save");
                    q.e("RobuxMenuOption", "State has already been saved. Do not show premium dialog fragment.");
                } else {
                    gVar.t2(k0VarL1, "dialog");
                }
            }
            t0.e("nativeMain", "robux", this.b);
        }
    }
}
