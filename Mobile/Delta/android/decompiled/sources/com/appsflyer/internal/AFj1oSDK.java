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
            gt.n.Companion companion = gt.n.INSTANCE;
            Field declaredField = u7.a.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.d(obj, "");
            objB = gt.n.b((String) obj);
        } catch (Throwable th2) {
            gt.n.Companion companion2 = gt.n.INSTANCE;
            objB = gt.n.b(gt.o.a(th2));
        }
        return (String) (gt.n.g(objB) ? "" : objB);
    }
}
