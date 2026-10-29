package com.roblox.client.captcha;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.fragment.app.FragmentManager;
import sg.k0;
import sg.m0;
import sg.n0;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityFunCaptcha extends com.roblox.client.a implements a.InterfaceC0135a {
    public static Intent i2(Context context, CaptchaConfig captchaConfig) {
        Intent intent = new Intent(context, (Class<?>) ActivityFunCaptcha.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("captchaConfigKey", captchaConfig);
        intent.putExtra("captchaConfigKey", bundle);
        return intent;
    }

    @Override // com.roblox.client.b
    public void E1() {
    }

    @Override // com.roblox.client.captcha.a.InterfaceC0135a
    public void Y() {
    }

    @Override // com.roblox.client.captcha.a.InterfaceC0135a
    public void c0(String str, String str2) {
        j2(101);
    }

    @Override // com.roblox.client.captcha.a.InterfaceC0135a
    public void dismiss() {
        j2(102);
    }

    public final void j2(int i10) {
        setResult(i10);
        finish();
    }

    @Override // e.p, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        j2(102);
    }

    @Override // com.roblox.client.a, com.roblox.client.b, e4.q, e.p, k2.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(n0.f30876a);
        CaptchaConfig captchaConfig = (CaptchaConfig) getIntent().getBundleExtra("captchaConfigKey").getParcelable("captchaConfigKey");
        float f10 = getResources().getDisplayMetrics().widthPixels;
        int iApplyDimension = (int) TypedValue.applyDimension(1, getResources().getDimension(k0.f30791a), getResources().getDisplayMetrics());
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, 330.0f, getResources().getDisplayMetrics());
        if (f10 < iApplyDimension) {
            iApplyDimension = (int) f10;
        }
        getWindow().setLayout(iApplyDimension, iApplyDimension2);
        FragmentManager fragmentManagerL1 = l1();
        if (fragmentManagerL1.n0("FragmentFunCaptcha") == null) {
            fragmentManagerL1.r().b(m0.f30836g, a.K3(captchaConfig), "FragmentFunCaptcha").g();
        }
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
