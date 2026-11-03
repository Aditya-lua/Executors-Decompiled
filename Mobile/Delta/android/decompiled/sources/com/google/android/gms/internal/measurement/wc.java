package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class wc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wc f6943c = new wc();
    public final ConcurrentMap b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ad f6944a = new fc();

    public static wc a() {
        return f6943c;
    }

    public final zc b(Class cls) {
        qb.a(cls, "messageType");
        ConcurrentMap concurrentMap = this.b;
        zc zcVarA = (zc) concurrentMap.get(cls);
        if (zcVarA == null) {
            zcVarA = this.f6944a.a(cls);
            qb.a(cls, "messageType");
            zc zcVar = (zc) concurrentMap.putIfAbsent(cls, zcVarA);
            if (zcVar != null) {
                return zcVar;
            }
        }
        return zcVarA;
    }
}
