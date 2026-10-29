package com.roblox.client.implementation;

import android.content.Context;
import androidx.annotation.NonNull;
import com.roblox.client.appsflyer.C3159a;
import im.C6826f;
import ki.InterfaceC7620a;
import om.AbstractC9810k;
import om.C9818s;
import p014aj.InterfaceC0263a;
import p549xj.InterfaceC12843a;
import p604zg.C13812c;
import p604zg.InterfaceC13810a;
import p604zg.InterfaceC13811b;
import vi.C12213d;

/* JADX INFO: loaded from: classes2.dex */
public class AppImplementations implements InterfaceC12843a, InterfaceC0263a, InterfaceC7620a, InterfaceC13811b {
    @Override // p549xj.InterfaceC12843a
    public C12213d getAppsFlyerManager() {
        return C3159a.m14879I();
    }

    @Override // ki.InterfaceC7620a
    @NonNull
    public C6826f getIdentityProtocol() {
        return C6826f.m29205z();
    }

    @Override // p014aj.InterfaceC0263a
    @NonNull
    public AbstractC9810k getPermissionsProtocol() {
        return C9818s.m38680f0();
    }

    @Override // p604zg.InterfaceC13811b
    @NonNull
    public InterfaceC13810a getRtcAudioManager(Context context) {
        return new C13812c(context);
    }
}
