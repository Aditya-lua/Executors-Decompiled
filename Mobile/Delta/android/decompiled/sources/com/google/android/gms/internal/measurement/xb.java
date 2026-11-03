package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public class xb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile oc f7002a;
    public volatile ha b;

    public final oc a(oc ocVar) {
        oc ocVar2 = this.f7002a;
        this.b = null;
        this.f7002a = ocVar;
        return ocVar2;
    }

    public final int b() {
        if (this.b != null) {
            return ((ga) this.b).f6531c.length;
        }
        if (this.f7002a != null) {
            return this.f7002a.a();
        }
        return 0;
    }

    public final ha c() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.f7002a == null) {
                    this.b = ha.b;
                } else {
                    this.b = this.f7002a.b();
                }
                return this.b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
