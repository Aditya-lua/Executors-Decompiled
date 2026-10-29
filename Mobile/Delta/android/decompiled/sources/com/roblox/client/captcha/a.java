package com.roblox.client.captcha;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fv.c;
import fv.j;
import gk.p;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import ph.g;
import sg.t0;
import sg.y0;

/* JADX INFO: loaded from: classes2.dex */
public class a extends y0 {

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public InterfaceC0135a f8982h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public boolean f8983i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f8984j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public CaptchaConfig f8985k1;

    /* JADX INFO: renamed from: com.roblox.client.captcha.a$a, reason: collision with other inner class name */
    public interface InterfaceC0135a {
        void Y();

        void c0(String str, String str2);

        void dismiss();
    }

    public static a K3(CaptchaConfig captchaConfig) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("captchaConfig", captchaConfig);
        aVar.O1(bundle);
        return aVar;
    }

    @Override // sg.y0, e4.k, androidx.fragment.app.c
    public void C0(Context context) {
        super.C0(context);
        p.b("FragmentFunCaptcha", "onAttach.");
        if (p() instanceof InterfaceC0135a) {
            this.f8982h1 = (InterfaceC0135a) p();
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // sg.y0, com.roblox.client.c, sg.x0, e4.k, androidx.fragment.app.c
    public void F0(Bundle bundle) {
        super.F0(bundle);
        p.b("FragmentFunCaptcha", "onCreate.");
        if (t() != null) {
            this.f8985k1 = (CaptchaConfig) t().getParcelable("captchaConfig");
        }
    }

    @Override // sg.y0, com.roblox.client.c, androidx.fragment.app.c
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.J0(layoutInflater, viewGroup, bundle);
    }

    public final void L3() {
        if (j0() == null) {
            return;
        }
        this.f8982h1.Y();
        D3(true);
    }

    @Override // sg.y0, e4.k, androidx.fragment.app.c
    public void N0() {
        super.N0();
        p.b("FragmentFunCaptcha", "onDetach.");
        if (!this.f8984j1) {
            this.f8982h1.dismiss();
            t0.d("captcha", "close");
        }
        this.f8982h1 = null;
    }

    @Override // sg.y0, com.roblox.client.c, androidx.fragment.app.c
    public void V0() {
        super.V0();
        p.b("FragmentFunCaptcha", "onPause.");
        c.d().p(this);
        D3(false);
    }

    @Override // sg.y0, com.roblox.client.c, androidx.fragment.app.c
    public void a1() {
        super.a1();
        p.b("FragmentFunCaptcha", "onResume.");
        c.d().n(this);
        if (this.f8983i1) {
            L3();
        }
    }

    @Override // sg.y0, com.roblox.client.c, sg.x0, e4.k, androidx.fragment.app.c
    public void c1() {
        super.c1();
        t0.v("captcha");
    }

    @j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(g gVar) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        p.b("FragmentFunCaptcha", "NavigateToFeature: " + gVar.f28613a);
        if ("CAPTCHA_SUCCESS_TAG".equals(gVar.f28613a)) {
            this.f8984j1 = true;
            JSONObject jSONObjectE = gVar.e();
            String str = null;
            if (jSONObjectE == null || (jSONObjectOptJSONObject = jSONObjectE.optJSONObject("captchaData")) == null) {
                strOptString = null;
            } else {
                String strOptString2 = jSONObjectOptJSONObject.optString("captchaToken", null);
                strOptString = jSONObjectOptJSONObject.optString("captchaProvider", null);
                str = strOptString2;
            }
            this.f8982h1.c0(str, strOptString);
            return;
        }
        if ("CAPTCHA_SHOWN_TAG".equals(gVar.f28613a)) {
            p.h("FragmentFunCaptcha", "isCaptchaShown: " + this.f8983i1);
            if (this.f8983i1) {
                return;
            }
            this.f8983i1 = true;
            L3();
        }
    }

    @Override // sg.y0, sg.x0, e4.k, androidx.fragment.app.c
    public void z0(Bundle bundle) {
        super.z0(bundle);
        p.b("FragmentFunCaptcha", "onActivityCreated.");
        this.K0 = this.f8985k1.getUrl();
        p.b("FragmentFunCaptcha", "Load captcha url: " + this.K0);
        q3(this.K0);
    }
}
