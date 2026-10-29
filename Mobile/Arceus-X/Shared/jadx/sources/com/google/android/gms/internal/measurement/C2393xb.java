package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.xb */
/* JADX INFO: loaded from: classes.dex */
public class C2393xb {

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC2232oc f8830a;

    /* JADX INFO: renamed from: b */
    public volatile AbstractC2104ha f8831b;

    /* JADX INFO: renamed from: a */
    public final InterfaceC2232oc m10979a(InterfaceC2232oc interfaceC2232oc) {
        InterfaceC2232oc interfaceC2232oc2 = this.f8830a;
        this.f8831b = null;
        this.f8830a = interfaceC2232oc;
        return interfaceC2232oc2;
    }

    /* JADX INFO: renamed from: b */
    public final int m10980b() {
        if (this.f8831b != null) {
            return ((C2085ga) this.f8831b).f8202c.length;
        }
        if (this.f8830a != null) {
            return this.f8830a.mo10063a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC2104ha m10981c() {
        if (this.f8831b != null) {
            return this.f8831b;
        }
        synchronized (this) {
            try {
                if (this.f8831b != null) {
                    return this.f8831b;
                }
                if (this.f8830a == null) {
                    this.f8831b = AbstractC2104ha.f8218b;
                } else {
                    this.f8831b = this.f8830a.mo10514b();
                }
                return this.f8831b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
