package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public class bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile sc f6435a;
    public volatile la b;

    public final sc a(sc scVar) {
        sc scVar2 = this.f6435a;
        this.b = null;
        this.f6435a = scVar;
        return scVar2;
    }

    public final int b() {
        if (this.b != null) {
            return ((ka) this.b).f6575c.length;
        }
        if (this.f6435a != null) {
            return this.f6435a.a();
        }
        return 0;
    }

    public final la c() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b != null) {
                    return this.b;
                }
                if (this.f6435a == null) {
                    this.b = la.b;
                } else {
                    this.b = this.f6435a.b();
                }
                return this.b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
