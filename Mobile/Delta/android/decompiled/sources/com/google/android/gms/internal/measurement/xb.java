package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public class xb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile oc f6928a;
    public volatile ha b;

    public final oc a(oc ocVar) {
        oc ocVar2 = this.f6928a;
        this.b = null;
        this.f6928a = ocVar;
        return ocVar2;
    }

    public final int b() {
        if (this.b != null) {
            return ((ga) this.b).f6458c.length;
        }
        if (this.f6928a != null) {
            return this.f6928a.a();
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
                if (this.f6928a == null) {
                    this.b = ha.b;
                } else {
                    this.b = this.f6928a.b();
                }
                return this.b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
