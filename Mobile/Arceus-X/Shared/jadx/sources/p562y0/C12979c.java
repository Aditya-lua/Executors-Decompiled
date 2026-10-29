package p562y0;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.Map;
import p140g0.C5894i0;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p140g0.InterfaceC5900j2;
import p531x0.C12625z;
import p531x0.InterfaceC12580c0;
import p533x2.C12637g;
import p590z0.AbstractC13676e;
import p590z0.AbstractC13678g;
import p590z0.C13675d;

/* JADX INFO: renamed from: y0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C12979c extends C12625z {

    /* JADX INFO: renamed from: n */
    public int f45946n = -1;

    /* JADX INFO: renamed from: o */
    public int f45947o = -1;

    /* JADX INFO: renamed from: p */
    public final C5894i0 f45948p;

    /* JADX INFO: renamed from: q */
    public final C5894i0 f45949q;

    public C12979c(C5894i0 c5894i0, C5894i0 c5894i1) {
        this.f45948p = c5894i0;
        this.f45949q = c5894i1;
    }

    /* JADX INFO: renamed from: u */
    public static float[] m48257u(Size size, Size size2, C5894i0 c5894i0) {
        float[] fArrM49877l = C13675d.m49877l();
        float[] fArrM49877l2 = C13675d.m49877l();
        float[] fArrM49877l3 = C13675d.m49877l();
        Matrix.scaleM(fArrM49877l, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        if (c5894i0.m26493c().f44955a.floatValue() != 0.0f || c5894i0.m26493c().f44956b.floatValue() != 0.0f) {
            Matrix.translateM(fArrM49877l2, 0, c5894i0.m26492b().f44955a.floatValue() / c5894i0.m26493c().f44955a.floatValue(), c5894i0.m26492b().f44956b.floatValue() / c5894i0.m26493c().f44956b.floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArrM49877l3, 0, fArrM49877l, 0, fArrM49877l2, 0);
        return fArrM49877l3;
    }

    @Override // p531x0.C12625z
    /* JADX INFO: renamed from: h */
    public AbstractC13676e mo47030h(C5902k0 c5902k0, Map<C13675d.e, InterfaceC12580c0> map) throws Throwable {
        AbstractC13676e abstractC13676eMo47030h = super.mo47030h(c5902k0, map);
        this.f45946n = C13675d.m49881p();
        this.f45947o = C13675d.m49881p();
        return abstractC13676eMo47030h;
    }

    @Override // p531x0.C12625z
    /* JADX INFO: renamed from: k */
    public void mo47033k() {
        super.mo47033k();
        this.f45946n = -1;
        this.f45947o = -1;
    }

    /* JADX INFO: renamed from: t */
    public int m48258t(boolean z10) {
        C13675d.m49874i(this.f44938a, true);
        C13675d.m49873h(this.f44940c);
        return z10 ? this.f45946n : this.f45947o;
    }

    /* JADX INFO: renamed from: v */
    public void m48259v(long j10, Surface surface, InterfaceC5900j2 interfaceC5900j2, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        C13675d.m49874i(this.f44938a, true);
        C13675d.m49873h(this.f44940c);
        AbstractC13678g abstractC13678gM47028f = m47028f(surface);
        if (abstractC13678gM47028f == C13675d.f47956l) {
            abstractC13678gM47028f = m47025c(surface);
            if (abstractC13678gM47028f == null) {
                return;
            } else {
                this.f44939b.put(surface, abstractC13678gM47028f);
            }
        }
        AbstractC13678g abstractC13678g = abstractC13678gM47028f;
        if (surface != this.f44946i) {
            m47031i(abstractC13678g.mo49863a());
            this.f44946i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        m48260w(abstractC13678g, interfaceC5900j2, surfaceTexture, this.f45948p, this.f45946n, true);
        m48260w(abstractC13678g, interfaceC5900j2, surfaceTexture2, this.f45949q, this.f45947o, false);
        EGLExt.eglPresentationTimeANDROID(this.f44941d, abstractC13678g.mo49863a(), j10);
        if (EGL14.eglSwapBuffers(this.f44941d, abstractC13678g.mo49863a())) {
            return;
        }
        C5931r1.m26572l("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m47035m(surface, false);
    }

    /* JADX INFO: renamed from: w */
    public final void m48260w(AbstractC13678g abstractC13678g, InterfaceC5900j2 interfaceC5900j2, SurfaceTexture surfaceTexture, C5894i0 c5894i0, int i10, boolean z10) {
        m47041s(i10);
        GLES20.glViewport(0, 0, abstractC13678g.mo49865c(), abstractC13678g.mo49864b());
        GLES20.glScissor(0, 0, abstractC13678g.mo49865c(), abstractC13678g.mo49864b());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        interfaceC5900j2.mo26504S(fArr2, fArr, z10);
        C13675d.f fVar = (C13675d.f) C12637g.m47075g(this.f44948k);
        if (fVar instanceof C13675d.g) {
            ((C13675d.g) fVar).m49901h(fArr2);
        }
        fVar.m49897e(m48257u(new Size((int) (abstractC13678g.mo49865c() * c5894i0.m26493c().f44955a.floatValue()), (int) (abstractC13678g.mo49864b() * c5894i0.m26493c().f44956b.floatValue())), new Size(abstractC13678g.mo49865c(), abstractC13678g.mo49864b()), c5894i0));
        fVar.m49896d(c5894i0.m26491a());
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        C13675d.m49872g("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
