package p531x0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.InterfaceC0494d;
import p296n0.InterfaceC8743e0;
import p347p0.C10085a0;
import p347p0.C10091g;
import p503w0.C12272b;
import p533x2.C12637g;

/* JADX INFO: renamed from: x0.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12578b0<T> {
    /* JADX INFO: renamed from: j */
    public static AbstractC12578b0<Bitmap> m46935j(Bitmap bitmap, C10091g c10091g, Rect rect, int i10, Matrix matrix, InterfaceC8743e0 interfaceC8743e0) {
        return new C12577b(bitmap, c10091g, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i10, matrix, interfaceC8743e0);
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC12578b0<InterfaceC0494d> m46936k(InterfaceC0494d interfaceC0494d, C10091g c10091g, Rect rect, int i10, Matrix matrix, InterfaceC8743e0 interfaceC8743e0) {
        return m46937l(interfaceC0494d, c10091g, new Size(interfaceC0494d.getWidth(), interfaceC0494d.getHeight()), rect, i10, matrix, interfaceC8743e0);
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC12578b0<InterfaceC0494d> m46937l(InterfaceC0494d interfaceC0494d, C10091g c10091g, Size size, Rect rect, int i10, Matrix matrix, InterfaceC8743e0 interfaceC8743e0) {
        if (C12272b.m45561j(interfaceC0494d.getFormat())) {
            C12637g.m47076h(c10091g, "JPEG image must have Exif.");
        }
        return new C12577b(interfaceC0494d, c10091g, interfaceC0494d.getFormat(), size, rect, i10, matrix, interfaceC8743e0);
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC12578b0<byte[]> m46938m(byte[] bArr, C10091g c10091g, int i10, Size size, Rect rect, int i11, Matrix matrix, InterfaceC8743e0 interfaceC8743e0) {
        return new C12577b(bArr, c10091g, i10, size, rect, i11, matrix, interfaceC8743e0);
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC8743e0 mo46927a();

    /* JADX INFO: renamed from: b */
    public abstract Rect mo46928b();

    /* JADX INFO: renamed from: c */
    public abstract T mo46929c();

    /* JADX INFO: renamed from: d */
    public abstract C10091g mo46930d();

    /* JADX INFO: renamed from: e */
    public abstract int mo46931e();

    /* JADX INFO: renamed from: f */
    public abstract int mo46932f();

    /* JADX INFO: renamed from: g */
    public abstract Matrix mo46933g();

    /* JADX INFO: renamed from: h */
    public abstract Size mo46934h();

    /* JADX INFO: renamed from: i */
    public boolean m46939i() {
        return C10085a0.m38880h(mo46928b(), mo46934h());
    }
}
