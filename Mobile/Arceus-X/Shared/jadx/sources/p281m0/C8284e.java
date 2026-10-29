package p281m0;

import p140g0.C5883f1;
import p531x0.AbstractC12578b0;

/* JADX INFO: renamed from: m0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8284e extends C8288f0.a {

    /* JADX INFO: renamed from: a */
    public final AbstractC12578b0<byte[]> f30606a;

    /* JADX INFO: renamed from: b */
    public final C5883f1.h f30607b;

    public C8284e(AbstractC12578b0<byte[]> abstractC12578b0, C5883f1.h hVar) {
        if (abstractC12578b0 == null) {
            throw new NullPointerException("Null packet");
        }
        this.f30606a = abstractC12578b0;
        if (hVar == null) {
            throw new NullPointerException("Null outputFileOptions");
        }
        this.f30607b = hVar;
    }

    @Override // p281m0.C8288f0.a
    /* JADX INFO: renamed from: a */
    public C5883f1.h mo33710a() {
        return this.f30607b;
    }

    @Override // p281m0.C8288f0.a
    /* JADX INFO: renamed from: b */
    public AbstractC12578b0<byte[]> mo33711b() {
        return this.f30606a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8288f0.a) {
            C8288f0.a aVar = (C8288f0.a) obj;
            if (this.f30606a.equals(aVar.mo33711b()) && this.f30607b.equals(aVar.mo33710a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f30606a.hashCode() ^ 1000003) * 1000003) ^ this.f30607b.hashCode();
    }

    public String toString() {
        return "In{packet=" + this.f30606a + ", outputFileOptions=" + this.f30607b + "}";
    }
}
