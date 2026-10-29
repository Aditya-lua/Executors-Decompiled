package p281m0;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.InterfaceC0494d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;
import p140g0.C5891h1;
import p296n0.C8782k3;
import p347p0.C10085a0;
import p347p0.C10091g;
import p480v0.C11989d;
import p503w0.C12272b;
import p531x0.AbstractC12578b0;
import p531x0.InterfaceC12576a0;

/* JADX INFO: renamed from: m0.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8276b0 implements InterfaceC12576a0<a, AbstractC12578b0<byte[]>> {

    /* JADX INFO: renamed from: a */
    public final C11989d f30590a;

    /* JADX INFO: renamed from: m0.b0$a */
    public static abstract class a {
        /* JADX INFO: renamed from: c */
        public static a m33683c(AbstractC12578b0<InterfaceC0494d> abstractC12578b0, int i10) {
            return new C8281d(abstractC12578b0, i10);
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo33684a();

        /* JADX INFO: renamed from: b */
        public abstract AbstractC12578b0<InterfaceC0494d> mo33685b();
    }

    public C8276b0(C8782k3 c8782k3) {
        this.f30590a = new C11989d(c8782k3);
    }

    /* JADX INFO: renamed from: b */
    public static C10091g m33679b(byte[] bArr) throws C5891h1 {
        try {
            return C10091g.m38924k(new ByteArrayInputStream(bArr));
        } catch (IOException e10) {
            throw new C5891h1(0, "Failed to extract Exif from YUV-generated JPEG", e10);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p531x0.InterfaceC12576a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC12578b0<byte[]> apply(a aVar) {
        AbstractC12578b0<byte[]> abstractC12578b0M33682d;
        try {
            int iMo46931e = aVar.mo33685b().mo46931e();
            if (iMo46931e != 35) {
                if (iMo46931e != 256 && iMo46931e != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + iMo46931e);
                }
                abstractC12578b0M33682d = m33681c(aVar, iMo46931e);
            } else {
                abstractC12578b0M33682d = m33682d(aVar);
            }
            aVar.mo33685b().mo46929c().close();
            return abstractC12578b0M33682d;
        } catch (Throwable th2) {
            aVar.mo33685b().mo46929c().close();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC12578b0<byte[]> m33681c(a aVar, int i10) {
        AbstractC12578b0<InterfaceC0494d> abstractC12578b0Mo33685b = aVar.mo33685b();
        byte[] bArrM44743a = this.f30590a.m44743a(abstractC12578b0Mo33685b.mo46929c());
        C10091g c10091gMo46930d = abstractC12578b0Mo33685b.mo46930d();
        Objects.requireNonNull(c10091gMo46930d);
        return AbstractC12578b0.m46938m(bArrM44743a, c10091gMo46930d, i10, abstractC12578b0Mo33685b.mo46934h(), abstractC12578b0Mo33685b.mo46928b(), abstractC12578b0Mo33685b.mo46932f(), abstractC12578b0Mo33685b.mo46933g(), abstractC12578b0Mo33685b.mo46927a());
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC12578b0<byte[]> m33682d(a aVar) throws C5891h1 {
        AbstractC12578b0<InterfaceC0494d> abstractC12578b0Mo33685b = aVar.mo33685b();
        InterfaceC0494d interfaceC0494dMo46929c = abstractC12578b0Mo33685b.mo46929c();
        Rect rectMo46928b = abstractC12578b0Mo33685b.mo46928b();
        try {
            byte[] bArrM45565n = C12272b.m45565n(interfaceC0494dMo46929c, rectMo46928b, aVar.mo33684a(), abstractC12578b0Mo33685b.mo46932f());
            return AbstractC12578b0.m46938m(bArrM45565n, m33679b(bArrM45565n), 256, new Size(rectMo46928b.width(), rectMo46928b.height()), new Rect(0, 0, rectMo46928b.width(), rectMo46928b.height()), abstractC12578b0Mo33685b.mo46932f(), C10085a0.m38894v(abstractC12578b0Mo33685b.mo46933g(), rectMo46928b), abstractC12578b0Mo33685b.mo46927a());
        } catch (C12272b.a e10) {
            throw new C5891h1(1, "Failed to encode the image to JPEG.", e10);
        }
    }
}
