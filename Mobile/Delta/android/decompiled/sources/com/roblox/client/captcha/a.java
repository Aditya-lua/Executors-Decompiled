package com.roblox.client.captcha;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import dv.c;
import dv.j;
import ek.q;
import oh.g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import rg.t0;
import rg.y0;

/* JADX INFO: loaded from: classes2.dex */
public class a extends y0 {

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public InterfaceC0138a f9056h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public boolean f9057i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f9058j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public CaptchaConfig f9059k1;

    /* JADX INFO: renamed from: com.roblox.client.captcha.a$a, reason: collision with other inner class name */
    public interface InterfaceC0138a {
        void X();

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

    @Override // rg.y0, e4.k, androidx.fragment.app.c
    public void C0(Context context) {
        super.C0(context);
        q.b("FragmentFunCaptcha", "onAttach.");
        if (p() instanceof InterfaceC0138a) {
            this.f9056h1 = (InterfaceC0138a) p();
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // rg.y0, com.roblox.client.c, rg.x0, e4.k, androidx.fragment.app.c
    public void F0(Bundle bundle) {
        super.F0(bundle);
        q.b("FragmentFunCaptcha", "onCreate.");
        if (t() != null) {
            this.f9059k1 = (CaptchaConfig) t().getParcelable("captchaConfig");
        }
    }

    @Override // rg.y0, com.roblox.client.c, androidx.fragment.app.c
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.J0(layoutInflater, viewGroup, bundle);
    }

    public final void L3() {
        if (j0() == null) {
            return;
        }
        this.f9056h1.X();
        D3(true);
    }

    @Override // rg.y0, e4.k, androidx.fragment.app.c
    public void N0() {
        super.N0();
        q.b("FragmentFunCaptcha", "onDetach.");
        if (!this.f9058j1) {
            this.f9056h1.dismiss();
            t0.d("captcha", "close");
        }
        this.f9056h1 = null;
    }

    @Override // rg.y0, com.roblox.client.c, androidx.fragment.app.c
    public void V0() {
        super.V0();
        q.b("FragmentFunCaptcha", "onPause.");
        c.d().p(this);
        D3(false);
    }

    @Override // rg.y0, com.roblox.client.c, androidx.fragment.app.c
    public void a1() {
        super.a1();
        q.b("FragmentFunCaptcha", "onResume.");
        c.d().n(this);
        if (this.f9057i1) {
            L3();
        }
    }

    @Override // rg.y0, com.roblox.client.c, rg.x0, e4.k, androidx.fragment.app.c
    public void c1() {
        super.c1();
        t0.v("captcha");
    }

    @j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(g gVar) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        q.b("FragmentFunCaptcha", "NavigateToFeature: " + gVar.f27892a);
        if ("CAPTCHA_SUCCESS_TAG".equals(gVar.f27892a)) {
            this.f9058j1 = true;
            JSONObject jSONObjectE = gVar.e();
            String str = null;
            if (jSONObjectE == null || (jSONObjectOptJSONObject = jSONObjectE.optJSONObject("captchaData")) == null) {
                strOptString = null;
            } else {
                String strOptString2 = jSONObjectOptJSONObject.optString("captchaToken", null);
                strOptString = jSONObjectOptJSONObject.optString("captchaProvider", null);
                str = strOptString2;
            }
            this.f9056h1.c0(str, strOptString);
            return;
        }
        if ("CAPTCHA_SHOWN_TAG".equals(gVar.f27892a)) {
            q.h("FragmentFunCaptcha", "isCaptchaShown: " + this.f9057i1);
            if (this.f9057i1) {
                return;
            }
            this.f9057i1 = true;
            L3();
        }
    }

    @Override // rg.y0, rg.x0, e4.k, androidx.fragment.app.c
    public void z0(Bundle bundle) {
        super.z0(bundle);
        q.b("FragmentFunCaptcha", "onActivityCreated.");
        this.K0 = this.f9059k1.getUrl();
        q.b("FragmentFunCaptcha", "Load captcha url: " + this.K0);
        q3(this.K0);
    }
}
