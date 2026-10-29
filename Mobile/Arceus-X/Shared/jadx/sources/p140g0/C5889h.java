package p140g0;

import android.graphics.Rect;
import android.util.Size;
import p296n0.InterfaceC8804p0;

/* JADX INFO: renamed from: g0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5889h extends InterfaceC5900j2.a {

    /* JADX INFO: renamed from: a */
    public final Size f22513a;

    /* JADX INFO: renamed from: b */
    public final Rect f22514b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8804p0 f22515c;

    /* JADX INFO: renamed from: d */
    public final int f22516d;

    /* JADX INFO: renamed from: e */
    public final boolean f22517e;

    public C5889h(Size size, Rect rect, InterfaceC8804p0 interfaceC8804p0, int i10, boolean z10) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f22513a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.f22514b = rect;
        this.f22515c = interfaceC8804p0;
        this.f22516d = i10;
        this.f22517e = z10;
    }

    @Override // p140g0.InterfaceC5900j2.a
    /* JADX INFO: renamed from: a */
    public InterfaceC8804p0 mo26481a() {
        return this.f22515c;
    }

    @Override // p140g0.InterfaceC5900j2.a
    /* JADX INFO: renamed from: b */
    public Rect mo26482b() {
        return this.f22514b;
    }

    @Override // p140g0.InterfaceC5900j2.a
    /* JADX INFO: renamed from: c */
    public Size mo26483c() {
        return this.f22513a;
    }

    @Override // p140g0.InterfaceC5900j2.a
    /* JADX INFO: renamed from: d */
    public boolean mo26484d() {
        return this.f22517e;
    }

    @Override // p140g0.InterfaceC5900j2.a
    /* JADX INFO: renamed from: e */
    public int mo26485e() {
        return this.f22516d;
    }

    public boolean equals(Object obj) {
        InterfaceC8804p0 interfaceC8804p0;
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC5900j2.a) {
            InterfaceC5900j2.a aVar = (InterfaceC5900j2.a) obj;
            if (this.f22513a.equals(aVar.mo26483c()) && this.f22514b.equals(aVar.mo26482b()) && ((interfaceC8804p0 = this.f22515c) != null ? interfaceC8804p0.equals(aVar.mo26481a()) : aVar.mo26481a() == null) && this.f22516d == aVar.mo26485e() && this.f22517e == aVar.mo26484d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f22513a.hashCode() ^ 1000003) * 1000003) ^ this.f22514b.hashCode()) * 1000003;
        InterfaceC8804p0 interfaceC8804p0 = this.f22515c;
        return ((((iHashCode ^ (interfaceC8804p0 == null ? 0 : interfaceC8804p0.hashCode())) * 1000003) ^ this.f22516d) * 1000003) ^ (this.f22517e ? 1231 : 1237);
    }

    public String toString() {
        return "CameraInputInfo{inputSize=" + this.f22513a + ", inputCropRect=" + this.f22514b + ", cameraInternal=" + this.f22515c + ", rotationDegrees=" + this.f22516d + ", mirroring=" + this.f22517e + "}";
    }
}
