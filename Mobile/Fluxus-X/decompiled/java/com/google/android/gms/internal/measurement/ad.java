package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class ad {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ad f6375c = new ad();
    public final ConcurrentMap b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ed f6376a = new jc();

    public static ad a() {
        return f6375c;
    }

    public final dd b(Class cls) {
        ub.a(cls, "messageType");
        ConcurrentMap concurrentMap = this.b;
        dd ddVarA = (dd) concurrentMap.get(cls);
        if (ddVarA == null) {
            ddVarA = this.f6376a.a(cls);
            ub.a(cls, "messageType");
            dd ddVar = (dd) concurrentMap.putIfAbsent(cls, ddVarA);
            if (ddVar != null) {
                return ddVar;
            }
        }
        return ddVarA;
    }
}
