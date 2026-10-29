package p531x0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import p296n0.InterfaceC8743e0;
import p347p0.C10091g;

/* JADX INFO: renamed from: x0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C12577b<T> extends AbstractC12578b0<T> {

    /* JADX INFO: renamed from: a */
    public final T f44800a;

    /* JADX INFO: renamed from: b */
    public final C10091g f44801b;

    /* JADX INFO: renamed from: c */
    public final int f44802c;

    /* JADX INFO: renamed from: d */
    public final Size f44803d;

    /* JADX INFO: renamed from: e */
    public final Rect f44804e;

    /* JADX INFO: renamed from: f */
    public final int f44805f;

    /* JADX INFO: renamed from: g */
    public final Matrix f44806g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC8743e0 f44807h;

    public C12577b(T t8, C10091g c10091g, int i10, Size size, Rect rect, int i11, Matrix matrix, InterfaceC8743e0 interfaceC8743e0) {
        if (t8 == null) {
            throw new NullPointerException("Null data");
        }
        this.f44800a = t8;
        this.f44801b = c10091g;
        this.f44802c = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f44803d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f44804e = rect;
        this.f44805f = i11;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f44806g = matrix;
        if (interfaceC8743e0 == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f44807h = interfaceC8743e0;
    }

    @Override // p531x0.AbstractC12578b0
    /* JADX INFO: renamed from: a */
    public InterfaceC8743e0 mo46927a() {
        return this.f44807h;
    }

    @Override // p531x0.AbstractC12578b0
    /* JADX INFO: renamed from: b */
    public Rect mo46928b() {
        return this.f44804e;
    }

    @Override // p531x0.AbstractC12578b0
    /* JADX INFO: renamed from: c */
    public T mo46929c() {
        return this.f44800a;
    }

    @Override // p531x0.AbstractC12578b0
    /* JADX INFO: renamed from: d */
    public C10091g mo46930d() {
        return this.f44801b;
    }

    @Override // p531x0.AbstractC12578b0
    /* JADX INFO: renamed from: e */
    public int mo46931e() {
        return this.f44802c;
    }

    public boolean equals(Object obj) {
        C10091g c10091g;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC12578b0) {
            AbstractC12578b0 abstractC12578b0 = (AbstractC12578b0) obj;
            if (this.f44800a.equals(abstractC12578b0.mo46929c()) && ((c10091g = this.f44801b) != null ? c10091g.equals(abstractC12578b0.mo46930d()) : abstractC12578b0.mo46930d() == null) && this.f44802c == abstractC12578b0.mo46931e() && this.f44803d.equals(abstractC12578b0.mo46934h()) && this.f44804e.equals(abstractC12578b0.mo46928b()) && this.f44805f == abstractC12578b0.mo46932f() && this.f44806g.equals(abstractC12578b0.mo46933g()) && this.f44807h.equals(abstractC12578b0.mo46927a())) {
                return true;
            }
        }
        return false;
    }

    @Override // p531x0.AbstractC12578b0
    /* JADX INFO: renamed from: f */
    public int mo46932f() {
        return this.f44805f;
    }

    @Override // p531x0.AbstractC12578b0
    /* JADX INFO: renamed from: g */
    public Matrix mo46933g() {
        return this.f44806g;
    }

    @Override // p531x0.AbstractC12578b0
    /* JADX INFO: renamed from: h */
    public Size mo46934h() {
        return this.f44803d;
    }

    public int hashCode() {
        int iHashCode = (this.f44800a.hashCode() ^ 1000003) * 1000003;
        C10091g c10091g = this.f44801b;
        return ((((((((((((iHashCode ^ (c10091g == null ? 0 : c10091g.hashCode())) * 1000003) ^ this.f44802c) * 1000003) ^ this.f44803d.hashCode()) * 1000003) ^ this.f44804e.hashCode()) * 1000003) ^ this.f44805f) * 1000003) ^ this.f44806g.hashCode()) * 1000003) ^ this.f44807h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f44800a + ", exif=" + this.f44801b + ", format=" + this.f44802c + ", size=" + this.f44803d + ", cropRect=" + this.f44804e + ", rotationDegrees=" + this.f44805f + ", sensorToBufferTransform=" + this.f44806g + ", cameraCaptureResult=" + this.f44807h + "}";
    }
}
