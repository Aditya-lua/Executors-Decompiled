package com.appsflyer.internal;

import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1oSDK implements AFj1tSDK {
    @Override // com.appsflyer.internal.AFj1tSDK
    @NotNull
    public final String registerClient() {
        Object objB;
        Object obj = BuildConfig.FLAVOR;
        try {
            zt.n.Companion companion = zt.n.INSTANCE;
            Field declaredField = v7.a.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(null);
            Intrinsics.d(obj2, "");
            objB = zt.n.b((String) obj2);
        } catch (Throwable th2) {
            zt.n.Companion companion2 = zt.n.INSTANCE;
            objB = zt.n.b(zt.o.a(th2));
        }
        if (!zt.n.g(objB)) {
            obj = objB;
        }
        return (String) obj;
    }
}
