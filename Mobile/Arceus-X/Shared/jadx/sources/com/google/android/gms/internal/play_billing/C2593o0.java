package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2593o0 {

    /* JADX INFO: renamed from: a */
    public final Object f9171a;

    /* JADX INFO: renamed from: b */
    public final Object f9172b;

    /* JADX INFO: renamed from: c */
    public final Object f9173c;

    public C2593o0(Object obj, Object obj2, Object obj3) {
        this.f9171a = obj;
        this.f9172b = obj2;
        this.f9173c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m11631a() {
        Object obj = this.f9173c;
        Object obj2 = this.f9172b;
        Object obj3 = this.f9171a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
