package com.roblox.client.fcm;

import android.content.Context;
import android.os.Build;
import gk.p;
import jj.s;
import k2.n;
import mj.h0;

/* JADX INFO: loaded from: classes2.dex */
public class a implements s {
    @Override // jj.s
    public h0 a() {
        return h0.FIREBASE_CLOUD_MESSAGING;
    }

    @Override // jj.s
    public String b() {
        return "GcmPlatform";
    }

    @Override // jj.s
    public String c() {
        return "GcmToken";
    }

    @Override // jj.s
    public void d(Context context, boolean z10) {
        f(context, z10, e(context));
    }

    public boolean e(Context context) {
        return gk.s.b(context);
    }

    public void f(Context context, boolean z10, boolean z11) {
        if (!z11 || Build.VERSION.SDK_INT < 33 || n.e(context).a()) {
            FCMRegistrationWorker.INSTANCE.b(context, z10);
        } else {
            p.h("rbx.push", "New token but notifications disabled. Not registering.");
        }
    }
}
