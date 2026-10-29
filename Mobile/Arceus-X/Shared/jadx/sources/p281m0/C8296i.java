package p281m0;

import p140g0.C5891h1;

/* JADX INFO: renamed from: m0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C8296i extends InterfaceC8277b1.a {

    /* JADX INFO: renamed from: a */
    public final int f30629a;

    /* JADX INFO: renamed from: b */
    public final C5891h1 f30630b;

    public C8296i(int i10, C5891h1 c5891h1) {
        this.f30629a = i10;
        if (c5891h1 == null) {
            throw new NullPointerException("Null imageCaptureException");
        }
        this.f30630b = c5891h1;
    }

    @Override // p281m0.InterfaceC8277b1.a
    /* JADX INFO: renamed from: a */
    public C5891h1 mo33691a() {
        return this.f30630b;
    }

    @Override // p281m0.InterfaceC8277b1.a
    /* JADX INFO: renamed from: b */
    public int mo33692b() {
        return this.f30629a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC8277b1.a) {
            InterfaceC8277b1.a aVar = (InterfaceC8277b1.a) obj;
            if (this.f30629a == aVar.mo33692b() && this.f30630b.equals(aVar.mo33691a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f30629a ^ 1000003) * 1000003) ^ this.f30630b.hashCode();
    }

    public String toString() {
        return "CaptureError{requestId=" + this.f30629a + ", imageCaptureException=" + this.f30630b + "}";
    }
}
