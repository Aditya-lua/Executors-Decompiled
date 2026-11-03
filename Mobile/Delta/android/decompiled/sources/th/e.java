package th;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.components.RobloxToolbar;
import e4.q;
import java.net.URI;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import rg.m0;
import rg.n0;
import rg.q0;
import ug.c0;

/* JADX INFO: loaded from: classes2.dex */
public class e extends com.roblox.client.c {
    public View.OnClickListener D1;
    public vi.f E1;
    public vi.i F1;
    public ProgressDialog G1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public String f32329j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f32330k1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public JSONObject f32333n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public boolean f32334o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public boolean f32335p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public boolean f32336q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public RobloxToolbar f32337r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public RobloxToolbar f32338s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public ImageView f32339t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public RobloxToolbar.c f32340u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public vi.d f32341v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public Menu f32342w1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public String f32326g1 = null;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f32327h1 = false;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f32328i1 = -1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f32331l1 = false;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f32332m1 = false;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public boolean f32343x1 = false;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public boolean f32344y1 = false;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public boolean f32345z1 = false;
    public boolean A1 = true;
    public boolean B1 = false;
    public View C1 = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q qVarP;
            if (e.this.e3()) {
                return;
            }
            e eVar = e.this;
            if (!eVar.f32327h1 || (qVarP = eVar.p()) == null) {
                return;
            }
            qVarP.onBackPressed();
        }
    }

    public class b implements oi.h.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f32347a;

        public b(Activity activity) {
            this.f32347a = activity;
        }

        @Override // oi.h.c
        public void a(boolean z10) {
            ek.q.i("rbx.locale", "onAppLanguageChangeEvent(), Api call to get locale values");
            Activity activity = this.f32347a;
            if (activity == null || !activity.isFinishing()) {
                e.this.P3();
                if (z10) {
                    this.f32347a.recreate();
                    Activity activity2 = this.f32347a;
                    if (activity2 instanceof ActivityNativeMain) {
                        return;
                    }
                    activity2.finish();
                }
            }
        }
    }

    @Override // com.roblox.client.c
    public void D3(boolean z10) {
        super.D3(z10);
        View view = this.C1;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.roblox.client.c, rg.x0, e4.k, androidx.fragment.app.c
    public void F0(Bundle bundle) {
        super.F0(bundle);
        Bundle bundleT = t();
        if (bundleT != null) {
            this.f32328i1 = bundleT.getInt("TITLE_ID", -1);
            this.f32329j1 = bundleT.getString("TITLE_STRING");
            this.f32326g1 = bundleT.getString("REPORTING_TAB_NAME");
            this.f32327h1 = bundleT.getBoolean("HAS_PARENT");
            this.f32331l1 = bundleT.getBoolean("HIDE_ACCESSORY_BUTTONS");
            this.f32330k1 = bundleT.getBoolean("SHOW_DOMAIN_AS_TITLE");
            this.f32334o1 = bundleT.getBoolean("CLOSE_FRAGMENT_ON_RESTORED");
            this.f32335p1 = bundleT.getBoolean("ENABLE_WEB_VIEW_SERVICE", false);
            this.f32332m1 = bundleT.getBoolean("hideNativeHeader", false);
            ek.q.h("rbx.web", "onCreate enableWebViewService = " + this.f32335p1);
            if (this.f32335p1) {
                boolean z10 = bundleT.getBoolean("BACK_NAVIGATION_DISABLED", true);
                this.A1 = z10;
                if (z10) {
                    this.f32343x1 = false;
                    A3(true);
                }
            } else if (w() instanceof ActivityNativeMain) {
                this.f32336q1 = true;
            }
            try {
                this.f32333n1 = new JSONObject(bundleT.getString("SEARCH_PARAMS", null));
            } catch (NullPointerException | JSONException unused) {
            }
        }
        if (bundle != null && this.f32334o1) {
            ek.q.h("rbx.web", "onCreate: ... Closing this web fragment on restored.");
            q qVarP = p();
            if (qVarP != null) {
                qVarP.l1().r().m(this).h();
            }
        }
        if (this.f32333n1 == null) {
            this.f32333n1 = new JSONObject();
        }
        this.D1 = new a();
    }

    @Override // com.roblox.client.c
    public void H3(ll.a aVar) {
        super.H3(aVar);
        String str = aVar.b;
        if (str != null) {
            if (this.f32335p1) {
                this.f32337r1.setTitle(str);
            } else {
                this.f32338s1.setTitle(str);
            }
        }
    }

    @Override // com.roblox.client.c
    public c0.b I3() {
        return c0.b.GENERIC_WEB_FRAGMENT;
    }

    @Override // com.roblox.client.c, androidx.fragment.app.c
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(n0.E, viewGroup, false);
        this.f32340u1 = new RobloxToolbar.c();
        if (!this.f32335p1) {
            this.f32337r1 = (RobloxToolbar) linearLayout.findViewById(m0.f30452m0);
            RobloxToolbar robloxToolbar = (RobloxToolbar) linearLayout.findViewById(m0.f30454n0);
            this.f32338s1 = robloxToolbar;
            if (this.f32336q1) {
                this.f32337r1.setVisibility(8);
            } else {
                robloxToolbar.setThemeColorDelegate(new RobloxToolbar.f());
                this.f32337r1.setIconDelegate(new RobloxToolbar.c());
                this.f32337r1.setThemeColorDelegate(new RobloxToolbar.d());
                this.f32337r1.setNavigationOnClickListener(new View.OnClickListener() { // from class: th.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f32324a.T3(view);
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) linearLayout.findViewById(m0.f30441h);
            frameLayout.addView(super.J0(layoutInflater, frameLayout, bundle));
            Z3(this.f32338s1.getMenu(), p().getMenuInflater());
            this.C1 = linearLayout;
            if (!this.X0) {
                D3(false);
            }
            return linearLayout;
        }
        this.f32337r1 = (RobloxToolbar) linearLayout.findViewById(m0.f30452m0);
        RobloxToolbar robloxToolbar2 = (RobloxToolbar) linearLayout.findViewById(m0.f30454n0);
        this.f32338s1 = robloxToolbar2;
        robloxToolbar2.setVisibility(8);
        if (this.f32332m1) {
            this.f32337r1.setVisibility(8);
        } else {
            this.f32337r1.h0(new View.OnClickListener() { // from class: th.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32322a.R3(view);
                }
            });
            this.f32337r1.setCloseButtonGravity(8388627);
        }
        FrameLayout frameLayout2 = (FrameLayout) linearLayout.findViewById(m0.f30441h);
        frameLayout2.addView(super.J0(layoutInflater, frameLayout2, bundle));
        if (this.f32332m1) {
            ImageView imageView = (ImageView) linearLayout.findViewById(m0.D);
            this.f32339t1 = imageView;
            imageView.setVisibility(0);
            this.f32339t1.setImageResource(this.f32340u1.a(dk.c.c().g()));
            this.f32339t1.setOnClickListener(new View.OnClickListener() { // from class: th.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32323a.S3(view);
                }
            });
        }
        Z3(this.f32337r1.getMenu(), H1().getMenuInflater());
        this.C1 = linearLayout;
        if (!this.X0) {
            D3(false);
        }
        return linearLayout;
    }

    @Override // com.roblox.client.c, e4.k, androidx.fragment.app.c
    public void M0() {
        P3();
        super.M0();
    }

    public final ProgressDialog O3(Context context, String str) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle((CharSequence) null);
        progressDialog.setMessage(str);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        return progressDialog;
    }

    @Override // com.roblox.client.c, androidx.fragment.app.c
    public void P0(boolean z10) {
        if (!z10) {
            this.B1 = false;
        }
        super.P0(z10);
        if (z10) {
            return;
        }
        b4();
    }

    public final void P3() {
        ProgressDialog progressDialog = this.G1;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.G1.dismiss();
    }

    public void Q3(Menu menu, MenuInflater menuInflater) {
        vi.d dVar = new vi.d(this);
        this.f32341v1 = dVar;
        dVar.d(menu, menuInflater);
    }

    public final /* synthetic */ void R3(View view) {
        W3(c0.a.CLOSE_BUTTON);
    }

    public final /* synthetic */ void S3(View view) {
        W3(c0.a.CLOSE_BUTTON);
    }

    public final /* synthetic */ void T3(View view) {
        W3(c0.a.BACK_BUTTON);
    }

    public final /* synthetic */ void U3(View view) {
        boolean zE3 = !this.A1 ? e3() : false;
        q qVarP = p();
        if (zE3 || qVarP == null) {
            return;
        }
        qVarP.onBackPressed();
    }

    public void V3(Activity activity, oi.h hVar, oi.h.c cVar) {
        hVar.b(activity, true, cVar);
    }

    public void W3(c0.a aVar) {
        if (!this.B1) {
            this.B1 = true;
            c0.q(aVar);
        }
        q qVarP = p();
        if (qVarP != null) {
            qVarP.onBackPressed();
        }
    }

    public void X3(String str) {
        if (this.f32345z1) {
            return;
        }
        this.f32345z1 = true;
        c0.r(str);
    }

    public final void Y3(String str) {
        String string = "";
        try {
            URI uri = new URI(str);
            boolean zEqualsIgnoreCase = uri.getScheme().equalsIgnoreCase("https");
            String host = uri.getHost();
            if (host.startsWith("www.")) {
                host = host.substring(4);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(zEqualsIgnoreCase ? "🔒 " : "");
            sb2.append(host);
            string = sb2.toString();
        } catch (Exception e10) {
            ek.q.f("rbx.web", "Failed to parse domain for title", e10);
        }
        if (this.f32335p1) {
            this.f32337r1.setTitle(string);
        } else {
            this.f32338s1.setTitle(string);
        }
    }

    public void Z3(Menu menu, MenuInflater menuInflater) {
        this.f32342w1 = menu;
        if (this.f32331l1) {
            if (this.f32333n1.length() > 0) {
                a4(menu, menuInflater, 54);
            }
        } else {
            a4(menu, menuInflater, 34);
            new vi.e(this, this.f32326g1).e(menu, menuInflater);
            Q3(menu, menuInflater);
        }
    }

    @Override // com.roblox.client.c, rg.x0, bk.e.b
    public void a0(ml.a aVar) {
        ImageView imageView;
        if (this.f32335p1) {
            this.f32337r1.a0(aVar);
        } else {
            this.f32338s1.a0(aVar);
            this.f32337r1.a0(aVar);
        }
        if (this.f32332m1 && (imageView = this.f32339t1) != null) {
            imageView.setImageResource(this.f32340u1.a(aVar));
        }
        q qVarP = p();
        if (qVarP != null) {
            Menu menu = (this.f32335p1 ? this.f32337r1 : this.f32338s1).getMenu();
            menu.clear();
            Z3(menu, qVarP.getMenuInflater());
        }
        super.a0(aVar);
    }

    @Override // com.roblox.client.c, androidx.fragment.app.c
    public void a1() {
        super.a1();
        b4();
        this.B1 = false;
    }

    public void a4(Menu menu, MenuInflater menuInflater, int i10) {
        String strOptString = this.f32333n1.optString("searchType", null);
        if (strOptString != null) {
            this.F1 = new vi.g(this, strOptString);
        }
        if (this.F1 == null) {
            this.F1 = new vi.i(this);
        }
        vi.f fVar = new vi.f(this);
        this.E1 = fVar;
        fVar.n(menu);
        this.E1.p(this.f32335p1 ? this.f32337r1 : this.f32338s1);
        this.E1.o(this.F1);
        this.E1.k(menu, menuInflater);
        dh.h.a(this.f32335p1 ? this.f32337r1 : this.f32338s1, w(), m0.f30431c, i10);
    }

    public final void b4() {
        vi.d dVar = this.f32341v1;
        if (dVar != null) {
            dVar.j();
        }
    }

    @Override // com.roblox.client.c, rg.x0, e4.k, androidx.fragment.app.c
    public void c1() {
        super.c1();
        dv.c.d().n(this);
    }

    public final void c4(String str) {
        vi.i iVar;
        if (this.E1 == null || (iVar = this.F1) == null) {
            return;
        }
        iVar.f(str);
        this.E1.r();
    }

    @Override // com.roblox.client.c, rg.x0, e4.k, androidx.fragment.app.c
    public void d1() {
        if (v0() && !this.B1) {
            c0.q(c0.a.PROGRAMMATIC);
        }
        dv.c.d().p(this);
        super.d1();
    }

    public final void d4(boolean z10) {
        if (this.f32335p1) {
            if (this.A1 || this.f32343x1 == z10) {
                return;
            }
            this.f32343x1 = z10;
            this.f32337r1.setNavigationOnClickListener(z10 ? new View.OnClickListener() { // from class: th.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32325a.U3(view);
                }
            } : null);
            return;
        }
        if (this.f32343x1 != z10) {
            ek.q.b("rbx.web", "updateToolbar() canGoBack:" + z10);
            this.f32343x1 = z10;
            dh.h.b(this.f32338s1, (z10 || this.f32327h1) ? this.D1 : null);
        }
    }

    @Override // com.roblox.client.c
    public boolean e3() {
        if (this.B1) {
            return false;
        }
        return super.e3();
    }

    @dv.j(threadMode = ThreadMode.MAIN)
    public void onAppLocaleChangeEvent(oh.a aVar) {
        q qVarP = p();
        if (qVarP != null) {
            ProgressDialog progressDialogO3 = O3(qVarP, e0(q0.K));
            this.G1 = progressDialogO3;
            progressDialogO3.show();
            V3(qVarP, new oi.h(), new b(qVarP));
        }
    }

    @dv.j(threadMode = ThreadMode.MAIN)
    public void onUnreadNotificationCountEvent(oh.i iVar) {
        new StringBuilder().append("GWF.onUnreadNotificationCountEvent() ");
        throw null;
    }

    @Override // com.roblox.client.c
    public void t3(String str) {
        this.f32344y1 = false;
        if (this.f32330k1) {
            Y3(str);
        }
        c4(str);
    }

    @Override // com.roblox.client.c
    public void u3() {
        this.f32344y1 = true;
    }

    @Override // com.roblox.client.c
    public void v3(String str) {
        if (this.f32344y1 || !x0()) {
            return;
        }
        X3(str);
    }

    @Override // com.roblox.client.c
    public void x3(WebView webView, int i10) {
        super.x3(webView, i10);
        d4(webView.canGoBack());
    }

    @Override // rg.x0, e4.k, androidx.fragment.app.c
    public void z0(Bundle bundle) {
        super.z0(bundle);
        if (!this.f32330k1) {
            String str = this.f32329j1;
            if (str == null) {
                int i10 = this.f32328i1;
                if (i10 == -1) {
                    if (this.f32335p1) {
                        this.f32337r1.setTitle(q0.f30586x);
                    } else {
                        this.f32338s1.setTitle(q0.f30586x);
                    }
                } else if (this.f32335p1) {
                    this.f32337r1.setTitle(i10);
                } else {
                    this.f32338s1.setTitle(i10);
                }
            } else if (this.f32335p1) {
                this.f32337r1.setTitle(str);
            } else {
                this.f32338s1.setTitle(str);
            }
        }
        dh.h.b(this.f32338s1, this.f32327h1 ? this.D1 : null);
    }
}
