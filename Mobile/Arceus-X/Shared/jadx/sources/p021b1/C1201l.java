package p021b1;

import p296n0.C8857z3;
import p296n0.EnumC8719a0;
import p296n0.EnumC8725b0;
import p296n0.EnumC8731c0;
import p296n0.EnumC8737d0;
import p296n0.EnumC8843x;
import p296n0.EnumC8848y;
import p296n0.EnumC8853z;
import p296n0.InterfaceC8743e0;

/* JADX INFO: renamed from: b1.l */
/* JADX INFO: loaded from: classes.dex */
public class C1201l implements InterfaceC8743e0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8743e0 f5001a;

    /* JADX INFO: renamed from: b */
    public final C8857z3 f5002b;

    /* JADX INFO: renamed from: c */
    public final long f5003c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1201l(C8857z3 c8857z3, InterfaceC8743e0 interfaceC8743e0) {
        this(interfaceC8743e0, c8857z3, -1L);
    }

    @Override // p296n0.InterfaceC8743e0
    /* JADX INFO: renamed from: b */
    public EnumC8737d0 mo6734b() {
        InterfaceC8743e0 interfaceC8743e0 = this.f5001a;
        return interfaceC8743e0 != null ? interfaceC8743e0.mo6734b() : EnumC8737d0.UNKNOWN;
    }

    @Override // p296n0.InterfaceC8743e0
    /* JADX INFO: renamed from: c */
    public C8857z3 mo6735c() {
        return this.f5002b;
    }

    @Override // p296n0.InterfaceC8743e0
    /* JADX INFO: renamed from: d */
    public EnumC8725b0 mo6736d() {
        InterfaceC8743e0 interfaceC8743e0 = this.f5001a;
        return interfaceC8743e0 != null ? interfaceC8743e0.mo6736d() : EnumC8725b0.UNKNOWN;
    }

    @Override // p296n0.InterfaceC8743e0
    /* JADX INFO: renamed from: f */
    public EnumC8843x mo6737f() {
        InterfaceC8743e0 interfaceC8743e0 = this.f5001a;
        return interfaceC8743e0 != null ? interfaceC8743e0.mo6737f() : EnumC8843x.UNKNOWN;
    }

    @Override // p296n0.InterfaceC8743e0
    /* JADX INFO: renamed from: g */
    public EnumC8719a0 mo6738g() {
        InterfaceC8743e0 interfaceC8743e0 = this.f5001a;
        return interfaceC8743e0 != null ? interfaceC8743e0.mo6738g() : EnumC8719a0.UNKNOWN;
    }

    @Override // p296n0.InterfaceC8743e0
    public long getTimestamp() {
        InterfaceC8743e0 interfaceC8743e0 = this.f5001a;
        if (interfaceC8743e0 != null) {
            return interfaceC8743e0.getTimestamp();
        }
        long j10 = this.f5003c;
        if (j10 != -1) {
            return j10;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // p296n0.InterfaceC8743e0
    /* JADX INFO: renamed from: h */
    public EnumC8731c0 mo6739h() {
        InterfaceC8743e0 interfaceC8743e0 = this.f5001a;
        return interfaceC8743e0 != null ? interfaceC8743e0.mo6739h() : EnumC8731c0.UNKNOWN;
    }

    @Override // p296n0.InterfaceC8743e0
    /* JADX INFO: renamed from: i */
    public EnumC8853z mo6740i() {
        InterfaceC8743e0 interfaceC8743e0 = this.f5001a;
        return interfaceC8743e0 != null ? interfaceC8743e0.mo6740i() : EnumC8853z.UNKNOWN;
    }

    @Override // p296n0.InterfaceC8743e0
    /* JADX INFO: renamed from: j */
    public EnumC8848y mo6741j() {
        InterfaceC8743e0 interfaceC8743e0 = this.f5001a;
        return interfaceC8743e0 != null ? interfaceC8743e0.mo6741j() : EnumC8848y.UNKNOWN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1201l(C8857z3 c8857z3, long j10) {
        this(null, c8857z3, j10);
    }

    public C1201l(InterfaceC8743e0 interfaceC8743e0, C8857z3 c8857z3, long j10) {
        this.f5001a = interfaceC8743e0;
        this.f5002b = c8857z3;
        this.f5003c = j10;
    }
}
