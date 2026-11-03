package com.roblox.client.implementation;

import android.content.Context;
import androidx.annotation.NonNull;
import gm.f;
import mm.k;
import mm.r;
import ti.d;
import vj.a;
import yg.b;
import yg.c;

/* JADX INFO: loaded from: classes2.dex */
public class AppImplementations implements a, yi.a, ii.a, b {
    @Override // vj.a
    public d getAppsFlyerManager() {
        return com.roblox.client.appsflyer.a.I();
    }

    @Override // ii.a
    @NonNull
    public f getIdentityProtocol() {
        return f.z();
    }

    @Override // yi.a
    @NonNull
    public k getPermissionsProtocol() {
        return r.f0();
    }

    @Override // yg.b
    @NonNull
    public yg.a getRtcAudioManager(Context context) {
        return new c(context);
    }
}
