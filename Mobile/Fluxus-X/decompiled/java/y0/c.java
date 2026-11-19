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
import x0.c0;
import x0.z;

/* JADX INFO: loaded from: classes.dex */
public final class c extends z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f37127n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f37128o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i0 f37129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i0 f37130q;

    public c(i0 i0Var, i0 i0Var2) {
        this.f37129p = i0Var;
        this.f37130q = i0Var2;
    }

    public static float[] u(Size size, Size size2, i0 i0Var) {
        float[] fArrL = z0.d.l();
        float[] fArrL2 = z0.d.l();
        float[] fArrL3 = z0.d.l();
        Matrix.scaleM(fArrL, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        if (i0Var.c().f36145a.floatValue() != 0.0f || i0Var.c().b.floatValue() != 0.0f) {
            Matrix.translateM(fArrL2, 0, i0Var.b().f36145a.floatValue() / i0Var.c().f36145a.floatValue(), i0Var.b().b.floatValue() / i0Var.c().b.floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArrL3, 0, fArrL, 0, fArrL2, 0);
        return fArrL3;
    }

    @Override // x0.z
    public z0.e h(k0 k0Var, Map<z0.d.e, c0> map) throws Throwable {
        z0.e eVarH = super.h(k0Var, map);
        this.f37127n = z0.d.p();
        this.f37128o = z0.d.p();
        return eVarH;
    }

    @Override // x0.z
    public void k() {
        super.k();
        this.f37127n = -1;
        this.f37128o = -1;
    }

    public int t(boolean z10) {
        z0.d.i(this.f36130a, true);
        z0.d.h(this.f36131c);
        return z10 ? this.f37127n : this.f37128o;
    }

    public void v(long j10, Surface surface, j2 j2Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        z0.d.i(this.f36130a, true);
        z0.d.h(this.f36131c);
        z0.g gVarF = f(surface);
        if (gVarF == z0.d.f38833l) {
            gVarF = c(surface);
            if (gVarF == null) {
                return;
            } else {
                this.b.put(surface, gVarF);
            }
        }
        z0.g gVar = gVarF;
        if (surface != this.f36137i) {
            i(gVar.a());
            this.f36137i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        w(gVar, j2Var, surfaceTexture, this.f37129p, this.f37127n, true);
        w(gVar, j2Var, surfaceTexture2, this.f37130q, this.f37128o, false);
        EGLExt.eglPresentationTimeANDROID(this.f36132d, gVar.a(), j10);
        if (EGL14.eglSwapBuffers(this.f36132d, gVar.a())) {
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
        j2Var.W(fArr2, fArr, z10);
        z0.d.f fVar = (z0.d.f) x2.g.g(this.f36139k);
        if (fVar instanceof z0.d.g) {
            ((z0.d.g) fVar).h(fArr2);
        }
        fVar.e(u(new Size((int) (gVar.c() * i0Var.c().f36145a.floatValue()), (int) (gVar.b() * i0Var.c().b.floatValue())), new Size(gVar.c(), gVar.b()), i0Var));
        fVar.d(i0Var.a());
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        z0.d.g("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
