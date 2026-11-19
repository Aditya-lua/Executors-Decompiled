package com.roblox.client.fcm;

import android.content.Context;
import android.os.Build;
import k2.n;
import ok.q;
import ok.t;
import rj.s;
import uj.h0;

/* JADX INFO: loaded from: classes2.dex */
public class a implements s {
    @Override // rj.s
    public h0 a() {
        return h0.FIREBASE_CLOUD_MESSAGING;
    }

    @Override // rj.s
    public String b() {
        return "GcmPlatform";
    }

    @Override // rj.s
    public String c() {
        return "GcmToken";
    }

    @Override // rj.s
    public void d(Context context, boolean z10) {
        f(context, z10, e(context));
    }

    public boolean e(Context context) {
        return t.b(context);
    }

    public void f(Context context, boolean z10, boolean z11) {
        if (!z11 || Build.VERSION.SDK_INT < 33 || n.g(context).a()) {
            FCMRegistrationWorker.INSTANCE.b(context, z10);
        } else {
            q.h("rbx.push", "New token but notifications disabled. Not registering.");
        }
    }
}
