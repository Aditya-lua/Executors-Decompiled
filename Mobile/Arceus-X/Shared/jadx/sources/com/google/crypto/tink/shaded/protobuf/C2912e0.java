package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.e0 */
/* JADX INFO: loaded from: classes2.dex */
public class C2912e0 {

    /* JADX INFO: renamed from: a */
    public AbstractC2920h f10842a;

    /* JADX INFO: renamed from: b */
    public C2944p f10843b;

    /* JADX INFO: renamed from: c */
    public volatile InterfaceC2954s0 f10844c;

    /* JADX INFO: renamed from: d */
    public volatile AbstractC2920h f10845d;

    /* JADX INFO: renamed from: a */
    public void m13470a(InterfaceC2954s0 interfaceC2954s0) {
        if (this.f10844c != null) {
            return;
        }
        synchronized (this) {
            if (this.f10844c != null) {
                return;
            }
            try {
                if (this.f10842a != null) {
                    this.f10844c = interfaceC2954s0.mo14177h().mo13392b(this.f10842a, this.f10843b);
                    this.f10845d = this.f10842a;
                } else {
                    this.f10844c = interfaceC2954s0;
                    this.f10845d = AbstractC2920h.f10853b;
                }
            } catch (C2903b0 unused) {
                this.f10844c = interfaceC2954s0;
                this.f10845d = AbstractC2920h.f10853b;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m13471b() {
        if (this.f10845d != null) {
            return this.f10845d.size();
        }
        AbstractC2920h abstractC2920h = this.f10842a;
        if (abstractC2920h != null) {
            return abstractC2920h.size();
        }
        if (this.f10844c != null) {
            return this.f10844c.mo14176c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC2954s0 m13472c(InterfaceC2954s0 interfaceC2954s0) {
        m13470a(interfaceC2954s0);
        return this.f10844c;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC2954s0 m13473d(InterfaceC2954s0 interfaceC2954s0) {
        InterfaceC2954s0 interfaceC2954s1 = this.f10844c;
        this.f10842a = null;
        this.f10845d = null;
        this.f10844c = interfaceC2954s0;
        return interfaceC2954s1;
    }

    /* JADX INFO: renamed from: e */
    public AbstractC2920h m13474e() {
        if (this.f10845d != null) {
            return this.f10845d;
        }
        AbstractC2920h abstractC2920h = this.f10842a;
        if (abstractC2920h != null) {
            return abstractC2920h;
        }
        synchronized (this) {
            try {
                if (this.f10845d != null) {
                    return this.f10845d;
                }
                if (this.f10844c == null) {
                    this.f10845d = AbstractC2920h.f10853b;
                } else {
                    this.f10845d = this.f10844c.mo13369b();
                }
                return this.f10845d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
