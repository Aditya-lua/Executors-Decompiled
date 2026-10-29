package p548xi;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.p616lifecycle.InterfaceC0978r;
import dk.C4637f;
import dk.InterfaceC4634c;
import p093e4.ActivityC4831q;
import p151gk.C6124q;
import p151gk.C6127t;
import p337ol.EnumC9799a;
import p491vh.C12204h;
import p491vh.C12207k;
import sg.C11295a1;
import sg.C11329k0;
import sg.C11332l0;
import sg.C11335m0;
import sg.C11341o0;
import sg.C11350r0;
import sg.C11356t0;
import sg.C11368x0;
import th.C11659h;
import vi.C12216g;

/* JADX INFO: renamed from: xi.e */
/* JADX INFO: loaded from: classes2.dex */
public class C12838e extends AbstractC12834a {

    /* JADX INFO: renamed from: b */
    public String f45647b;

    /* JADX INFO: renamed from: c */
    public InterfaceC4634c f45648c;

    /* JADX INFO: renamed from: xi.e$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C12838e.this.m47791f();
        }
    }

    /* JADX INFO: renamed from: xi.e$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45650a;

        static {
            int[] iArr = new int[EnumC9799a.values().length];
            f45650a = iArr;
            try {
                iArr[EnumC9799a.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45650a[EnumC9799a.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45650a[EnumC9799a.CLASSIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C12838e(C11368x0 c11368x0, String str) {
        super(c11368x0.m4693p());
        this.f45647b = str;
        this.f45648c = new C4637f();
    }

    /* JADX INFO: renamed from: c */
    public final int m47788c(EnumC9799a enumC9799a) {
        return b.f45650a[enumC9799a.ordinal()] != 1 ? C11350r0.f40036b : C11350r0.f40035a;
    }

    /* JADX INFO: renamed from: d */
    public final int m47789d(EnumC9799a enumC9799a) {
        return C11332l0.f39765y;
    }

    /* JADX INFO: renamed from: e */
    public MenuItem m47790e(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C11341o0.f39886b, menu);
        MenuItem menuItemFindItem = menu.findItem(C11335m0.f39797b);
        View actionView = menuItemFindItem.getActionView();
        actionView.setOnClickListener(new a());
        ((ImageView) actionView.findViewById(C11335m0.f39776H)).setImageResource(m47789d(this.f45648c.getTheme()));
        return menuItemFindItem;
    }

    /* JADX INFO: renamed from: f */
    public void m47791f() {
        m47792g(null);
    }

    /* JADX INFO: renamed from: g */
    public void m47792g(InterfaceC0978r interfaceC0978r) {
        String strM42391E0;
        int iM47773b;
        if (m47772a()) {
            ActivityC4831q activityC4831q = this.f45633a;
            if (activityC4831q == null || activityC4831q.isFinishing() || this.f45633a.m23360l1().m4404U0()) {
                C12216g.m45228b().m45278q("robux_menuoption_attempt_after_state_save");
                return;
            }
            if (C6127t.m27094j() && C11659h.m43403a().mo43645i()) {
                iM47773b = this.f45633a.getResources().getDimensionPixelSize(C11329k0.f39735f);
                strM42391E0 = "";
            } else if (C11659h.m43403a().mo43426D0()) {
                strM42391E0 = C12841h.m47816a();
                iM47773b = m47773b();
            } else {
                strM42391E0 = C11295a1.m42391E0();
                iM47773b = m47773b();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("showRobux", true);
            if (C11659h.m43403a().mo43426D0()) {
                bundle.putBoolean("hideNativeHeader", true);
            }
            ActivityC4831q activityC4831q2 = this.f45633a;
            int i10 = C11335m0.f39813j;
            if (activityC4831q2.findViewById(i10) == null) {
                C12216g.m45228b().m45278q("robux_menuoption_no_container_for_purchase");
            }
            FragmentManager fragmentManagerM23360l1 = this.f45633a.m23360l1();
            if (this.f45633a.findViewById(i10) != null) {
                C12207k c12207k = new C12207k();
                c12207k.m4625O1(bundle);
                c12207k.m42649T2(strM42391E0);
                if (interfaceC0978r != null) {
                    c12207k.mo4656a().mo4935a(interfaceC0978r);
                }
                if (fragmentManagerM23360l1.m4404U0()) {
                    C12216g.m45228b().m45278q("robux_menuoption_committed_after_state_save");
                    C6124q.m27060e("RobuxMenuOption", "State has already been saved. Attempting to show premium fragment, allowing state loss.");
                }
                fragmentManagerM23360l1.m4452r().m4779f("robuxPurchase").m4775b(i10, c12207k, "dialog").mo4509h();
            } else {
                bundle.putInt("dialogHeight", iM47773b);
                C12204h c12204h = new C12204h();
                c12204h.m4625O1(bundle);
                c12204h.m15021q3(strM42391E0);
                c12204h.m23337r2(1, m47788c(this.f45648c.getTheme()));
                if (interfaceC0978r != null) {
                    c12204h.mo4656a().mo4935a(interfaceC0978r);
                }
                if (fragmentManagerM23360l1.m4404U0()) {
                    C12216g.m45228b().m45278q("robux_menuoption_not_shown_after_state_save");
                    C6124q.m27060e("RobuxMenuOption", "State has already been saved. Do not show premium dialog fragment.");
                } else {
                    c12204h.mo23339t2(fragmentManagerM23360l1, "dialog");
                }
            }
            C11356t0.m42535e("nativeMain", "robux", this.f45647b);
        }
    }
}
