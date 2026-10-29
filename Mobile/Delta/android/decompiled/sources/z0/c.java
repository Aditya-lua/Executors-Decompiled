package z0;

import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EGLSurface f37021a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37022c;

    public c(EGLSurface eGLSurface, int i10, int i11) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f37021a = eGLSurface;
        this.b = i10;
        this.f37022c = i11;
    }

    @Override // z0.g
    public EGLSurface a() {
        return this.f37021a;
    }

    @Override // z0.g
    public int b() {
        return this.f37022c;
    }

    @Override // z0.g
    public int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f37021a.equals(gVar.a()) && this.b == gVar.c() && this.f37022c == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f37021a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f37022c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f37021a + ", width=" + this.b + ", height=" + this.f37022c + "}";
    }
}
