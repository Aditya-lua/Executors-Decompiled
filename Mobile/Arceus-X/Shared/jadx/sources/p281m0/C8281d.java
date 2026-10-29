package p281m0;

import androidx.camera.core.InterfaceC0494d;
import p531x0.AbstractC12578b0;

/* JADX INFO: renamed from: m0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8281d extends C8276b0.a {

    /* JADX INFO: renamed from: a */
    public final AbstractC12578b0<InterfaceC0494d> f30595a;

    /* JADX INFO: renamed from: b */
    public final int f30596b;

    public C8281d(AbstractC12578b0<InterfaceC0494d> abstractC12578b0, int i10) {
        if (abstractC12578b0 == null) {
            throw new NullPointerException("Null packet");
        }
        this.f30595a = abstractC12578b0;
        this.f30596b = i10;
    }

    @Override // p281m0.C8276b0.a
    /* JADX INFO: renamed from: a */
    public int mo33684a() {
        return this.f30596b;
    }

    @Override // p281m0.C8276b0.a
    /* JADX INFO: renamed from: b */
    public AbstractC12578b0<InterfaceC0494d> mo33685b() {
        return this.f30595a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8276b0.a) {
            C8276b0.a aVar = (C8276b0.a) obj;
            if (this.f30595a.equals(aVar.mo33685b()) && this.f30596b == aVar.mo33684a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f30595a.hashCode() ^ 1000003) * 1000003) ^ this.f30596b;
    }

    public String toString() {
        return "In{packet=" + this.f30595a + ", jpegQuality=" + this.f30596b + "}";
    }
}
