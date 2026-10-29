package p590z0;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p531x0.InterfaceC12580c0;
import p533x2.C12637g;

/* JADX INFO: renamed from: z0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C13675d {

    /* JADX INFO: renamed from: a */
    public static final int[] f47945a = {12344};

    /* JADX INFO: renamed from: b */
    public static final int[] f47946b = {12445, 13632, 12344};

    /* JADX INFO: renamed from: c */
    public static final String f47947c;

    /* JADX INFO: renamed from: d */
    public static final String f47948d;

    /* JADX INFO: renamed from: e */
    public static final InterfaceC12580c0 f47949e;

    /* JADX INFO: renamed from: f */
    public static final InterfaceC12580c0 f47950f;

    /* JADX INFO: renamed from: g */
    public static final InterfaceC12580c0 f47951g;

    /* JADX INFO: renamed from: h */
    public static final float[] f47952h;

    /* JADX INFO: renamed from: i */
    public static final FloatBuffer f47953i;

    /* JADX INFO: renamed from: j */
    public static final float[] f47954j;

    /* JADX INFO: renamed from: k */
    public static final FloatBuffer f47955k;

    /* JADX INFO: renamed from: l */
    public static final AbstractC13678g f47956l;

    /* JADX INFO: renamed from: z0.d$a */
    public class a implements InterfaceC12580c0 {
        @Override // p531x0.InterfaceC12580c0
        /* JADX INFO: renamed from: a */
        public String mo46942a(String str, String str2) {
            return String.format(Locale.US, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(%s, %s);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n", str2, str, str, str2);
        }
    }

    /* JADX INFO: renamed from: z0.d$b */
    public class b implements InterfaceC12580c0 {
        @Override // p531x0.InterfaceC12580c0
        /* JADX INFO: renamed from: a */
        public String mo46942a(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(%s, %s);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}", str, str2, str, str2);
        }
    }

    /* JADX INFO: renamed from: z0.d$c */
    public class c implements InterfaceC12580c0 {
        @Override // p531x0.InterfaceC12580c0
        /* JADX INFO: renamed from: a */
        public String mo46942a(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}", str, str2, str, str2);
        }
    }

    /* JADX INFO: renamed from: z0.d$d */
    public static class d extends f {
        public d() {
            super("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
        }
    }

    /* JADX INFO: renamed from: z0.d$e */
    public enum e {
        UNKNOWN,
        DEFAULT,
        YUV
    }

    /* JADX INFO: renamed from: z0.d$f */
    public static abstract class f {

        /* JADX INFO: renamed from: a */
        public int f47961a;

        /* JADX INFO: renamed from: b */
        public int f47962b = -1;

        /* JADX INFO: renamed from: c */
        public int f47963c = -1;

        /* JADX INFO: renamed from: d */
        public int f47964d = -1;

        /* JADX WARN: Code duplicated, block: B:32:0x0078  */
        /* JADX WARN: Code duplicated, block: B:34:0x007d  */
        /* JADX WARN: Code duplicated, block: B:36:0x0082  */
        public f(String str, String str2) throws Throwable {
            int iM49890y;
            int iM49890y2;
            int iGlCreateProgram;
            try {
                iM49890y = C13675d.m49890y(35633, str);
                try {
                    iM49890y2 = C13675d.m49890y(35632, str2);
                    try {
                        iGlCreateProgram = GLES20.glCreateProgram();
                        try {
                            C13675d.m49872g("glCreateProgram");
                            GLES20.glAttachShader(iGlCreateProgram, iM49890y);
                            C13675d.m49872g("glAttachShader");
                            GLES20.glAttachShader(iGlCreateProgram, iM49890y2);
                            C13675d.m49872g("glAttachShader");
                            GLES20.glLinkProgram(iGlCreateProgram);
                            int[] iArr = new int[1];
                            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                            if (iArr[0] == 1) {
                                this.f47961a = iGlCreateProgram;
                                m49894c();
                            } else {
                                throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                            }
                        } catch (IllegalArgumentException e10) {
                            e = e10;
                            if (iM49890y != -1) {
                                GLES20.glDeleteShader(iM49890y);
                            }
                            if (iM49890y2 != -1) {
                                GLES20.glDeleteShader(iM49890y2);
                            }
                            if (iGlCreateProgram != -1) {
                                GLES20.glDeleteProgram(iGlCreateProgram);
                            }
                            throw e;
                        } catch (IllegalStateException e11) {
                            e = e11;
                            if (iM49890y != -1) {
                                GLES20.glDeleteShader(iM49890y);
                            }
                            if (iM49890y2 != -1) {
                                GLES20.glDeleteShader(iM49890y2);
                            }
                            if (iGlCreateProgram != -1) {
                                GLES20.glDeleteProgram(iGlCreateProgram);
                            }
                            throw e;
                        }
                    } catch (IllegalArgumentException | IllegalStateException e12) {
                        e = e12;
                        iGlCreateProgram = -1;
                    }
                } catch (IllegalArgumentException | IllegalStateException e13) {
                    e = e13;
                    iM49890y2 = -1;
                    iGlCreateProgram = iM49890y2;
                    if (iM49890y != -1) {
                        GLES20.glDeleteShader(iM49890y);
                    }
                    if (iM49890y2 != -1) {
                        GLES20.glDeleteShader(iM49890y2);
                    }
                    if (iGlCreateProgram != -1) {
                        GLES20.glDeleteProgram(iGlCreateProgram);
                    }
                    throw e;
                }
            } catch (IllegalArgumentException | IllegalStateException e14) {
                e = e14;
                iM49890y = -1;
                iM49890y2 = -1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public void m49894c() {
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f47961a, "aPosition");
            this.f47964d = iGlGetAttribLocation;
            C13675d.m49875j(iGlGetAttribLocation, "aPosition");
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f47961a, "uTransMatrix");
            this.f47962b = iGlGetUniformLocation;
            C13675d.m49875j(iGlGetUniformLocation, "uTransMatrix");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f47961a, "uAlphaScale");
            this.f47963c = iGlGetUniformLocation2;
            C13675d.m49875j(iGlGetUniformLocation2, "uAlphaScale");
        }

        /* JADX INFO: renamed from: b */
        public void m49895b() {
            GLES20.glDeleteProgram(this.f47961a);
        }

        /* JADX INFO: renamed from: d */
        public void m49896d(float f10) {
            GLES20.glUniform1f(this.f47963c, f10);
            C13675d.m49872g("glUniform1f");
        }

        /* JADX INFO: renamed from: e */
        public void m49897e(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f47962b, 1, false, fArr, 0);
            C13675d.m49872g("glUniformMatrix4fv");
        }

        /* JADX INFO: renamed from: f */
        public void mo49898f() {
            GLES20.glUseProgram(this.f47961a);
            C13675d.m49872g("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.f47964d);
            C13675d.m49872g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f47964d, 2, 5126, false, 0, (Buffer) C13675d.f47953i);
            C13675d.m49872g("glVertexAttribPointer");
            m49897e(C13675d.m49877l());
            m49896d(1.0f);
        }
    }

    /* JADX INFO: renamed from: z0.d$g */
    public static class g extends f {

        /* JADX INFO: renamed from: e */
        public int f47965e;

        /* JADX INFO: renamed from: f */
        public int f47966f;

        /* JADX INFO: renamed from: g */
        public int f47967g;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public g(C5902k0 c5902k0, e eVar) {
            this(c5902k0, m49899g(c5902k0, eVar));
        }

        /* JADX INFO: renamed from: g */
        public static InterfaceC12580c0 m49899g(C5902k0 c5902k0, e eVar) {
            if (!c5902k0.m26518d()) {
                return C13675d.f47949e;
            }
            C12637g.m47070b(eVar != e.UNKNOWN, "No default sampler shader available for" + eVar);
            return eVar == e.YUV ? C13675d.f47951g : C13675d.f47950f;
        }

        /* JADX INFO: renamed from: c */
        public final void m49900c() {
            m49894c();
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f47961a, "sTexture");
            this.f47965e = iGlGetUniformLocation;
            C13675d.m49875j(iGlGetUniformLocation, "sTexture");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f47961a, "aTextureCoord");
            this.f47967g = iGlGetAttribLocation;
            C13675d.m49875j(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f47961a, "uTexMatrix");
            this.f47966f = iGlGetUniformLocation2;
            C13675d.m49875j(iGlGetUniformLocation2, "uTexMatrix");
        }

        @Override // p590z0.C13675d.f
        /* JADX INFO: renamed from: f */
        public void mo49898f() {
            super.mo49898f();
            GLES20.glUniform1i(this.f47965e, 0);
            GLES20.glEnableVertexAttribArray(this.f47967g);
            C13675d.m49872g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f47967g, 2, 5126, false, 0, (Buffer) C13675d.f47955k);
            C13675d.m49872g("glVertexAttribPointer");
        }

        /* JADX INFO: renamed from: h */
        public void m49901h(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f47966f, 1, false, fArr, 0);
            C13675d.m49872g("glUniformMatrix4fv");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public g(C5902k0 c5902k0, InterfaceC12580c0 interfaceC12580c0) {
            super(c5902k0.m26518d() ? C13675d.f47948d : C13675d.f47947c, C13675d.m49887v(interfaceC12580c0));
            this.f47965e = -1;
            this.f47966f = -1;
            this.f47967g = -1;
            m49900c();
        }
    }

    static {
        Locale locale = Locale.US;
        f47947c = String.format(locale, "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f47948d = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f47949e = new a();
        f47950f = new b();
        f47951g = new c();
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f47952h = fArr;
        f47953i = m49878m(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f47954j = fArr2;
        f47955k = m49878m(fArr2);
        f47956l = AbstractC13678g.m49906d(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    /* JADX INFO: renamed from: e */
    public static void m49870e(String str) {
        try {
            m49871f(str);
        } catch (IllegalStateException e10) {
            C5931r1.m26564d("GLUtils", e10.toString(), e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m49871f(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    /* JADX INFO: renamed from: g */
    public static void m49872g(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(iGlGetError));
    }

    /* JADX INFO: renamed from: h */
    public static void m49873h(Thread thread) {
        C12637g.m47078j(thread == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    /* JADX INFO: renamed from: i */
    public static void m49874i(AtomicBoolean atomicBoolean, boolean z10) {
        C12637g.m47078j(z10 == atomicBoolean.get(), z10 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    /* JADX INFO: renamed from: j */
    public static void m49875j(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalStateException("Unable to locate '" + str + "' in program");
    }

    /* JADX INFO: renamed from: k */
    public static int[] m49876k(String str, C5902k0 c5902k0) {
        int[] iArr = f47945a;
        if (c5902k0.m26517b() == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return f47946b;
            }
            C5931r1.m26572l("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    /* JADX INFO: renamed from: l */
    public static float[] m49877l() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    /* JADX INFO: renamed from: m */
    public static FloatBuffer m49878m(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    /* JADX INFO: renamed from: n */
    public static EGLSurface m49879n(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, int i11) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i10, 12374, i11, 12344}, 0);
        m49871f("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    /* JADX INFO: renamed from: o */
    public static Map<e, f> m49880o(C5902k0 c5902k0, Map<e, InterfaceC12580c0> map) {
        Object gVar;
        e eVar;
        HashMap map2 = new HashMap();
        e[] eVarArrValues = e.values();
        int length = eVarArrValues.length;
        for (int i10 = 0; i10 < length; i10++) {
            e eVar2 = eVarArrValues[i10];
            InterfaceC12580c0 interfaceC12580c0 = map.get(eVar2);
            if (interfaceC12580c0 != null) {
                gVar = new g(c5902k0, interfaceC12580c0);
            } else if (eVar2 == e.YUV || eVar2 == (eVar = e.DEFAULT)) {
                gVar = new g(c5902k0, eVar2);
            } else {
                C12637g.m47078j(eVar2 == e.UNKNOWN, "Unhandled input format: " + eVar2);
                if (c5902k0.m26518d()) {
                    gVar = new d();
                } else {
                    InterfaceC12580c0 interfaceC12580c1 = map.get(eVar);
                    gVar = interfaceC12580c1 != null ? new g(c5902k0, interfaceC12580c1) : new g(c5902k0, eVar);
                }
            }
            Log.d("GLUtils", "Shader program for input format " + eVar2 + " created: " + gVar);
            map2.put(eVar2, gVar);
        }
        return map2;
    }

    /* JADX INFO: renamed from: p */
    public static int m49881p() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m49872g("glGenTextures");
        int i10 = iArr[0];
        GLES20.glBindTexture(36197, i10);
        m49872g("glBindTexture " + i10);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m49872g("glTexParameter");
        return i10;
    }

    /* JADX INFO: renamed from: q */
    public static EGLSurface m49882q(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        m49871f("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    /* JADX INFO: renamed from: r */
    public static void m49883r(int i10) {
        GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
        m49872g("glDeleteFramebuffers");
    }

    /* JADX INFO: renamed from: s */
    public static void m49884s(int i10) {
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        m49872g("glDeleteTextures");
    }

    /* JADX INFO: renamed from: t */
    public static int m49885t() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        m49872g("glGenFramebuffers");
        return iArr[0];
    }

    /* JADX INFO: renamed from: u */
    public static int m49886u() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m49872g("glGenTextures");
        return iArr[0];
    }

    /* JADX INFO: renamed from: v */
    public static String m49887v(InterfaceC12580c0 interfaceC12580c0) {
        try {
            String strMo46942a = interfaceC12580c0.mo46942a("sTexture", "vTextureCoord");
            if (strMo46942a != null && strMo46942a.contains("vTextureCoord") && strMo46942a.contains("sTexture")) {
                return strMo46942a;
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th2) {
            if (th2 instanceof IllegalArgumentException) {
                throw th2;
            }
            throw new IllegalArgumentException("Unable retrieve fragment shader source", th2);
        }
    }

    /* JADX INFO: renamed from: w */
    public static String m49888w() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        return ((String) C12637g.m47075g(matcher.group(1))) + "." + ((String) C12637g.m47075g(matcher.group(2)));
    }

    /* JADX INFO: renamed from: x */
    public static Size m49889x(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        return new Size(m49891z(eGLDisplay, eGLSurface, 12375), m49891z(eGLDisplay, eGLSurface, 12374));
    }

    /* JADX INFO: renamed from: y */
    public static int m49890y(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        m49872g("glCreateShader type=" + i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        C5931r1.m26572l("GLUtils", "Could not compile shader: " + str);
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i10 + ":" + strGlGetShaderInfoLog);
    }

    /* JADX INFO: renamed from: z */
    public static int m49891z(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i10) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i10, iArr, 0);
        return iArr[0];
    }
}
