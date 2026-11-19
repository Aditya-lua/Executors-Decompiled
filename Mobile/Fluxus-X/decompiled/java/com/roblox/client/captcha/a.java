package com.roblox.client.captcha;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bh.t0;
import bh.y0;
import mw.c;
import mw.j;
import ok.q;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import yh.g;

/* JADX INFO: loaded from: classes2.dex */
public class a extends y0 {

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public InterfaceC0141a f8873h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public boolean f8874i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f8875j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public lh.a f8876k1;

    /* JADX INFO: renamed from: com.roblox.client.captcha.a$a, reason: collision with other inner class name */
    public interface InterfaceC0141a {
        void X();

        void b0(String str, String str2);

        void dismiss();
    }

    public static a K3(lh.a aVar) {
        a aVar2 = new a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("captchaConfig", aVar);
        aVar2.O1(bundle);
        return aVar2;
    }

    @Override // bh.y0, f4.o, f4.q
    public void C0(Context context) {
        super.C0(context);
        q.b("FragmentFunCaptcha", "onAttach.");
        if (p() instanceof InterfaceC0141a) {
            this.f8873h1 = (InterfaceC0141a) p();
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // bh.y0, com.roblox.client.c, bh.x0, f4.o, f4.q
    public void F0(Bundle bundle) {
        super.F0(bundle);
        q.b("FragmentFunCaptcha", "onCreate.");
        if (t() != null) {
            this.f8876k1 = (lh.a) t().getParcelable("captchaConfig");
        }
    }

    @Override // bh.y0, com.roblox.client.c, f4.q
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.J0(layoutInflater, viewGroup, bundle);
    }

    public final void L3() {
        if (j0() == null) {
            return;
        }
        this.f8873h1.X();
        D3(true);
    }

    @Override // bh.y0, f4.o, f4.q
    public void N0() {
        super.N0();
        q.b("FragmentFunCaptcha", "onDetach.");
        if (!this.f8875j1) {
            this.f8873h1.dismiss();
            t0.d("captcha", "close");
        }
        this.f8873h1 = null;
    }

    @Override // bh.y0, com.roblox.client.c, f4.q
    public void V0() {
        super.V0();
        q.b("FragmentFunCaptcha", "onPause.");
        c.d().p(this);
        D3(false);
    }

    @Override // bh.y0, com.roblox.client.c, f4.q
    public void a1() {
        super.a1();
        q.b("FragmentFunCaptcha", "onResume.");
        c.d().n(this);
        if (this.f8874i1) {
            L3();
        }
    }

    @Override // bh.y0, com.roblox.client.c, bh.x0, f4.o, f4.q
    public void c1() {
        super.c1();
        t0.v("captcha");
    }

    @j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(g gVar) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        q.b("FragmentFunCaptcha", "NavigateToFeature: " + gVar.f37866a);
        if ("CAPTCHA_SUCCESS_TAG".equals(gVar.f37866a)) {
            this.f8875j1 = true;
            JSONObject jSONObjectE = gVar.e();
            String str = null;
            if (jSONObjectE == null || (jSONObjectOptJSONObject = jSONObjectE.optJSONObject("captchaData")) == null) {
                strOptString = null;
            } else {
                String strOptString2 = jSONObjectOptJSONObject.optString("captchaToken", null);
                strOptString = jSONObjectOptJSONObject.optString("captchaProvider", null);
                str = strOptString2;
            }
            this.f8873h1.b0(str, strOptString);
            return;
        }
        if ("CAPTCHA_SHOWN_TAG".equals(gVar.f37866a)) {
            q.h("FragmentFunCaptcha", "isCaptchaShown: " + this.f8874i1);
            if (this.f8874i1) {
                return;
            }
            this.f8874i1 = true;
            L3();
        }
    }

    @Override // bh.y0, bh.x0, f4.o, f4.q
    public void z0(Bundle bundle) {
        super.z0(bundle);
        q.b("FragmentFunCaptcha", "onActivityCreated.");
        this.K0 = this.f8876k1.getUrl();
        q.b("FragmentFunCaptcha", "Load captcha url: " + this.K0);
        q3(this.K0);
    }
}
