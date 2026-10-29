package p491vh;

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
import com.roblox.client.C3161c;
import com.roblox.client.components.RobloxToolbar;
import fk.C5654c;
import java.net.URI;
import nl.C9492a;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p093e4.ActivityC4831q;
import p103eh.C5120h;
import p138fv.C5840c;
import p138fv.InterfaceC5847j;
import p151gk.C6124q;
import p337ol.EnumC9799a;
import p383qi.C10589h;
import p548xi.C12837d;
import p548xi.C12838e;
import p548xi.C12839f;
import p548xi.C12840g;
import p548xi.C12842i;
import ph.C10252a;
import ph.C10260i;
import sg.C11335m0;
import sg.C11338n0;
import sg.C11347q0;
import vg.C12173c0;

/* JADX INFO: renamed from: vh.e */
/* JADX INFO: loaded from: classes2.dex */
public class C12201e extends C3161c {

    /* JADX INFO: renamed from: D1 */
    public View.OnClickListener f42972D1;

    /* JADX INFO: renamed from: E1 */
    public C12839f f42973E1;

    /* JADX INFO: renamed from: F1 */
    public C12842i f42974F1;

    /* JADX INFO: renamed from: G1 */
    public ProgressDialog f42975G1;

    /* JADX INFO: renamed from: j1 */
    public String f42979j1;

    /* JADX INFO: renamed from: k1 */
    public boolean f42980k1;

    /* JADX INFO: renamed from: n1 */
    public JSONObject f42983n1;

    /* JADX INFO: renamed from: o1 */
    public boolean f42984o1;

    /* JADX INFO: renamed from: p1 */
    public boolean f42985p1;

    /* JADX INFO: renamed from: q1 */
    public boolean f42986q1;

    /* JADX INFO: renamed from: r1 */
    public RobloxToolbar f42987r1;

    /* JADX INFO: renamed from: s1 */
    public RobloxToolbar f42988s1;

    /* JADX INFO: renamed from: t1 */
    public ImageView f42989t1;

    /* JADX INFO: renamed from: u1 */
    public RobloxToolbar.C3171c f42990u1;

    /* JADX INFO: renamed from: v1 */
    public C12837d f42991v1;

    /* JADX INFO: renamed from: w1 */
    public Menu f42992w1;

    /* JADX INFO: renamed from: g1 */
    public String f42976g1 = null;

    /* JADX INFO: renamed from: h1 */
    public boolean f42977h1 = false;

    /* JADX INFO: renamed from: i1 */
    public int f42978i1 = -1;

    /* JADX INFO: renamed from: l1 */
    public boolean f42981l1 = false;

    /* JADX INFO: renamed from: m1 */
    public boolean f42982m1 = false;

    /* JADX INFO: renamed from: x1 */
    public boolean f42993x1 = false;

    /* JADX INFO: renamed from: y1 */
    public boolean f42994y1 = false;

    /* JADX INFO: renamed from: z1 */
    public boolean f42995z1 = false;

    /* JADX INFO: renamed from: A1 */
    public boolean f42969A1 = true;

    /* JADX INFO: renamed from: B1 */
    public boolean f42970B1 = false;

    /* JADX INFO: renamed from: C1 */
    public View f42971C1 = null;

    /* JADX INFO: renamed from: vh.e$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityC4831q activityC4831qM4693p;
            if (C12201e.this.mo15009e3()) {
                return;
            }
            C12201e c12201e = C12201e.this;
            if (!c12201e.f42977h1 || (activityC4831qM4693p = c12201e.m4693p()) == null) {
                return;
            }
            activityC4831qM4693p.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: vh.e$b */
    public class b implements C10589h.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f42997a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(Activity activity) {
            this.f42997a = activity;
        }

