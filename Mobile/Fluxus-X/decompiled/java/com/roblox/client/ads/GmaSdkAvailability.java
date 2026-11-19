package com.roblox.client.ads;

import androidx.annotation.Keep;
import bi.h;
import ch.a;
import com.github.luben.zstd.BuildConfig;
import p001kotlin.Metadata;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007¨\u0006\u0002"}, d2 = {"isInstalled", BuildConfig.FLAVOR, "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class GmaSdkAvailability {
    @Keep
    public static final boolean isInstalled() {
        Object objB;
        try {
            n.Companion companion = n.INSTANCE;
            objB = n.b(Class.forName(h.a().X() ? "com.roblox.client.gmasdk.GmaSdkControllerImpl" : "com.roblox.client.gmasdk.LegacyGmaSdkController", false, a.class.getClassLoader()));
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        return n.h(objB);
    }
}
