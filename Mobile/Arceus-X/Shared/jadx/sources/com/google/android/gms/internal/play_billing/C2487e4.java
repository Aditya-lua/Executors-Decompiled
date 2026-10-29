package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2487e4 {

    /* JADX INFO: renamed from: a */
    public final Object f8957a;

    /* JADX INFO: renamed from: b */
    public final int f8958b;

    public C2487e4(Object obj, int i10) {
        this.f8957a = obj;
        this.f8958b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2487e4)) {
            return false;
        }
        C2487e4 c2487e4 = (C2487e4) obj;
        return this.f8957a == c2487e4.f8957a && this.f8958b == c2487e4.f8958b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f8957a) * 65535) + this.f8958b;
    }
}
