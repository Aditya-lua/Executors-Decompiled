package com.roblox.client.captcha;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import bh.k0;
import bh.m0;
import bh.n0;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityFunCaptcha extends com.roblox.client.a implements a.InterfaceC0141a {
    public static Intent i2(Context context, lh.a aVar) {
        Intent intent = new Intent(context, (Class<?>) ActivityFunCaptcha.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("captchaConfigKey", aVar);
        intent.putExtra("captchaConfigKey", bundle);
        return intent;
    }

    @Override // com.roblox.client.b
    public void E1() {
    }

    @Override // com.roblox.client.captcha.a.InterfaceC0141a
    public void X() {
    }

    @Override // com.roblox.client.captcha.a.InterfaceC0141a
    public void b0(String str, String str2) {
        j2(MlKitException.NOT_ENOUGH_SPACE);
    }

    @Override // com.roblox.client.captcha.a.InterfaceC0141a
    public void dismiss() {
        j2(MlKitException.MODEL_HASH_MISMATCH);
    }

    public final void j2(int i10) {
        setResult(i10);
        finish();
    }

    @Override // e.p, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        j2(MlKitException.MODEL_HASH_MISMATCH);
    }

    @Override // com.roblox.client.a, com.roblox.client.b, f4.v, e.p, k2.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(n0.f4183a);
        lh.a aVar = (lh.a) getIntent().getBundleExtra("captchaConfigKey").getParcelable("captchaConfigKey");
        float f10 = getResources().getDisplayMetrics().widthPixels;
        int iApplyDimension = (int) TypedValue.applyDimension(1, getResources().getDimension(k0.f4095a), getResources().getDisplayMetrics());
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, 330.0f, getResources().getDisplayMetrics());
        if (f10 < iApplyDimension) {
            iApplyDimension = (int) f10;
        }
        getWindow().setLayout(iApplyDimension, iApplyDimension2);
        f4.k0 k0VarL1 = l1();
        if (k0VarL1.n0("FragmentFunCaptcha") == null) {
            k0VarL1.r().b(m0.f4140g, a.K3(aVar), "FragmentFunCaptcha").g();
        }
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, f4.v, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, f4.v, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
