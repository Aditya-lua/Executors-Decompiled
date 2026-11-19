package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class va {
    public static volatile va b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final va f6879c = new va(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f6880a;

    public va() {
        this.f6880a = new HashMap();
    }

    public static va a() {
        va vaVar = b;
        if (vaVar != null) {
            return vaVar;
        }
        synchronized (va.class) {
            try {
                va vaVar2 = b;
                if (vaVar2 != null) {
                    return vaVar2;
                }
                ad adVar = ad.f6375c;
                va vaVarB = db.b(va.class);
                b = vaVarB;
                return vaVarB;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final jb b(sc scVar, int i10) {
        return (jb) this.f6880a.get(new ua(scVar, i10));
    }

    public va(boolean z10) {
        this.f6880a = Collections.EMPTY_MAP;
    }
}
