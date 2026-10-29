package com.roblox.client.implementation;

import android.content.Context;
import androidx.annotation.NonNull;
import im.f;
import om.k;
import om.s;
import vi.d;
import xj.a;
import zg.b;
import zg.c;

/* JADX INFO: loaded from: classes2.dex */
public class AppImplementations implements a, aj.a, ki.a, b {
    @Override // xj.a
    public d getAppsFlyerManager() {
        return com.roblox.client.appsflyer.a.I();
    }

    @Override // ki.a
    @NonNull
    public f getIdentityProtocol() {
        return f.z();
    }

    @Override // aj.a
    @NonNull
    public k getPermissionsProtocol() {
        return s.f0();
    }

    @Override // zg.b
    @NonNull
    public zg.a getRtcAudioManager(Context context) {
        return new c(context);
    }
}
