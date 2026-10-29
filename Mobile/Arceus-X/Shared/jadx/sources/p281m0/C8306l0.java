package p281m0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.InterfaceC0494d;
import java.io.IOException;
import p140g0.C5891h1;
import p296n0.InterfaceC8743e0;
import p347p0.C10085a0;
import p347p0.C10091g;
import p424s0.C11142c;
import p503w0.C12272b;
import p531x0.AbstractC12578b0;
import p531x0.InterfaceC12576a0;
import p533x2.C12637g;

/* JADX INFO: renamed from: m0.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8306l0 implements InterfaceC12576a0<C8325u0.b, AbstractC12578b0<InterfaceC0494d>> {
    /* JADX INFO: renamed from: b */
    public static AbstractC12578b0<InterfaceC0494d> m33757b(C8327v0 c8327v0, C10091g c10091g, InterfaceC0494d interfaceC0494d) {
        return AbstractC12578b0.m46936k(interfaceC0494d, c10091g, c8327v0.m33804b(), c8327v0.m33808f(), c8327v0.m33810h(), m33759d(interfaceC0494d));
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC12578b0<InterfaceC0494d> m33758c(C8327v0 c8327v0, C10091g c10091g, InterfaceC0494d interfaceC0494d) {
        Size size = new Size(interfaceC0494d.getWidth(), interfaceC0494d.getHeight());
        int iM33808f = c8327v0.m33808f() - c10091g.m38936s();
        Size sizeM33760e = m33760e(iM33808f, size);
        Matrix matrixM38876d = C10085a0.m38876d(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, sizeM33760e.getWidth(), sizeM33760e.getHeight()), iM33808f);
        return AbstractC12578b0.m46937l(interfaceC0494d, c10091g, sizeM33760e, m33761f(c8327v0.m33804b(), matrixM38876d), c10091g.m38936s(), m33762g(c8327v0.m33810h(), matrixM38876d), m33759d(interfaceC0494d));
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC8743e0 m33759d(InterfaceC0494d interfaceC0494d) {
        return interfaceC0494d.mo2192H2() instanceof C11142c ? ((C11142c) interfaceC0494d.mo2192H2()).m41941f() : InterfaceC8743e0.a.m35074k();
    }

    /* JADX INFO: renamed from: e */
    public static Size m33760e(int i10, Size size) {
        return C10085a0.m38881i(C10085a0.m38895w(i10)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    /* JADX INFO: renamed from: f */
    public static Rect m33761f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* JADX INFO: renamed from: g */
    public static Matrix m33762g(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p531x0.InterfaceC12576a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC12578b0<InterfaceC0494d> apply(C8325u0.b bVar) throws C5891h1 {
        C10091g c10091gM38923j;
        InterfaceC0494d interfaceC0494dMo33732a = bVar.mo33732a();
        C8327v0 c8327v0Mo33733b = bVar.mo33733b();
        if (C12272b.m45561j(interfaceC0494dMo33732a.getFormat())) {
            try {
                c10091gM38923j = C10091g.m38923j(interfaceC0494dMo33732a);
                interfaceC0494dMo33732a.mo2186H1()[0].mo2188k().rewind();
            } catch (IOException e10) {
                throw new C5891h1(1, "Failed to extract EXIF data.", e10);
            }
        } else {
            c10091gM38923j = null;
        }
        if (!C8282d0.f30598g.m44740b(interfaceC0494dMo33732a)) {
            return m33757b(c8327v0Mo33733b, c10091gM38923j, interfaceC0494dMo33732a);
        }
        C12637g.m47076h(c10091gM38923j, "JPEG image must have exif.");
        return m33758c(c8327v0Mo33733b, c10091gM38923j, interfaceC0494dMo33732a);
    }
}
