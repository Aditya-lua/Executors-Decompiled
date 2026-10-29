package p140g0;

/* JADX INFO: renamed from: g0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5893i extends InterfaceC5900j2.b {

    /* JADX INFO: renamed from: a */
    public final int f22525a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5900j2 f22526b;

    public C5893i(int i10, InterfaceC5900j2 interfaceC5900j2) {
        this.f22525a = i10;
        if (interfaceC5900j2 == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.f22526b = interfaceC5900j2;
    }

    @Override // p140g0.InterfaceC5900j2.b
    /* JADX INFO: renamed from: a */
    public int mo26489a() {
        return this.f22525a;
    }

    @Override // p140g0.InterfaceC5900j2.b
    /* JADX INFO: renamed from: b */
    public InterfaceC5900j2 mo26490b() {
        return this.f22526b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC5900j2.b) {
            InterfaceC5900j2.b bVar = (InterfaceC5900j2.b) obj;
            if (this.f22525a == bVar.mo26489a() && this.f22526b.equals(bVar.mo26490b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f22525a ^ 1000003) * 1000003) ^ this.f22526b.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.f22525a + ", surfaceOutput=" + this.f22526b + "}";
    }
}
