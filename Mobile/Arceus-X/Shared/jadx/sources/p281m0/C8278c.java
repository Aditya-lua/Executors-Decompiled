package p281m0;

import androidx.camera.core.InterfaceC0494d;
import p140g0.C5883f1;

/* JADX INFO: renamed from: m0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8278c extends C8332y.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0494d f30591a;

    /* JADX INFO: renamed from: b */
    public final int f30592b;

    /* JADX INFO: renamed from: c */
    public final C5883f1.h f30593c;

    public C8278c(InterfaceC0494d interfaceC0494d, int i10, C5883f1.h hVar) {
        if (interfaceC0494d == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.f30591a = interfaceC0494d;
        this.f30592b = i10;
        if (hVar == null) {
            throw new NullPointerException("Null outputFileOptions");
        }
        this.f30593c = hVar;
    }

    @Override // p281m0.C8332y.a
    /* JADX INFO: renamed from: a */
    public InterfaceC0494d mo33694a() {
        return this.f30591a;
    }

    @Override // p281m0.C8332y.a
    /* JADX INFO: renamed from: b */
    public C5883f1.h mo33695b() {
        return this.f30593c;
    }

    @Override // p281m0.C8332y.a
    /* JADX INFO: renamed from: c */
    public int mo33696c() {
        return this.f30592b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8332y.a) {
            C8332y.a aVar = (C8332y.a) obj;
            if (this.f30591a.equals(aVar.mo33694a()) && this.f30592b == aVar.mo33696c() && this.f30593c.equals(aVar.mo33695b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f30591a.hashCode() ^ 1000003) * 1000003) ^ this.f30592b) * 1000003) ^ this.f30593c.hashCode();
    }

    public String toString() {
        return "In{imageProxy=" + this.f30591a + ", rotationDegrees=" + this.f30592b + ", outputFileOptions=" + this.f30593c + "}";
    }
}
