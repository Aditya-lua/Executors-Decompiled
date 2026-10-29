package p281m0;

import android.graphics.Bitmap;
import androidx.camera.core.C0496f;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.InterfaceC0494d;
import java.nio.ByteBuffer;
import p140g0.C5891h1;
import p140g0.C5915n1;
import p503w0.C12272b;
import p531x0.AbstractC12578b0;
import p531x0.InterfaceC12576a0;

/* JADX INFO: renamed from: m0.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C8273a0 implements InterfaceC12576a0<AbstractC12578b0<InterfaceC0494d>, Bitmap> {
    /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p531x0.InterfaceC12576a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap apply(AbstractC12578b0<InterfaceC0494d> abstractC12578b0) throws Throwable {
        C0496f c0496f;
        Bitmap bitmapM45564m;
        C0496f c0496f2 = null;
        try {
            try {
                int iMo46931e = abstractC12578b0.mo46931e();
                if (iMo46931e == 35) {
                    InterfaceC0494d interfaceC0494dMo46929c = abstractC12578b0.mo46929c();
                    boolean z10 = abstractC12578b0.mo46932f() % 180 != 0;
                    c0496f = new C0496f(C5915n1.m26550a(z10 ? interfaceC0494dMo46929c.getHeight() : interfaceC0494dMo46929c.getWidth(), z10 ? interfaceC0494dMo46929c.getWidth() : interfaceC0494dMo46929c.getHeight(), 1, 2));
                    try {
                        InterfaceC0494d interfaceC0494dM2175g = ImageProcessingUtil.m2175g(interfaceC0494dMo46929c, c0496f, ByteBuffer.allocateDirect(interfaceC0494dMo46929c.getWidth() * interfaceC0494dMo46929c.getHeight() * 4), abstractC12578b0.mo46932f(), false);
                        interfaceC0494dMo46929c.close();
                        if (interfaceC0494dM2175g == null) {
                            throw new C5891h1(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapM45564m = C12272b.m45553b(interfaceC0494dM2175g);
                        interfaceC0494dM2175g.close();
                    } catch (UnsupportedOperationException e10) {
                        e = e10;
                        throw new C5891h1(0, "Can't convert " + (abstractC12578b0.mo46931e() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th2) {
                        th = th2;
                        c0496f2 = c0496f;
                        if (c0496f2 != null) {
                            c0496f2.close();
                        }
                        throw th;
                    }
                } else {
                    if (iMo46931e != 256 && iMo46931e != 4101) {
                        throw new IllegalArgumentException("Invalid postview image format : " + abstractC12578b0.mo46931e());
                    }
                    InterfaceC0494d interfaceC0494dMo46929c2 = abstractC12578b0.mo46929c();
                    Bitmap bitmapM45553b = C12272b.m45553b(interfaceC0494dMo46929c2);
                    interfaceC0494dMo46929c2.close();
                    c0496f = null;
                    bitmapM45564m = C12272b.m45564m(bitmapM45553b, abstractC12578b0.mo46932f());
                }
                if (c0496f != null) {
                    c0496f.close();
                }
                return bitmapM45564m;
            } catch (UnsupportedOperationException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
