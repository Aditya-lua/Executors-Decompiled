package com.appsflyer.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1oSDK implements AFj1tSDK {
    @Override // com.appsflyer.internal.AFj1tSDK
    @NotNull
    public final String registerClient() {
        Object objB;
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            Field declaredField = u7.a.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.d(obj, "");
            objB = jt.n.b((String) obj);
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objB = jt.n.b(jt.o.a(th2));
        }
        return (String) (jt.n.g(objB) ? "" : objB);
    }
}
