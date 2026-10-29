package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.qa */
/* JADX INFO: loaded from: classes.dex */
public final class C2266qa {

    /* JADX INFO: renamed from: a */
    public final Object f8593a;

    /* JADX INFO: renamed from: b */
    public final int f8594b;

    public C2266qa(Object obj, int i10) {
        this.f8593a = obj;
        this.f8594b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2266qa)) {
            return false;
        }
        C2266qa c2266qa = (C2266qa) obj;
        return this.f8593a == c2266qa.f8593a && this.f8594b == c2266qa.f8594b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f8593a) * 65535) + this.f8594b;
    }
}
