package com.roblox.client.fcm;

import android.content.Context;
import android.os.Build;
import p151gk.C6124q;
import p151gk.C6127t;
import p222jj.InterfaceC7194s;
import p235k2.C7422n;
import p294mj.EnumC8545h0;

/* JADX INFO: renamed from: com.roblox.client.fcm.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3184a implements InterfaceC7194s {
    @Override // p222jj.InterfaceC7194s
    /* JADX INFO: renamed from: a */
    public EnumC8545h0 mo15112a() {
        return EnumC8545h0.FIREBASE_CLOUD_MESSAGING;
    }

    @Override // p222jj.InterfaceC7194s
    /* JADX INFO: renamed from: b */
    public String mo15113b() {
        return "GcmPlatform";
    }

    @Override // p222jj.InterfaceC7194s
    /* JADX INFO: renamed from: c */
    public String mo15114c() {
        return "GcmToken";
    }

    @Override // p222jj.InterfaceC7194s
    /* JADX INFO: renamed from: d */
    public void mo15115d(Context context, boolean z10) {
        m15117f(context, z10, m15116e(context));
    }

    /* JADX INFO: renamed from: e */
    public boolean m15116e(Context context) {
        return C6127t.m27086b(context);
    }

    /* JADX INFO: renamed from: f */
    public void m15117f(Context context, boolean z10, boolean z11) {
        if (!z11 || Build.VERSION.SDK_INT < 33 || C7422n.m30883e(context).m30886a()) {
            FCMRegistrationWorker.INSTANCE.m15111b(context, z10);
        } else {
            C6124q.m27063h("rbx.push", "New token but notifications disabled. Not registering.");
        }
    }
}
