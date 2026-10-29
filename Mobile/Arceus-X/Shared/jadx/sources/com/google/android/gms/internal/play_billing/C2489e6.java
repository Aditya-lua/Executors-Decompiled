package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2489e6 {

    /* JADX INFO: renamed from: c */
    public static final C2489e6 f8959c = new C2489e6();

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap f8961b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final C2598o5 f8960a = new C2598o5();

    /* JADX INFO: renamed from: a */
    public static C2489e6 m11377a() {
        return f8959c;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC2522h6 m11378b(Class cls) {
        Object obj = this.f8961b.get(cls);
        return obj == null ? m11379c(cls) : (InterfaceC2522h6) obj;
    }

    /* JADX INFO: renamed from: c */
    public final <T> InterfaceC2522h6<T> m11379c(Class<T> cls) {
        ConcurrentMap concurrentMap = this.f8961b;
        InterfaceC2522h6<T> interfaceC2522h6M11634a = this.f8960a.m11634a(cls);
        InterfaceC2522h6<T> interfaceC2522h6 = (InterfaceC2522h6) concurrentMap.putIfAbsent(cls, interfaceC2522h6M11634a);
        return interfaceC2522h6 != null ? interfaceC2522h6 : interfaceC2522h6M11634a;
    }
}
