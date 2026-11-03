package com.roblox.client.fcm;

import android.content.Context;
import android.os.Build;
import ek.q;
import ek.t;
import hj.s;
import k2.n;
import kj.h0;

/* JADX INFO: loaded from: classes2.dex */
public class a implements s {
    @Override // hj.s
    public h0 a() {
        return h0.FIREBASE_CLOUD_MESSAGING;
    }

    @Override // hj.s
    public String b() {
        return "GcmPlatform";
    }

    @Override // hj.s
    public String c() {
        return "GcmToken";
    }

    @Override // hj.s
    public void d(Context context, boolean z10) {
        f(context, z10, e(context));
    }

    public boolean e(Context context) {
        return t.b(context);
    }

    public void f(Context context, boolean z10, boolean z11) {
        if (!z11 || Build.VERSION.SDK_INT < 33 || n.f(context).a()) {
            FCMRegistrationWorker.INSTANCE.b(context, z10);
        } else {
            q.h("rbx.push", "New token but notifications disabled. Not registering.");
        }
    }
}
