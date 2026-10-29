package p531x0;

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
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p533x2.C12633c;
import p533x2.C12637g;
import p590z0.AbstractC13676e;
import p590z0.AbstractC13678g;
import p590z0.C13675d;

/* JADX INFO: renamed from: x0.z */
/* JADX INFO: loaded from: classes.dex */
public class C12625z {

    /* JADX INFO: renamed from: c */
    public Thread f44940c;

    /* JADX INFO: renamed from: g */
    public EGLConfig f44944g;

    /* JADX INFO: renamed from: i */
    public Surface f44946i;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f44938a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final Map<Surface, AbstractC13678g> f44939b = new HashMap();

    /* JADX INFO: renamed from: d */
    public EGLDisplay f44941d = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: e */
    public EGLContext f44942e = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: f */
    public int[] f44943f = C13675d.f47945a;

    /* JADX INFO: renamed from: h */
    public EGLSurface f44945h = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: j */
    public Map<C13675d.e, C13675d.f> f44947j = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: k */
    public C13675d.f f44948k = null;

    /* JADX INFO: renamed from: l */
    public C13675d.e f44949l = C13675d.e.UNKNOWN;

    /* JADX INFO: renamed from: m */
    public int f44950m = -1;

    /* JADX INFO: renamed from: a */
    public final void m47023a(int i10) {
        GLES20.glActiveTexture(33984);
        C13675d.m49872g("glActiveTexture");
        GLES20.glBindTexture(36197, i10);
        C13675d.m49872g("glBindTexture");
    }

