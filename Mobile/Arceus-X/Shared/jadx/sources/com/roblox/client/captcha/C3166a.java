package com.roblox.client.captcha;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p138fv.C5840c;
import p138fv.InterfaceC5847j;
import p151gk.C6124q;
import ph.C10258g;
import sg.C11356t0;
import sg.C11371y0;

/* JADX INFO: renamed from: com.roblox.client.captcha.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3166a extends C11371y0 {

    /* JADX INFO: renamed from: h1 */
    public a f11728h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f11729i1;

    /* JADX INFO: renamed from: j1 */
    public boolean f11730j1;

    /* JADX INFO: renamed from: k1 */
    public CaptchaConfig f11731k1;

    /* JADX INFO: renamed from: com.roblox.client.captcha.a$a */
    public interface a {
        /* JADX INFO: renamed from: Y */
        void mo15045Y();

        /* JADX INFO: renamed from: c0 */
        void mo15046c0(String str, String str2);

        void dismiss();
    }

    /* JADX INFO: renamed from: K3 */
    public static C3166a m15054K3(CaptchaConfig captchaConfig) {
        C3166a c3166a = new C3166a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("captchaConfig", captchaConfig);
        c3166a.m4625O1(bundle);
        return c3166a;
    }

    @Override // sg.C11371y0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: C0 */
    public void mo4590C0(Context context) {
        super.mo4590C0(context);
        C6124q.m27057b("FragmentFunCaptcha", "onAttach.");
        if (m4693p() instanceof a) {
            this.f11728h1 = (a) m4693p();
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // sg.C11371y0, com.roblox.client.C3161c, sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: F0 */
    public void mo4599F0(Bundle bundle) {
        super.mo4599F0(bundle);
        C6124q.m27057b("FragmentFunCaptcha", "onCreate.");
        if (m4704t() != null) {
            this.f11731k1 = (CaptchaConfig) m4704t().getParcelable("captchaConfig");
        }
    }

    @Override // sg.C11371y0, com.roblox.client.C3161c, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: J0 */
    public View mo1225J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.mo1225J0(layoutInflater, viewGroup, bundle);
    }

    /* JADX INFO: renamed from: L3 */
    public final void m15055L3() {
        if (m4677j0() == null) {
            return;
        }
        this.f11728h1.mo15045Y();
        mo14996D3(true);
    }

    @Override // sg.C11371y0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: N0 */
    public void mo4621N0() {
        super.mo4621N0();
        C6124q.m27057b("FragmentFunCaptcha", "onDetach.");
        if (!this.f11730j1) {
            this.f11728h1.dismiss();
            C11356t0.m42534d("captcha", "close");
        }
        this.f11728h1 = null;
    }

    @Override // sg.C11371y0, com.roblox.client.C3161c, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: V0 */
    public void mo4643V0() {
        super.mo4643V0();
        C6124q.m27057b("FragmentFunCaptcha", "onPause.");
        C5840c.m26204d().m26217p(this);
        mo14996D3(false);
    }

    @Override // sg.C11371y0, com.roblox.client.C3161c, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: a1 */
    public void mo4658a1() {
        super.mo4658a1();
        C6124q.m27057b("FragmentFunCaptcha", "onResume.");
        C5840c.m26204d().m26215n(this);
        if (this.f11729i1) {
            m15055L3();
        }
    }

    @Override // sg.C11371y0, com.roblox.client.C3161c, sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: c1 */
    public void mo4663c1() {
        super.mo4663c1();
        C11356t0.m42552v("captcha");
    }

    @InterfaceC5847j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(C10258g c10258g) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        C6124q.m27057b("FragmentFunCaptcha", "NavigateToFeature: " + c10258g.f36866a);
        if ("CAPTCHA_SUCCESS_TAG".equals(c10258g.f36866a)) {
            this.f11730j1 = true;
            JSONObject jSONObjectM39412e = c10258g.m39412e();
            String str = null;
            if (jSONObjectM39412e == null || (jSONObjectOptJSONObject = jSONObjectM39412e.optJSONObject("captchaData")) == null) {
                strOptString = null;
            } else {
                String strOptString2 = jSONObjectOptJSONObject.optString("captchaToken", null);
                strOptString = jSONObjectOptJSONObject.optString("captchaProvider", null);
                str = strOptString2;
            }
            this.f11728h1.mo15046c0(str, strOptString);
            return;
        }
        if ("CAPTCHA_SHOWN_TAG".equals(c10258g.f36866a)) {
            C6124q.m27063h("FragmentFunCaptcha", "isCaptchaShown: " + this.f11729i1);
            if (this.f11729i1) {
                return;
            }
            this.f11729i1 = true;
            m15055L3();
        }
    }

    @Override // sg.C11371y0, sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: z0 */
    public void mo4722z0(Bundle bundle) {
        super.mo4722z0(bundle);
        C6124q.m27057b("FragmentFunCaptcha", "onActivityCreated.");
        this.f11687K0 = this.f11731k1.getUrl();
        C6124q.m27057b("FragmentFunCaptcha", "Load captcha url: " + this.f11687K0);
        m15021q3(this.f11687K0);
    }
}
