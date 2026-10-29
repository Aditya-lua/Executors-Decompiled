package y0;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import g0.i0;
import g0.j2;
import g0.k0;
import g0.r1;
import java.util.Map;
import okhttp3.internal.http2.Http2;
import x0.c0;
import x0.z;

/* JADX INFO: loaded from: classes.dex */
public final class c extends z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35431n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35432o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i0 f35433p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i0 f35434q;

    public c(i0 i0Var, i0 i0Var2) {
        this.f35433p = i0Var;
        this.f35434q = i0Var2;
    }

    public static float[] u(Size size, Size size2, i0 i0Var) {
        float[] fArrL = z0.d.l();
        float[] fArrL2 = z0.d.l();
        float[] fArrL3 = z0.d.l();
        Matrix.scaleM(fArrL, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        if (i0Var.c().f34681a.floatValue() != 0.0f || i0Var.c().b.floatValue() != 0.0f) {
            Matrix.translateM(fArrL2, 0, i0Var.b().f34681a.floatValue() / i0Var.c().f34681a.floatValue(), i0Var.b().b.floatValue() / i0Var.c().b.floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArrL3, 0, fArrL, 0, fArrL2, 0);
        return fArrL3;
    }

    @Override // x0.z
    public z0.e h(k0 k0Var, Map<z0.d.e, c0> map) throws Throwable {
        z0.e eVarH = super.h(k0Var, map);
        this.f35431n = z0.d.p();
        this.f35432o = z0.d.p();
        return eVarH;
    }

    @Override // x0.z
    public void k() {
        super.k();
        this.f35431n = -1;
        this.f35432o = -1;
    }

    public int t(boolean z10) {
        z0.d.i(this.f34666a, true);
        z0.d.h(this.f34667c);
        return z10 ? this.f35431n : this.f35432o;
    }

    public void v(long j10, Surface surface, j2 j2Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        z0.d.i(this.f34666a, true);
        z0.d.h(this.f34667c);
        z0.g gVarF = f(surface);
        if (gVarF == z0.d.f37033l) {
            gVarF = c(surface);
            if (gVarF == null) {
                return;
            } else {
                this.b.put(surface, gVarF);
            }
        }
        z0.g gVar = gVarF;
        if (surface != this.f34673i) {
            i(gVar.a());
            this.f34673i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        w(gVar, j2Var, surfaceTexture, this.f35433p, this.f35431n, true);
        w(gVar, j2Var, surfaceTexture2, this.f35434q, this.f35432o, false);
        EGLExt.eglPresentationTimeANDROID(this.f34668d, gVar.a(), j10);
        if (EGL14.eglSwapBuffers(this.f34668d, gVar.a())) {
            return;
        }
        r1.l("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }

    public final void w(z0.g gVar, j2 j2Var, SurfaceTexture surfaceTexture, i0 i0Var, int i10, boolean z10) {
        s(i10);
        GLES20.glViewport(0, 0, gVar.c(), gVar.b());
        GLES20.glScissor(0, 0, gVar.c(), gVar.b());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        j2Var.S(fArr2, fArr, z10);
        z0.d.f fVar = (z0.d.f) x2.g.g(this.f34675k);
        if (fVar instanceof z0.d.g) {
            ((z0.d.g) fVar).h(fArr2);
        }
        fVar.e(u(new Size((int) (gVar.c() * i0Var.c().f34681a.floatValue()), (int) (gVar.b() * i0Var.c().b.floatValue())), new Size(gVar.c(), gVar.b()), i0Var));
        fVar.d(i0Var.a());
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        z0.d.g("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
