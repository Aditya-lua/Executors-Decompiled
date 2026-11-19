package com.roblox.client.implementation;

import android.content.Context;
import androidx.annotation.NonNull;
import bn.k;
import bn.t;
import dj.d;
import fk.a;
import ih.b;
import ih.c;
import wm.f;

/* JADX INFO: loaded from: classes2.dex */
public class AppImplementations implements a, ij.a, si.a, b {
    @Override // fk.a
    public d getAppsFlyerManager() {
        return com.roblox.client.appsflyer.a.O();
    }

    @Override // si.a
    @NonNull
    public f getIdentityProtocol() {
        return f.z();
    }

    @Override // ij.a
    @NonNull
    public k getPermissionsProtocol() {
        return t.U();
    }

    @Override // ih.b
    @NonNull
    public ih.a getRtcAudioManager(Context context) {
        return new c(context);
    }
}
