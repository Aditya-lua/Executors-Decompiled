package p281m0;

import android.util.Size;
import java.util.List;
import p140g0.InterfaceC5911m1;
import p531x0.C12615u;

/* JADX INFO: renamed from: m0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8275b extends C8330x.c {

    /* JADX INFO: renamed from: f */
    public final Size f30582f;

    /* JADX INFO: renamed from: g */
    public final int f30583g;

    /* JADX INFO: renamed from: h */
    public final List<Integer> f30584h;

    /* JADX INFO: renamed from: i */
    public final boolean f30585i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC5911m1 f30586j;

    /* JADX INFO: renamed from: k */
    public final AbstractC8303k0 f30587k;

    /* JADX INFO: renamed from: l */
    public final C12615u<C8327v0> f30588l;

    /* JADX INFO: renamed from: m */
    public final C12615u<InterfaceC8277b1.a> f30589m;

    public C8275b(Size size, int i10, List<Integer> list, boolean z10, InterfaceC5911m1 interfaceC5911m1, AbstractC8303k0 abstractC8303k0, C12615u<C8327v0> c12615u, C12615u<InterfaceC8277b1.a> c12615u2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f30582f = size;
        this.f30583g = i10;
        if (list == null) {
            throw new NullPointerException("Null outputFormats");
        }
        this.f30584h = list;
        this.f30585i = z10;
        this.f30586j = interfaceC5911m1;
        this.f30587k = abstractC8303k0;
        if (c12615u == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f30588l = c12615u;
        if (c12615u2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.f30589m = c12615u2;
    }

    @Override // p281m0.C8330x.c
    /* JADX INFO: renamed from: b */
    public C12615u<InterfaceC8277b1.a> mo33671b() {
        return this.f30589m;
    }

    @Override // p281m0.C8330x.c
    /* JADX INFO: renamed from: c */
    public InterfaceC5911m1 mo33672c() {
        return this.f30586j;
    }

    @Override // p281m0.C8330x.c
    /* JADX INFO: renamed from: d */
    public int mo33673d() {
        return this.f30583g;
    }

    @Override // p281m0.C8330x.c
    /* JADX INFO: renamed from: e */
    public List<Integer> mo33674e() {
        return this.f30584h;
    }

    public boolean equals(Object obj) {
        InterfaceC5911m1 interfaceC5911m1;
        AbstractC8303k0 abstractC8303k0;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8330x.c) {
            C8330x.c cVar = (C8330x.c) obj;
            if (this.f30582f.equals(cVar.mo33677k()) && this.f30583g == cVar.mo33673d() && this.f30584h.equals(cVar.mo33674e()) && this.f30585i == cVar.mo33678m() && ((interfaceC5911m1 = this.f30586j) != null ? interfaceC5911m1.equals(cVar.mo33672c()) : cVar.mo33672c() == null) && ((abstractC8303k0 = this.f30587k) != null ? abstractC8303k0.equals(cVar.mo33675f()) : cVar.mo33675f() == null) && this.f30588l.equals(cVar.mo33676h()) && this.f30589m.equals(cVar.mo33671b())) {
                return true;
            }
        }
        return false;
    }

    @Override // p281m0.C8330x.c
    /* JADX INFO: renamed from: f */
    public AbstractC8303k0 mo33675f() {
        return this.f30587k;
    }

    @Override // p281m0.C8330x.c
    /* JADX INFO: renamed from: h */
    public C12615u<C8327v0> mo33676h() {
        return this.f30588l;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f30582f.hashCode() ^ 1000003) * 1000003) ^ this.f30583g) * 1000003) ^ this.f30584h.hashCode()) * 1000003) ^ (this.f30585i ? 1231 : 1237)) * 1000003;
        InterfaceC5911m1 interfaceC5911m1 = this.f30586j;
        int iHashCode2 = (iHashCode ^ (interfaceC5911m1 == null ? 0 : interfaceC5911m1.hashCode())) * 1000003;
        AbstractC8303k0 abstractC8303k0 = this.f30587k;
        return ((((iHashCode2 ^ (abstractC8303k0 != null ? abstractC8303k0.hashCode() : 0)) * 1000003) ^ this.f30588l.hashCode()) * 1000003) ^ this.f30589m.hashCode();
    }

    @Override // p281m0.C8330x.c
    /* JADX INFO: renamed from: k */
    public Size mo33677k() {
        return this.f30582f;
    }

    @Override // p281m0.C8330x.c
    /* JADX INFO: renamed from: m */
    public boolean mo33678m() {
        return this.f30585i;
    }

    public String toString() {
        return "In{size=" + this.f30582f + ", inputFormat=" + this.f30583g + ", outputFormats=" + this.f30584h + ", virtualCamera=" + this.f30585i + ", imageReaderProxyProvider=" + this.f30586j + ", postviewSettings=" + this.f30587k + ", requestEdge=" + this.f30588l + ", errorEdge=" + this.f30589m + "}";
    }
}
