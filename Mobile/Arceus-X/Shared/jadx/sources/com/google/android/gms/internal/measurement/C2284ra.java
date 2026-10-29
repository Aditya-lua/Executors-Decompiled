package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ra */
/* JADX INFO: loaded from: classes.dex */
public final class C2284ra {

    /* JADX INFO: renamed from: b */
    public static volatile C2284ra f8610b;

    /* JADX INFO: renamed from: c */
    public static final C2284ra f8611c = new C2284ra(true);

    /* JADX INFO: renamed from: a */
    public final Map f8612a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2284ra() {
        this.f8612a = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static C2284ra m10629a() {
        C2284ra c2284ra = f8610b;
        if (c2284ra != null) {
            return c2284ra;
        }
        synchronized (C2284ra.class) {
            try {
                C2284ra c2284ra2 = f8610b;
                if (c2284ra2 != null) {
                    return c2284ra2;
                }
                C2376wc c2376wc = C2376wc.f8740c;
                C2284ra c2284raM11157b = AbstractC2428za.m11157b(C2284ra.class);
                f8610b = c2284raM11157b;
                return c2284raM11157b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C2067fb m10630b(InterfaceC2232oc interfaceC2232oc, int i10) {
        return (C2067fb) this.f8612a.get(new C2266qa(interfaceC2232oc, i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2284ra(boolean z10) {
        this.f8612a = Collections.EMPTY_MAP;
    }
}
