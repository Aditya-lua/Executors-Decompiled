package com.roblox.client.captcha;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.fragment.app.FragmentManager;
import com.roblox.client.AbstractActivityC3152a;
import sg.C11329k0;
import sg.C11335m0;
import sg.C11338n0;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityFunCaptcha extends AbstractActivityC3152a implements C3166a.a {
    /* JADX INFO: renamed from: i2 */
    public static Intent m15044i2(Context context, CaptchaConfig captchaConfig) {
        Intent intent = new Intent(context, (Class<?>) ActivityFunCaptcha.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("captchaConfigKey", captchaConfig);
        intent.putExtra("captchaConfigKey", bundle);
        return intent;
    }

    @Override // com.roblox.client.AbstractActivityC3160b
    /* JADX INFO: renamed from: E1 */
    public void mo14960E1() {
    }

    @Override // com.roblox.client.captcha.C3166a.a
    /* JADX INFO: renamed from: Y */
    public void mo15045Y() {
    }

    @Override // com.roblox.client.captcha.C3166a.a
    /* JADX INFO: renamed from: c0 */
    public void mo15046c0(String str, String str2) {
        m15047j2(101);
    }

    @Override // com.roblox.client.captcha.C3166a.a
    public void dismiss() {
        m15047j2(102);
    }

    /* JADX INFO: renamed from: j2 */
    public final void m15047j2(int i10) {
        setResult(i10);
        finish();
    }

    @Override // p088e.ActivityC4722p, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        m15047j2(102);
    }

    @Override // com.roblox.client.AbstractActivityC3152a, com.roblox.client.AbstractActivityC3160b, p093e4.ActivityC4831q, p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C11338n0.f39854a);
        CaptchaConfig captchaConfig = (CaptchaConfig) getIntent().getBundleExtra("captchaConfigKey").getParcelable("captchaConfigKey");
        float f10 = getResources().getDisplayMetrics().widthPixels;
        int iApplyDimension = (int) TypedValue.applyDimension(1, getResources().getDimension(C11329k0.f39730a), getResources().getDisplayMetrics());
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, 330.0f, getResources().getDisplayMetrics());
        if (f10 < iApplyDimension) {
            iApplyDimension = (int) f10;
        }
        getWindow().setLayout(iApplyDimension, iApplyDimension2);
        FragmentManager fragmentManagerM23360l1 = m23360l1();
        if (fragmentManagerM23360l1.m4444n0("FragmentFunCaptcha") == null) {
            fragmentManagerM23360l1.m4452r().m4775b(C11335m0.f39807g, C3166a.m15054K3(captchaConfig), "FragmentFunCaptcha").mo4508g();
        }
    }

    @Override // com.roblox.client.AbstractActivityC3152a, com.roblox.client.AbstractActivityC3160b, p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.roblox.client.AbstractActivityC3152a, com.roblox.client.AbstractActivityC3160b, p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
