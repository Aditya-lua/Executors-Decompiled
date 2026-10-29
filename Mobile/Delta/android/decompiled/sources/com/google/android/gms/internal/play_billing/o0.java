package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7192a;
    public final Object b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7193c;

    public o0(Object obj, Object obj2, Object obj3) {
        this.f7192a = obj;
        this.b = obj2;
        this.f7193c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f7193c;
        Object obj2 = this.b;
        Object obj3 = this.f7192a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
