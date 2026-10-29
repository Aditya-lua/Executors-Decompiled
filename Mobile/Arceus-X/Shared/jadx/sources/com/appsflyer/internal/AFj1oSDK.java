package com.appsflyer.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7347n;
import p229jt.C7348o;
import p461u7.C11809a;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1oSDK implements AFj1tSDK {
    @Override // com.appsflyer.internal.AFj1tSDK
    @NotNull
    public final String registerClient() {
        Object objM30460b;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            Field declaredField = C11809a.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.m31981d(obj, "");
            objM30460b = C7347n.m30460b((String) obj);
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        return (String) (C7347n.m30465g(objM30460b) ? "" : objM30460b);
    }
}
