package p021b1;

import java.util.UUID;
import p296n0.C8739d2;
import p296n0.InterfaceC8799o0;
import p347p0.C10085a0;

/* JADX INFO: renamed from: b1.q */
/* JADX INFO: loaded from: classes.dex */
public class C1206q extends C8739d2 {

    /* JADX INFO: renamed from: b */
    public final String f5009b;

    /* JADX INFO: renamed from: c */
    public int f5010c;

    public C1206q(InterfaceC8799o0 interfaceC8799o0) {
        super(interfaceC8799o0);
        this.f5009b = "virtual-" + interfaceC8799o0.mo6750e() + "-" + UUID.randomUUID().toString();
    }

    /* JADX INFO: renamed from: B */
    public void m6748B(int i10) {
        this.f5010c = i10;
    }

    @Override // p296n0.C8739d2, p140g0.InterfaceC5937t
    /* JADX INFO: renamed from: d */
    public int mo6749d() {
        return mo6751w(0);
    }

    @Override // p296n0.C8739d2, p296n0.InterfaceC8799o0
    /* JADX INFO: renamed from: e */
    public String mo6750e() {
        return this.f5009b;
    }

    @Override // p296n0.C8739d2, p140g0.InterfaceC5937t
    /* JADX INFO: renamed from: w */
    public int mo6751w(int i10) {
        return C10085a0.m38895w(super.mo6751w(i10) - this.f5010c);
    }
}