    /* JADX INFO: renamed from: b */
    public final void m47024b(C5902k0 c5902k0, AbstractC13676e.a aVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f44941d = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f44941d, iArr, 0, iArr, 1)) {
            this.f44941d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (aVar != null) {
            aVar.mo49852c(iArr[0] + "." + iArr[1]);
        }
        int i10 = c5902k0.m26518d() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f44941d, new int[]{12324, i10, 12323, i10, 12322, i10, 12321, c5902k0.m26518d() ? 2 : 8, 12325, 0, 12326, 0, 12352, c5902k0.m26518d() ? 64 : 4, 12610, c5902k0.m26518d() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f44941d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, c5902k0.m26518d() ? 3 : 2, 12344}, 0);
        C13675d.m49871f("eglCreateContext");
        this.f44944g = eGLConfig;
        this.f44942e = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.f44941d, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    /* JADX INFO: renamed from: c */
    public AbstractC13678g m47025c(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f44941d;
            EGLConfig eGLConfig = this.f44944g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceM49882q = C13675d.m49882q(eGLDisplay, eGLConfig, surface, this.f44943f);
            Size sizeM49889x = C13675d.m49889x(this.f44941d, eGLSurfaceM49882q);
            return AbstractC13678g.m49906d(eGLSurfaceM49882q, sizeM49889x.getWidth(), sizeM49889x.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e10) {
            C5931r1.m26573m("OpenGlRenderer", "Failed to create EGL surface: " + e10.getMessage(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m47026d() {
        EGLDisplay eGLDisplay = this.f44941d;
        EGLConfig eGLConfig = this.f44944g;
        Objects.requireNonNull(eGLConfig);
        this.f44945h = C13675d.m49879n(eGLDisplay, eGLConfig, 1, 1);
    }

    /* JADX INFO: renamed from: e */
    public final C12633c<String, String> m47027e(C5902k0 c5902k0) {
        C13675d.m49874i(this.f44938a, false);
        try {
            m47024b(c5902k0, null);
            m47026d();
            m47031i(this.f44945h);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.f44941d, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new C12633c<>(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e10) {
            C5931r1.m26573m("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e10.getMessage(), e10);
            return new C12633c<>("", "");
        } finally {
            m47034l();
        }
    }

    /* JADX INFO: renamed from: f */
    public AbstractC13678g m47028f(Surface surface) {
        C12637g.m47078j(this.f44939b.containsKey(surface), "The surface is not registered.");
        AbstractC13678g abstractC13678g = this.f44939b.get(surface);
        Objects.requireNonNull(abstractC13678g);
        return abstractC13678g;
    }

    /* JADX INFO: renamed from: g */
    public int m47029g() {
        C13675d.m49874i(this.f44938a, true);
        C13675d.m49873h(this.f44940c);
        return this.f44950m;
    }

    /* JADX INFO: renamed from: h */
    public AbstractC13676e mo47030h(C5902k0 c5902k0, Map<C13675d.e, InterfaceC12580c0> map) throws Throwable {
        C13675d.m49874i(this.f44938a, false);
        AbstractC13676e.a aVarM49902a = AbstractC13676e.m49902a();
        try {
            if (c5902k0.m26518d()) {
                C12633c<String, String> c12633cM47027e = m47027e(c5902k0);
                String str = (String) C12637g.m47075g(c12633cM47027e.f44955a);
                String str2 = (String) C12637g.m47075g(c12633cM47027e.f44956b);
                if (!str.contains("GL_EXT_YUV_target")) {
                    C5931r1.m26572l("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    c5902k0 = C5902k0.f22550d;
                }
                this.f44943f = C13675d.m49876k(str2, c5902k0);
                aVarM49902a.mo49853d(str);
                aVarM49902a.mo49851b(str2);
            }
            m47024b(c5902k0, aVarM49902a);
            m47026d();
            m47031i(this.f44945h);
            aVarM49902a.mo49854e(C13675d.m49888w());
            this.f44947j = C13675d.m49880o(c5902k0, map);
            int iM49881p = C13675d.m49881p();
            this.f44950m = iM49881p;
            m47041s(iM49881p);
            this.f44940c = Thread.currentThread();
            this.f44938a.set(true);
            return aVarM49902a.mo49850a();
        } catch (IllegalArgumentException e10) {
            e = e10;
            m47034l();
            throw e;
        } catch (IllegalStateException e11) {
            e = e11;
            m47034l();
            throw e;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m47031i(EGLSurface eGLSurface) {
        C12637g.m47075g(this.f44941d);
        C12637g.m47075g(this.f44942e);
        if (!EGL14.eglMakeCurrent(this.f44941d, eGLSurface, eGLSurface, this.f44942e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    /* JADX INFO: renamed from: j */
    public void m47032j(Surface surface) {
        C13675d.m49874i(this.f44938a, true);
        C13675d.m49873h(this.f44940c);
        if (this.f44939b.containsKey(surface)) {
            return;
        }
        this.f44939b.put(surface, C13675d.f47956l);
    }

    /* JADX INFO: renamed from: k */
    public void mo47033k() {
        if (this.f44938a.getAndSet(false)) {
            C13675d.m49873h(this.f44940c);
            m47034l();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m47034l() {
        Iterator<C13675d.f> it = this.f44947j.values().iterator();
        while (it.hasNext()) {
            it.next().m49895b();
        }
        this.f44947j = Collections.EMPTY_MAP;
        this.f44948k = null;
        if (!Objects.equals(this.f44941d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f44941d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (AbstractC13678g abstractC13678g : this.f44939b.values()) {
                if (!Objects.equals(abstractC13678g.mo49863a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f44941d, abstractC13678g.mo49863a())) {
                    C13675d.m49870e("eglDestroySurface");
                }
            }
            this.f44939b.clear();
            if (!Objects.equals(this.f44945h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f44941d, this.f44945h);
                this.f44945h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f44942e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f44941d, this.f44942e);
                this.f44942e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f44941d);
            this.f44941d = EGL14.EGL_NO_DISPLAY;
        }
        this.f44944g = null;
        this.f44950m = -1;
        this.f44949l = C13675d.e.UNKNOWN;
        this.f44946i = null;
        this.f44940c = null;
    }

    /* JADX INFO: renamed from: m */
    public void m47035m(Surface surface, boolean z10) {
        if (this.f44946i == surface) {
            this.f44946i = null;
            m47031i(this.f44945h);
        }
        AbstractC13678g abstractC13678gRemove = z10 ? this.f44939b.remove(surface) : this.f44939b.put(surface, C13675d.f47956l);
        if (abstractC13678gRemove == null || abstractC13678gRemove == C13675d.f47956l) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f44941d, abstractC13678gRemove.mo49863a());
        } catch (RuntimeException e10) {
            C5931r1.m26573m("OpenGlRenderer", "Failed to destroy EGL surface: " + e10.getMessage(), e10);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m47036n(long j10, float[] fArr, Surface surface) {
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
        if (surface != this.f44946i) {
            m47031i(abstractC13678gM47028f.mo49863a());
            this.f44946i = surface;
            GLES20.glViewport(0, 0, abstractC13678gM47028f.mo49865c(), abstractC13678gM47028f.mo49864b());
            GLES20.glScissor(0, 0, abstractC13678gM47028f.mo49865c(), abstractC13678gM47028f.mo49864b());
        }
        C13675d.f fVar = (C13675d.f) C12637g.m47075g(this.f44948k);
        if (fVar instanceof C13675d.g) {
            ((C13675d.g) fVar).m49901h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        C13675d.m49872g("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f44941d, abstractC13678gM47028f.mo49863a(), j10);
        if (EGL14.eglSwapBuffers(this.f44941d, abstractC13678gM47028f.mo49863a())) {
            return;
        }
        C5931r1.m26572l("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m47035m(surface, false);
    }

    /* JADX INFO: renamed from: o */
    public void m47037o(C13675d.e eVar) {
        C13675d.m49874i(this.f44938a, true);
        C13675d.m49873h(this.f44940c);
        if (this.f44949l != eVar) {
            this.f44949l = eVar;
            m47041s(this.f44950m);
        }
    }

    /* JADX INFO: renamed from: p */
    public Bitmap m47038p(Size size, float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        m47039q(byteBufferAllocateDirect, size, fArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.m2178j(bitmapCreateBitmap, byteBufferAllocateDirect, size.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: q */
    public final void m47039q(ByteBuffer byteBuffer, Size size, float[] fArr) {
        C12637g.m47070b(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        C12637g.m47070b(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int iM49886u = C13675d.m49886u();
        GLES20.glActiveTexture(33985);
        C13675d.m49872g("glActiveTexture");
        GLES20.glBindTexture(3553, iM49886u);
        C13675d.m49872g("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        C13675d.m49872g("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int iM49885t = C13675d.m49885t();
        GLES20.glBindFramebuffer(36160, iM49885t);
        C13675d.m49872g("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iM49886u, 0);
        C13675d.m49872g("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        C13675d.m49872g("glActiveTexture");
        GLES20.glBindTexture(36197, this.f44950m);
        C13675d.m49872g("glBindTexture");
        this.f44946i = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        C13675d.f fVar = (C13675d.f) C12637g.m47075g(this.f44948k);
        if (fVar instanceof C13675d.g) {
            ((C13675d.g) fVar).m49901h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        C13675d.m49872g("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        C13675d.m49872g("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        C13675d.m49884s(iM49886u);
        C13675d.m49883r(iM49885t);
        m47023a(this.f44950m);
    }

    /* JADX INFO: renamed from: r */
    public void m47040r(Surface surface) {
        C13675d.m49874i(this.f44938a, true);
        C13675d.m49873h(this.f44940c);
        m47035m(surface, true);
    }

    /* JADX INFO: renamed from: s */
    public void m47041s(int i10) {
        C13675d.f fVar = this.f44947j.get(this.f44949l);
        if (fVar == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.f44949l);
        }
        if (this.f44948k != fVar) {
            this.f44948k = fVar;
            fVar.mo49898f();
            Log.d("OpenGlRenderer", "Using program for input format " + this.f44949l + ": " + this.f44948k);
        }
        m47023a(i10);
    }
}
