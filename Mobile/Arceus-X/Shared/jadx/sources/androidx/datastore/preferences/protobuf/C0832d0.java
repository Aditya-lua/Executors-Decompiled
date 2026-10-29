package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d0 */
/* JADX INFO: loaded from: classes.dex */
public class C0832d0 {

    /* JADX INFO: renamed from: a */
    public AbstractC0840g f2843a;

    /* JADX INFO: renamed from: b */
    public C0864o f2844b;

    /* JADX INFO: renamed from: c */
    public volatile InterfaceC0874r0 f2845c;

    /* JADX INFO: renamed from: d */
    public volatile AbstractC0840g f2846d;

    /* JADX INFO: renamed from: a */
    public void m3371a(InterfaceC0874r0 interfaceC0874r0) {
        if (this.f2845c != null) {
            return;
        }
        synchronized (this) {
            if (this.f2845c != null) {
                return;
            }
            try {
                if (this.f2843a != null) {
                    this.f2845c = interfaceC0874r0.mo4028h().mo3352a(this.f2843a, this.f2844b);
                    this.f2846d = this.f2843a;
                } else {
                    this.f2845c = interfaceC0874r0;
                    this.f2846d = AbstractC0840g.f2854b;
                }
            } catch (C0823a0 unused) {
                this.f2845c = interfaceC0874r0;
                this.f2846d = AbstractC0840g.f2854b;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m3372b() {
        if (this.f2846d != null) {
            return this.f2846d.size();
        }
        AbstractC0840g abstractC0840g = this.f2843a;
        if (abstractC0840g != null) {
            return abstractC0840g.size();
        }
        if (this.f2845c != null) {
            return this.f2845c.mo4026c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC0874r0 m3373c(InterfaceC0874r0 interfaceC0874r0) {
        m3371a(interfaceC0874r0);
        return this.f2845c;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC0874r0 m3374d(InterfaceC0874r0 interfaceC0874r0) {
        InterfaceC0874r0 interfaceC0874r1 = this.f2845c;
        this.f2843a = null;
        this.f2846d = null;
        this.f2845c = interfaceC0874r0;
        return interfaceC0874r1;
    }

    /* JADX INFO: renamed from: e */
    public AbstractC0840g m3375e() {
        if (this.f2846d != null) {
            return this.f2846d;
        }
        AbstractC0840g abstractC0840g = this.f2843a;
        if (abstractC0840g != null) {
            return abstractC0840g;
        }
        synchronized (this) {
            try {
                if (this.f2846d != null) {
                    return this.f2846d;
                }
                if (this.f2845c == null) {
                    this.f2846d = AbstractC0840g.f2854b;
                } else {
                    this.f2846d = this.f2845c.mo3326b();
                }
                return this.f2846d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
