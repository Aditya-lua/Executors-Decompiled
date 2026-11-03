package x0;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import g0.r1;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Thread f35165c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EGLConfig f35169g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Surface f35171i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f35164a = new AtomicBoolean(false);
    public final Map<Surface, z0.g> b = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLDisplay f35166d = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLContext f35167e = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f35168f = z0.d.f37718a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EGLSurface f35170h = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<z0.d.e, z0.d.f> f35172j = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z0.d.f f35173k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public z0.d.e f35174l = z0.d.e.UNKNOWN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f35175m = -1;

    public final void a(int i10) {
        GLES20.glActiveTexture(33984);
        z0.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, i10);
        z0.d.g("glBindTexture");
    }

    public final void b(g0.k0 k0Var, z0.e.a aVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f35166d = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f35166d, iArr, 0, iArr, 1)) {
            this.f35166d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (aVar != null) {
            aVar.c(iArr[0] + "." + iArr[1]);
        }
        int i10 = k0Var.d() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f35166d, new int[]{12324, i10, 12323, i10, 12322, i10, 12321, k0Var.d() ? 2 : 8, 12325, 0, 12326, 0, 12352, k0Var.d() ? 64 : 4, 12610, k0Var.d() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f35166d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, k0Var.d() ? 3 : 2, 12344}, 0);
        z0.d.f("eglCreateContext");
        this.f35169g = eGLConfig;
        this.f35167e = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.f35166d, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    public z0.g c(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f35166d;
            EGLConfig eGLConfig = this.f35169g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceQ = z0.d.q(eGLDisplay, eGLConfig, surface, this.f35168f);
            Size sizeX = z0.d.x(this.f35166d, eGLSurfaceQ);
            return z0.g.d(eGLSurfaceQ, sizeX.getWidth(), sizeX.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e10) {
            r1.m("OpenGlRenderer", "Failed to create EGL surface: " + e10.getMessage(), e10);
            return null;
        }
    }

    public final void d() {
        EGLDisplay eGLDisplay = this.f35166d;
        EGLConfig eGLConfig = this.f35169g;
        Objects.requireNonNull(eGLConfig);
        this.f35170h = z0.d.n(eGLDisplay, eGLConfig, 1, 1);
    }

    public final x2.c<String, String> e(g0.k0 k0Var) {
        z0.d.i(this.f35164a, false);
        try {
            b(k0Var, null);
            d();
            i(this.f35170h);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.f35166d, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new x2.c<>(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e10) {
            r1.m("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e10.getMessage(), e10);
            return new x2.c<>("", "");
        } finally {
            l();
        }
    }

    public z0.g f(Surface surface) {
        x2.g.j(this.b.containsKey(surface), "The surface is not registered.");
        z0.g gVar = this.b.get(surface);
        Objects.requireNonNull(gVar);
        return gVar;
    }

    public int g() {
        z0.d.i(this.f35164a, true);
        z0.d.h(this.f35165c);
        return this.f35175m;
    }

    public z0.e h(g0.k0 k0Var, Map<z0.d.e, c0> map) throws Throwable {
        z0.d.i(this.f35164a, false);
        z0.e.a aVarA = z0.e.a();
        try {
            if (k0Var.d()) {
                x2.c<String, String> cVarE = e(k0Var);
                String str = (String) x2.g.g(cVarE.f35179a);
                String str2 = (String) x2.g.g(cVarE.b);
                if (!str.contains("GL_EXT_YUV_target")) {
                    r1.l("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    k0Var = g0.k0.f18009d;
                }
                this.f35168f = z0.d.k(str2, k0Var);
                aVarA.d(str);
                aVarA.b(str2);
            }
            b(k0Var, aVarA);
            d();
            i(this.f35170h);
            aVarA.e(z0.d.w());
            this.f35172j = z0.d.o(k0Var, map);
            int iP = z0.d.p();
            this.f35175m = iP;
            s(iP);
            this.f35165c = Thread.currentThread();
            this.f35164a.set(true);
            return aVarA.a();
        } catch (IllegalArgumentException e10) {
            e = e10;
            l();
            throw e;
        } catch (IllegalStateException e11) {
            e = e11;
            l();
            throw e;
        }
    }

    public void i(EGLSurface eGLSurface) {
        x2.g.g(this.f35166d);
        x2.g.g(this.f35167e);
        if (!EGL14.eglMakeCurrent(this.f35166d, eGLSurface, eGLSurface, this.f35167e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void j(Surface surface) {
        z0.d.i(this.f35164a, true);
        z0.d.h(this.f35165c);
        if (this.b.containsKey(surface)) {
            return;
        }
        this.b.put(surface, z0.d.f37728l);
    }

    public void k() {
        if (this.f35164a.getAndSet(false)) {
            z0.d.h(this.f35165c);
            l();
        }
    }

    public final void l() {
        Iterator<z0.d.f> it = this.f35172j.values().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f35172j = Collections.EMPTY_MAP;
        this.f35173k = null;
        if (!Objects.equals(this.f35166d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f35166d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (z0.g gVar : this.b.values()) {
                if (!Objects.equals(gVar.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f35166d, gVar.a())) {
                    z0.d.e("eglDestroySurface");
                }
            }
            this.b.clear();
            if (!Objects.equals(this.f35170h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f35166d, this.f35170h);
                this.f35170h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f35167e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f35166d, this.f35167e);
                this.f35167e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f35166d);
            this.f35166d = EGL14.EGL_NO_DISPLAY;
        }
        this.f35169g = null;
        this.f35175m = -1;
        this.f35174l = z0.d.e.UNKNOWN;
        this.f35171i = null;
        this.f35165c = null;
    }

    public void m(Surface surface, boolean z10) {
        if (this.f35171i == surface) {
            this.f35171i = null;
            i(this.f35170h);
        }
        z0.g gVarRemove = z10 ? this.b.remove(surface) : this.b.put(surface, z0.d.f37728l);
        if (gVarRemove == null || gVarRemove == z0.d.f37728l) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f35166d, gVarRemove.a());
        } catch (RuntimeException e10) {
            r1.m("OpenGlRenderer", "Failed to destroy EGL surface: " + e10.getMessage(), e10);
        }
    }

    public void n(long j10, float[] fArr, Surface surface) {
        z0.d.i(this.f35164a, true);
        z0.d.h(this.f35165c);
        z0.g gVarF = f(surface);
        if (gVarF == z0.d.f37728l) {
            gVarF = c(surface);
            if (gVarF == null) {
                return;
            } else {
                this.b.put(surface, gVarF);
            }
        }
        if (surface != this.f35171i) {
            i(gVarF.a());
            this.f35171i = surface;
            GLES20.glViewport(0, 0, gVarF.c(), gVarF.b());
            GLES20.glScissor(0, 0, gVarF.c(), gVarF.b());
        }
        z0.d.f fVar = (z0.d.f) x2.g.g(this.f35173k);
        if (fVar instanceof z0.d.g) {
            ((z0.d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        z0.d.g("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f35166d, gVarF.a(), j10);
        if (EGL14.eglSwapBuffers(this.f35166d, gVarF.a())) {
            return;
        }
        r1.l("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }

    public void o(z0.d.e eVar) {
        z0.d.i(this.f35164a, true);
        z0.d.h(this.f35165c);
        if (this.f35174l != eVar) {
            this.f35174l = eVar;
            s(this.f35175m);
        }
    }

    public Bitmap p(Size size, float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        q(byteBufferAllocateDirect, size, fArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, byteBufferAllocateDirect, size.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public final void q(ByteBuffer byteBuffer, Size size, float[] fArr) {
        x2.g.b(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        x2.g.b(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int iU = z0.d.u();
        GLES20.glActiveTexture(33985);
        z0.d.g("glActiveTexture");
        GLES20.glBindTexture(3553, iU);
        z0.d.g("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        z0.d.g("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int iT = z0.d.t();
        GLES20.glBindFramebuffer(36160, iT);
        z0.d.g("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iU, 0);
        z0.d.g("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        z0.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, this.f35175m);
        z0.d.g("glBindTexture");
        this.f35171i = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        z0.d.f fVar = (z0.d.f) x2.g.g(this.f35173k);
        if (fVar instanceof z0.d.g) {
            ((z0.d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        z0.d.g("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        z0.d.g("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        z0.d.s(iU);
        z0.d.r(iT);
        a(this.f35175m);
    }

    public void r(Surface surface) {
        z0.d.i(this.f35164a, true);
        z0.d.h(this.f35165c);
        m(surface, true);
    }

    public void s(int i10) {
        z0.d.f fVar = this.f35172j.get(this.f35174l);
        if (fVar == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.f35174l);
        }
        if (this.f35173k != fVar) {
            this.f35173k = fVar;
            fVar.f();
            Log.d("OpenGlRenderer", "Using program for input format " + this.f35174l + ": " + this.f35173k);
        }
        a(i10);
    }
}
