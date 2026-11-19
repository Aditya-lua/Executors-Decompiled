package di;

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
import bh.m0;
import bh.n0;
import bh.q0;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.components.RobloxToolbar;
import com.roblox.client.startup.MainGameActivity;
import eh.v0;
import f4.v;
import java.net.URI;
import ok.q;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d extends com.roblox.client.c {
    public fj.f A1;
    public fj.i B1;
    public ProgressDialog C1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public String f12421j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f12422k1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public JSONObject f12425n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public boolean f12426o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public RobloxToolbar f12427p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public ImageView f12428q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public RobloxToolbar.c f12429r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public fj.d f12430s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public Menu f12431t1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public String f12418g1 = null;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f12419h1 = false;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f12420i1 = -1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f12423l1 = false;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f12424m1 = false;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public boolean f12432u1 = false;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public boolean f12433v1 = false;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public boolean f12434w1 = false;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public boolean f12435x1 = true;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public boolean f12436y1 = false;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public View f12437z1 = null;

    public class a implements yi.h.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f12438a;

        public a(Activity activity) {
            this.f12438a = activity;
        }

        @Override // yi.h.c
        public void a(boolean z10) {
            q.i("rbx.locale", "onAppLanguageChangeEvent(), Api call to get locale values");
            Activity activity = this.f12438a;
            if (activity == null || !activity.isFinishing()) {
                d.this.O3();
                if (z10) {
                    if (bi.h.a().Q1() && bi.h.a().D3() && (this.f12438a instanceof MainGameActivity)) {
                        yi.b.f().u(this.f12438a);
                        return;
                    }
                    this.f12438a.recreate();
                    Activity activity2 = this.f12438a;
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
        View view = this.f12437z1;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.roblox.client.c, bh.x0, f4.o, f4.q
    public void F0(Bundle bundle) {
        super.F0(bundle);
        Bundle bundleT = t();
        if (bundleT != null) {
            this.f12420i1 = bundleT.getInt("TITLE_ID", -1);
            this.f12421j1 = bundleT.getString("TITLE_STRING");
            this.f12418g1 = bundleT.getString("REPORTING_TAB_NAME");
            this.f12419h1 = bundleT.getBoolean("HAS_PARENT");
            this.f12423l1 = bundleT.getBoolean("HIDE_ACCESSORY_BUTTONS");
            this.f12422k1 = bundleT.getBoolean("SHOW_DOMAIN_AS_TITLE");
            this.f12426o1 = bundleT.getBoolean("CLOSE_FRAGMENT_ON_RESTORED");
            this.f12424m1 = bundleT.getBoolean("hideNativeHeader", false);
            boolean z10 = bundleT.getBoolean("BACK_NAVIGATION_DISABLED", true);
            this.f12435x1 = z10;
            if (z10) {
                this.f12432u1 = false;
                A3(true);
            }
            try {
                this.f12425n1 = new JSONObject(bundleT.getString("SEARCH_PARAMS", null));
            } catch (NullPointerException | JSONException unused) {
            }
        }
        if (bundle != null && this.f12426o1) {
            q.h("rbx.web", "onCreate: ... Closing this web fragment on restored.");
            v vVarP = p();
            if (vVarP != null) {
                vVarP.l1().r().m(this).h();
            }
        }
        if (this.f12425n1 == null) {
            this.f12425n1 = new JSONObject();
        }
    }

    @Override // com.roblox.client.c
    public void H3(bm.a aVar) {
        super.H3(aVar);
        String str = aVar.b;
        if (str != null) {
            this.f12427p1.setTitle(str);
        }
    }

    @Override // com.roblox.client.c
    public v0.b I3() {
        return v0.b.GENERIC_WEB_FRAGMENT;
    }

    @Override // com.roblox.client.c, f4.q
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(n0.E, viewGroup, false);
        this.f12429r1 = new RobloxToolbar.c();
        RobloxToolbar robloxToolbar = (RobloxToolbar) linearLayout.findViewById(m0.f4157o0);
        this.f12427p1 = robloxToolbar;
        if (this.f12424m1) {
            robloxToolbar.setVisibility(8);
        } else {
            robloxToolbar.h0(new View.OnClickListener() { // from class: di.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12415a.Q3(view);
                }
            });
            this.f12427p1.setCloseButtonGravity(8388627);
        }
        FrameLayout frameLayout = (FrameLayout) linearLayout.findViewById(m0.f4142h);
        frameLayout.addView(super.J0(layoutInflater, frameLayout, bundle));
        if (this.f12424m1) {
            ImageView imageView = (ImageView) linearLayout.findViewById(m0.D);
            this.f12428q1 = imageView;
            imageView.setVisibility(0);
            this.f12428q1.setImageResource(this.f12429r1.a(nk.c.c().g()));
            this.f12428q1.setOnClickListener(new View.OnClickListener() { // from class: di.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12416a.R3(view);
                }
            });
        }
        X3(this.f12427p1.getMenu(), H1().getMenuInflater());
        this.f12437z1 = linearLayout;
        if (!this.X0) {
            D3(false);
        }
        return linearLayout;
    }

    @Override // com.roblox.client.c, f4.o, f4.q
    public void M0() {
        O3();
        super.M0();
    }

    public final ProgressDialog N3(Context context, String str) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle((CharSequence) null);
        progressDialog.setMessage(str);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        return progressDialog;
    }

    public final void O3() {
        ProgressDialog progressDialog = this.C1;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.C1.dismiss();
    }

    @Override // com.roblox.client.c, f4.q
    public void P0(boolean z10) {
        if (!z10) {
            this.f12436y1 = false;
        }
        super.P0(z10);
        if (z10) {
            return;
        }
        Z3();
    }

    public void P3(Menu menu, MenuInflater menuInflater) {
        fj.d dVar = new fj.d(this);
        this.f12430s1 = dVar;
        dVar.d(menu, menuInflater);
    }

    public final /* synthetic */ void Q3(View view) {
        U3(v0.a.CLOSE_BUTTON);
    }

    public final /* synthetic */ void R3(View view) {
        U3(v0.a.CLOSE_BUTTON);
    }

    public final /* synthetic */ void S3(View view) {
        boolean zE3 = !this.f12435x1 ? e3() : false;
        v vVarP = p();
        if (zE3 || vVarP == null) {
            return;
        }
        vVarP.onBackPressed();
    }

    public void T3(Activity activity, yi.h hVar, yi.h.c cVar) {
        hVar.b(activity, true, cVar);
    }

    public void U3(v0.a aVar) {
        if (!this.f12436y1) {
            this.f12436y1 = true;
            v0.q(aVar);
        }
        v vVarP = p();
        if (vVarP != null) {
            vVarP.onBackPressed();
        }
    }

    public void V3(String str) {
        if (this.f12434w1) {
            return;
        }
        this.f12434w1 = true;
        v0.r(str);
    }

    public final void W3(String str) {
        String string = BuildConfig.FLAVOR;
        try {
            URI uri = new URI(str);
            boolean zEqualsIgnoreCase = uri.getScheme().equalsIgnoreCase("https");
            String host = uri.getHost();
            if (host.startsWith("www.")) {
                host = host.substring(4);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(zEqualsIgnoreCase ? "🔒 " : BuildConfig.FLAVOR);
            sb2.append(host);
            string = sb2.toString();
        } catch (Exception e10) {
            q.f("rbx.web", "Failed to parse domain for title", e10);
        }
        this.f12427p1.setTitle(string);
    }

    public void X3(Menu menu, MenuInflater menuInflater) {
        this.f12431t1 = menu;
        if (this.f12423l1) {
            if (this.f12425n1.length() > 0) {
                Y3(menu, menuInflater, 54);
            }
        } else {
            Y3(menu, menuInflater, 34);
            new fj.e(this, this.f12418g1).e(menu, menuInflater);
            P3(menu, menuInflater);
        }
    }

    public void Y3(Menu menu, MenuInflater menuInflater, int i10) {
        String strOptString = this.f12425n1.optString("searchType", null);
        if (strOptString != null) {
            this.B1 = new fj.g(this, strOptString);
        }
        if (this.B1 == null) {
            this.B1 = new fj.i(this);
        }
        fj.f fVar = new fj.f(this);
        this.A1 = fVar;
        fVar.n(menu);
        this.A1.p(this.f12427p1);
        this.A1.o(this.B1);
        this.A1.k(menu, menuInflater);
        nh.h.a(this.f12427p1, v(), m0.f4132c, i10);
    }

    public final void Z3() {
        fj.d dVar = this.f12430s1;
        if (dVar != null) {
            dVar.j();
        }
    }

    @Override // com.roblox.client.c, f4.q
    public void a1() {
        super.a1();
        Z3();
        this.f12436y1 = false;
    }

    public final void a4(String str) {
        fj.i iVar;
        if (this.A1 == null || (iVar = this.B1) == null) {
            return;
        }
        iVar.f(str);
        this.A1.r();
    }

    public final void b4(boolean z10) {
        if (this.f12435x1 || this.f12432u1 == z10) {
            return;
        }
        this.f12432u1 = z10;
        this.f12427p1.setNavigationOnClickListener(z10 ? new View.OnClickListener() { // from class: di.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12417a.S3(view);
            }
        } : null);
    }

    @Override // com.roblox.client.c, bh.x0, f4.o, f4.q
    public void c1() {
        super.c1();
        mw.c.d().n(this);
    }

    @Override // com.roblox.client.c, bh.x0, f4.o, f4.q
    public void d1() {
        if (v0() && !this.f12436y1) {
            v0.q(v0.a.PROGRAMMATIC);
        }
        mw.c.d().p(this);
        super.d1();
    }

    @Override // com.roblox.client.c
    public boolean e3() {
        if (this.f12436y1) {
            return false;
        }
        return super.e3();
    }

    @Override // com.roblox.client.c, bh.x0, lk.e.b
    public void g0(cm.a aVar) {
        ImageView imageView;
        this.f12427p1.g0(aVar);
        if (this.f12424m1 && (imageView = this.f12428q1) != null) {
            imageView.setImageResource(this.f12429r1.a(aVar));
        }
        v vVarP = p();
        if (vVarP != null) {
            Menu menu = this.f12427p1.getMenu();
            menu.clear();
            X3(menu, vVarP.getMenuInflater());
        }
        super.g0(aVar);
    }

    @mw.j(threadMode = ThreadMode.MAIN)
    public void onAppLocaleChangeEvent(yh.a aVar) {
        v vVarP = p();
        if (vVarP != null) {
            ProgressDialog progressDialogN3 = N3(vVarP, d0(q0.K));
            this.C1 = progressDialogN3;
            progressDialogN3.show();
            T3(vVarP, new yi.h(), new a(vVarP));
        }
    }

    @mw.j(threadMode = ThreadMode.MAIN)
    public void onUnreadNotificationCountEvent(yh.i iVar) {
        new StringBuilder().append("GWF.onUnreadNotificationCountEvent() ");
        throw null;
    }

    @Override // com.roblox.client.c
    public void t3(String str) {
        this.f12433v1 = false;
        if (this.f12422k1) {
            W3(str);
        }
        a4(str);
    }

    @Override // com.roblox.client.c
    public void u3() {
        this.f12433v1 = true;
    }

    @Override // com.roblox.client.c
    public void v3(String str) {
        if (this.f12433v1 || !x0()) {
            return;
        }
        V3(str);
    }

    @Override // com.roblox.client.c
    public void x3(WebView webView, int i10) {
        super.x3(webView, i10);
        b4(webView.canGoBack());
    }

    @Override // bh.x0, f4.o, f4.q
    public void z0(Bundle bundle) {
        super.z0(bundle);
        if (this.f12422k1) {
            return;
        }
        String str = this.f12421j1;
        if (str != null) {
            this.f12427p1.setTitle(str);
            return;
        }
        int i10 = this.f12420i1;
        if (i10 == -1) {
            this.f12427p1.setTitle(q0.f4288x);
        } else {
            this.f12427p1.setTitle(i10);
        }
    }
}