        @Override // p383qi.C10589h.c
        /* JADX INFO: renamed from: a */
        public void mo40612a(boolean z10) {
            C6124q.m27064i("rbx.locale", "onAppLanguageChangeEvent(), Api call to get locale values");
            Activity activity = this.f42997a;
            if (activity == null || !activity.isFinishing()) {
                C12201e.this.m45161P3();
                if (z10) {
                    this.f42997a.recreate();
                    Activity activity2 = this.f42997a;
                    if (activity2 instanceof ActivityNativeMain) {
                        return;
                    }
                    activity2.finish();
                }
            }
        }
    }

    @Override // com.roblox.client.C3161c
    /* JADX INFO: renamed from: D3 */
    public void mo14996D3(boolean z10) {
        super.mo14996D3(z10);
        View view = this.f42971C1;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.roblox.client.C3161c, sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: F0 */
    public void mo4599F0(Bundle bundle) {
        super.mo4599F0(bundle);
        Bundle bundleM4704t = m4704t();
        if (bundleM4704t != null) {
            this.f42978i1 = bundleM4704t.getInt("TITLE_ID", -1);
            this.f42979j1 = bundleM4704t.getString("TITLE_STRING");
            this.f42976g1 = bundleM4704t.getString("REPORTING_TAB_NAME");
            this.f42977h1 = bundleM4704t.getBoolean("HAS_PARENT");
            this.f42981l1 = bundleM4704t.getBoolean("HIDE_ACCESSORY_BUTTONS");
            this.f42980k1 = bundleM4704t.getBoolean("SHOW_DOMAIN_AS_TITLE");
            this.f42984o1 = bundleM4704t.getBoolean("CLOSE_FRAGMENT_ON_RESTORED");
            this.f42985p1 = bundleM4704t.getBoolean("ENABLE_WEB_VIEW_SERVICE", false);
            this.f42982m1 = bundleM4704t.getBoolean("hideNativeHeader", false);
            C6124q.m27063h("rbx.web", "onCreate enableWebViewService = " + this.f42985p1);
            if (this.f42985p1) {
                boolean z10 = bundleM4704t.getBoolean("BACK_NAVIGATION_DISABLED", true);
                this.f42969A1 = z10;
                if (z10) {
                    this.f42993x1 = false;
                    m14993A3(true);
                }
            } else if (mo4715x() instanceof ActivityNativeMain) {
                this.f42986q1 = true;
            }
            try {
                this.f42983n1 = new JSONObject(bundleM4704t.getString("SEARCH_PARAMS", null));
            } catch (NullPointerException | JSONException unused) {
            }
        }
        if (bundle != null && this.f42984o1) {
            C6124q.m27063h("rbx.web", "onCreate: ... Closing this web fragment on restored.");
            ActivityC4831q activityC4831qM4693p = m4693p();
            if (activityC4831qM4693p != null) {
                activityC4831qM4693p.m23360l1().m4452r().mo4513m(this).mo4509h();
            }
        }
        if (this.f42983n1 == null) {
            this.f42983n1 = new JSONObject();
        }
        this.f42972D1 = new a();
    }

    @Override // com.roblox.client.C3161c
    /* JADX INFO: renamed from: H3 */
    public void mo15000H3(C9492a c9492a) {
        super.mo15000H3(c9492a);
        String str = c9492a.f34109b;
        if (str != null) {
            if (this.f42985p1) {
                this.f42987r1.setTitle(str);
            } else {
                this.f42988s1.setTitle(str);
            }
        }
    }

    @Override // com.roblox.client.C3161c
    /* JADX INFO: renamed from: I3 */
    public C12173c0.b mo15001I3() {
        return C12173c0.b.GENERIC_WEB_FRAGMENT;
    }

    @Override // com.roblox.client.C3161c, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: J0 */
    public View mo1225J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(C11338n0.f39852E, viewGroup, false);
        this.f42990u1 = new RobloxToolbar.C3171c();
        if (!this.f42985p1) {
            this.f42987r1 = (RobloxToolbar) linearLayout.findViewById(C11335m0.f39818l0);
            RobloxToolbar robloxToolbar = (RobloxToolbar) linearLayout.findViewById(C11335m0.f39820m0);
            this.f42988s1 = robloxToolbar;
            if (this.f42986q1) {
                this.f42987r1.setVisibility(8);
            } else {
                robloxToolbar.setThemeColorDelegate(new RobloxToolbar.C3174f());
                this.f42987r1.setIconDelegate(new RobloxToolbar.C3171c());
                this.f42987r1.setThemeColorDelegate(new RobloxToolbar.C3172d());
                this.f42987r1.setNavigationOnClickListener(new View.OnClickListener() { // from class: vh.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f42967a.m45165T3(view);
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) linearLayout.findViewById(C11335m0.f39809h);
            frameLayout.addView(super.mo1225J0(layoutInflater, frameLayout, bundle));
            m45171Z3(this.f42988s1.getMenu(), m4693p().getMenuInflater());
            this.f42971C1 = linearLayout;
            if (!this.f11700X0) {
                mo14996D3(false);
            }
            return linearLayout;
        }
        this.f42987r1 = (RobloxToolbar) linearLayout.findViewById(C11335m0.f39818l0);
        RobloxToolbar robloxToolbar2 = (RobloxToolbar) linearLayout.findViewById(C11335m0.f39820m0);
        this.f42988s1 = robloxToolbar2;
        robloxToolbar2.setVisibility(8);
        if (this.f42982m1) {
            this.f42987r1.setVisibility(8);
        } else {
            this.f42987r1.m15078h0(new View.OnClickListener() { // from class: vh.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f42965a.m45163R3(view);
                }
            });
            this.f42987r1.setCloseButtonGravity(8388627);
        }
        FrameLayout frameLayout2 = (FrameLayout) linearLayout.findViewById(C11335m0.f39809h);
        frameLayout2.addView(super.mo1225J0(layoutInflater, frameLayout2, bundle));
        if (this.f42982m1) {
            ImageView imageView = (ImageView) linearLayout.findViewById(C11335m0.f39772D);
            this.f42989t1 = imageView;
            imageView.setVisibility(0);
            this.f42989t1.setImageResource(this.f42990u1.mo15079a(C5654c.m25669c().m25675g()));
            this.f42989t1.setOnClickListener(new View.OnClickListener() { // from class: vh.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f42966a.m45164S3(view);
                }
            });
        }
        m45171Z3(this.f42987r1.getMenu(), m4606H1().getMenuInflater());
        this.f42971C1 = linearLayout;
        if (!this.f11700X0) {
            mo14996D3(false);
        }
        return linearLayout;
    }

    @Override // com.roblox.client.C3161c, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: M0 */
    public void mo4618M0() {
        m45161P3();
        super.mo4618M0();
    }

    /* JADX INFO: renamed from: O3 */
    public final ProgressDialog m45160O3(Context context, String str) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle((CharSequence) null);
        progressDialog.setMessage(str);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setOnCancelListener(null);
        return progressDialog;
    }

    @Override // com.roblox.client.C3161c, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: P0 */
    public void mo4627P0(boolean z10) {
        if (!z10) {
            this.f42970B1 = false;
        }
        super.mo4627P0(z10);
        if (z10) {
            return;
        }
        m45173b4();
    }

    /* JADX INFO: renamed from: P3 */
    public final void m45161P3() {
        ProgressDialog progressDialog = this.f42975G1;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f42975G1.dismiss();
    }

    /* JADX INFO: renamed from: Q3 */
    public void m45162Q3(Menu menu, MenuInflater menuInflater) {
        C12837d c12837d = new C12837d(this);
        this.f42991v1 = c12837d;
        c12837d.m47781d(menu, menuInflater);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m45163R3(View view) {
        m45168W3(C12173c0.a.CLOSE_BUTTON);
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m45164S3(View view) {
        m45168W3(C12173c0.a.CLOSE_BUTTON);
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m45165T3(View view) {
        m45168W3(C12173c0.a.BACK_BUTTON);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m45166U3(View view) {
        boolean zMo15009e3 = !this.f42969A1 ? mo15009e3() : false;
        ActivityC4831q activityC4831qM4693p = m4693p();
        if (zMo15009e3 || activityC4831qM4693p == null) {
            return;
        }
        activityC4831qM4693p.onBackPressed();
    }

    /* JADX INFO: renamed from: V3 */
    public void m45167V3(Activity activity, C10589h c10589h, C10589h.c cVar) {
        c10589h.m40610b(activity, true, cVar);
    }

    /* JADX INFO: renamed from: W3 */
    public void m45168W3(C12173c0.a aVar) {
        if (!this.f42970B1) {
            this.f42970B1 = true;
            C12173c0.m45028q(aVar);
        }
        ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p != null) {
            activityC4831qM4693p.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public void m45169X3(String str) {
        if (this.f42995z1) {
            return;
        }
        this.f42995z1 = true;
        C12173c0.m45029r(str);
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m45170Y3(String str) {
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
            C6124q.m27061f("rbx.web", "Failed to parse domain for title", e10);
        }
        if (this.f42985p1) {
            this.f42987r1.setTitle(string);
        } else {
            this.f42988s1.setTitle(string);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public void m45171Z3(Menu menu, MenuInflater menuInflater) {
        this.f42992w1 = menu;
        if (this.f42981l1) {
            if (this.f42983n1.length() > 0) {
                m45172a4(menu, menuInflater, 54);
            }
        } else {
            m45172a4(menu, menuInflater, 34);
            new C12838e(this, this.f42976g1).m47790e(menu, menuInflater);
            m45162Q3(menu, menuInflater);
        }
    }

    @Override // com.roblox.client.C3161c, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: a1 */
    public void mo4658a1() {
        super.mo4658a1();
        m45173b4();
        this.f42970B1 = false;
    }

    /* JADX INFO: renamed from: a4 */
    public void m45172a4(Menu menu, MenuInflater menuInflater, int i10) {
        String strOptString = this.f42983n1.optString("searchType", null);
        if (strOptString != null) {
            this.f42974F1 = new C12840g(this, strOptString);
        }
        if (this.f42974F1 == null) {
            this.f42974F1 = new C12842i(this);
        }
        C12839f c12839f = new C12839f(this);
        this.f42973E1 = c12839f;
        c12839f.m47806n(menu);
        this.f42973E1.m47808p(this.f42985p1 ? this.f42987r1 : this.f42988s1);
        this.f42973E1.m47807o(this.f42974F1);
        this.f42973E1.m47803k(menu, menuInflater);
        C5120h.m23897a(this.f42985p1 ? this.f42987r1 : this.f42988s1, mo4715x(), C11335m0.f39799c, i10);
    }

    /* JADX INFO: renamed from: b4 */
    public final void m45173b4() {
        C12837d c12837d = this.f42991v1;
        if (c12837d != null) {
            c12837d.m47787j();
        }
    }

    @Override // com.roblox.client.C3161c, sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: c1 */
    public void mo4663c1() {
        super.mo4663c1();
        C5840c.m26204d().m26215n(this);
    }

    /* JADX INFO: renamed from: c4 */
    public final void m45174c4(String str) {
        C12842i c12842i;
        if (this.f42973E1 == null || (c12842i = this.f42974F1) == null) {
            return;
        }
        c12842i.m47820f(str);
        this.f42973E1.m47810r();
    }

    @Override // com.roblox.client.C3161c, sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: d1 */
    public void mo4665d1() {
        if (m4710v0() && !this.f42970B1) {
            C12173c0.m45028q(C12173c0.a.PROGRAMMATIC);
        }
        C5840c.m26204d().m26217p(this);
        super.mo4665d1();
    }

    /* JADX INFO: renamed from: d4 */
    public final void m45175d4(boolean z10) {
        if (this.f42985p1) {
            if (this.f42969A1 || this.f42993x1 == z10) {
                return;
            }
            this.f42993x1 = z10;
            this.f42987r1.setNavigationOnClickListener(z10 ? new View.OnClickListener() { // from class: vh.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f42968a.m45166U3(view);
                }
            } : null);
            return;
        }
        if (this.f42993x1 != z10) {
            C6124q.m27057b("rbx.web", "updateToolbar() canGoBack:" + z10);
            this.f42993x1 = z10;
            C5120h.m23898b(this.f42988s1, (z10 || this.f42977h1) ? this.f42972D1 : null);
        }
    }

    @Override // com.roblox.client.C3161c
    /* JADX INFO: renamed from: e3 */
    public boolean mo15009e3() {
        if (this.f42970B1) {
            return false;
        }
        return super.mo15009e3();
    }

    @InterfaceC5847j(threadMode = ThreadMode.MAIN)
    public void onAppLocaleChangeEvent(C10252a c10252a) {
        ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p != null) {
            ProgressDialog progressDialogM45160O3 = m45160O3(activityC4831qM4693p, m4666e0(C11347q0.f39921K));
            this.f42975G1 = progressDialogM45160O3;
            progressDialogM45160O3.show();
            m45167V3(activityC4831qM4693p, new C10589h(), new b(activityC4831qM4693p));
        }
    }

    @InterfaceC5847j(threadMode = ThreadMode.MAIN)
    public void onUnreadNotificationCountEvent(C10260i c10260i) {
        new StringBuilder().append("GWF.onUnreadNotificationCountEvent() ");
        throw null;
    }

    @Override // com.roblox.client.C3161c
    /* JADX INFO: renamed from: t3 */
    public void mo15024t3(String str) {
        this.f42994y1 = false;
        if (this.f42980k1) {
            m45170Y3(str);
        }
        m45174c4(str);
    }

    @Override // com.roblox.client.C3161c, sg.C11368x0, dk.C4636e.b
    /* JADX INFO: renamed from: u */
    public void mo14822u(EnumC9799a enumC9799a) {
        ImageView imageView;
        if (this.f42985p1) {
            this.f42987r1.mo14822u(enumC9799a);
        } else {
            this.f42988s1.mo14822u(enumC9799a);
            this.f42987r1.mo14822u(enumC9799a);
        }
        if (this.f42982m1 && (imageView = this.f42989t1) != null) {
            imageView.setImageResource(this.f42990u1.mo15079a(enumC9799a));
        }
        ActivityC4831q activityC4831qM4693p = m4693p();
        if (activityC4831qM4693p != null) {
            Menu menu = (this.f42985p1 ? this.f42987r1 : this.f42988s1).getMenu();
            menu.clear();
            m45171Z3(menu, activityC4831qM4693p.getMenuInflater());
        }
        super.mo14822u(enumC9799a);
    }

    @Override // com.roblox.client.C3161c
    /* JADX INFO: renamed from: u3 */
    public void mo15025u3() {
        this.f42994y1 = true;
    }

    @Override // com.roblox.client.C3161c
    /* JADX INFO: renamed from: v3 */
    public void mo15026v3(String str) {
        if (this.f42994y1 || !m4716x0()) {
            return;
        }
        m45169X3(str);
    }

    @Override // com.roblox.client.C3161c
    /* JADX INFO: renamed from: x3 */
    public void mo15028x3(WebView webView, int i10) {
        super.mo15028x3(webView, i10);
        m45175d4(webView.canGoBack());
    }

    @Override // sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: z0 */
    public void mo4722z0(Bundle bundle) {
        super.mo4722z0(bundle);
        if (!this.f42980k1) {
            String str = this.f42979j1;
            if (str == null) {
                int i10 = this.f42978i1;
                if (i10 == -1) {
                    if (this.f42985p1) {
                        this.f42987r1.setTitle(C11347q0.f40022x);
                    } else {
                        this.f42988s1.setTitle(C11347q0.f40022x);
                    }
                } else if (this.f42985p1) {
                    this.f42987r1.setTitle(i10);
                } else {
                    this.f42988s1.setTitle(i10);
                }
            } else if (this.f42985p1) {
                this.f42987r1.setTitle(str);
            } else {
                this.f42988s1.setTitle(str);
            }
        }
        C5120h.m23898b(this.f42988s1, this.f42977h1 ? this.f42972D1 : null);
    }
}
