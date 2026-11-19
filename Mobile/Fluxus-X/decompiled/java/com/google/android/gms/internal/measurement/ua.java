package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6868a;
    public final int b;

    public ua(Object obj, int i10) {
        this.f6868a = obj;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ua)) {
            return false;
        }
        ua uaVar = (ua) obj;
        return this.f6868a == uaVar.f6868a && this.b == uaVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f6868a) * 65535) + this.b;
    }
}
