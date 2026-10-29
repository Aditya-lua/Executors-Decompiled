package com.roblox.client.ads;

import androidx.annotation.Keep;
import kotlin.Metadata;
import p229jt.C7347n;
import p229jt.C7348o;
import tg.C11642a;
import th.C11659h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007¨\u0006\u0002"}, m31665d2 = {"isInstalled", "", "NativeShell_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class GmaSdkAvailability {
    @Keep
    public static final boolean isInstalled() {
        Object objM30460b;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(Class.forName(C11659h.m43403a().mo43556W() ? "com.roblox.client.gmasdk.GmaSdkControllerImpl" : "com.roblox.client.gmasdk.LegacyGmaSdkController", false, C11642a.class.getClassLoader()));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        return C7347n.m30466h(objM30460b);
    }
}
