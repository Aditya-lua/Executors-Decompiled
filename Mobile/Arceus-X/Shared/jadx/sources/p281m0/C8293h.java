package p281m0;

import androidx.camera.core.InterfaceC0494d;

/* JADX INFO: renamed from: m0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C8293h extends C8325u0.b {

    /* JADX INFO: renamed from: a */
    public final C8327v0 f30625a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0494d f30626b;

    public C8293h(C8327v0 c8327v0, InterfaceC0494d interfaceC0494d) {
        if (c8327v0 == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f30625a = c8327v0;
        if (interfaceC0494d == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.f30626b = interfaceC0494d;
    }

    @Override // p281m0.C8325u0.b
    /* JADX INFO: renamed from: a */
    public InterfaceC0494d mo33732a() {
        return this.f30626b;
    }

    @Override // p281m0.C8325u0.b
    /* JADX INFO: renamed from: b */
    public C8327v0 mo33733b() {
        return this.f30625a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8325u0.b) {
            C8325u0.b bVar = (C8325u0.b) obj;
            if (this.f30625a.equals(bVar.mo33733b()) && this.f30626b.equals(bVar.mo33732a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f30625a.hashCode() ^ 1000003) * 1000003) ^ this.f30626b.hashCode();
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f30625a + ", imageProxy=" + this.f30626b + "}";
    }
}
