package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2477d5 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2697x5 f8948a;

    /* JADX INFO: renamed from: b */
    public volatile AbstractC2640s3 f8949b;

    /* JADX INFO: renamed from: c */
    public volatile InterfaceC2697x5 f8950c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f8951d;

    public C2477d5(InterfaceC2697x5 interfaceC2697x5) {
        if (interfaceC2697x5 == null) {
            throw new IllegalArgumentException("message cannot be null");
        }
        this.f8950c = interfaceC2697x5;
        this.f8948a = interfaceC2697x5.mo11750f();
        C2498f4 c2498f4 = C2498f4.f8968b;
        int i10 = C2486e3.f8956a;
        this.f8949b = null;
        this.f8951d = false;
    }

    /* JADX INFO: renamed from: a */
    public final int m11360a(int i10) {
        int iM11173v = AbstractC2443a4.m11173v(8);
        return iM11173v + iM11173v + AbstractC2443a4.m11173v(16) + AbstractC2443a4.m11173v(i10) + m11361b(3);
    }

    /* JADX INFO: renamed from: b */
    public final int m11361b(int i10) {
        return AbstractC2443a4.m11173v(24) + m11362c();
    }

    /* JADX INFO: renamed from: c */
    public final int m11362c() {
        int iM11363d = m11363d();
        return AbstractC2443a4.m11173v(iM11363d) + iM11363d;
    }

    /* JADX INFO: renamed from: d */
    public final int m11363d() {
        return this.f8949b != null ? this.f8949b.mo11587d() : this.f8950c.zzn();
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC2640s3 m11364e() {
        if (this.f8949b != null) {
            return this.f8949b;
        }
        synchronized (this) {
            try {
                if (this.f8949b != null) {
                    return this.f8949b;
                }
                this.f8949b = this.f8950c.mo11333e();
                return this.f8949b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean equals(Object obj) {
        return m11365f().equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC2697x5 m11365f() {
        try {
            return this.f8950c;
        } catch (C2499f5 unused) {
            C2498f4.m11401b();
            return this.f8948a;
        }
    }

    public final int hashCode() {
        return m11365f().hashCode();
    }

    public final String toString() {
        return m11365f().toString();
    }
}
