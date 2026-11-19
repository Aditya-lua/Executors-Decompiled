package z0;

import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EGLSurface f38821a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38822c;

    public c(EGLSurface eGLSurface, int i10, int i11) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f38821a = eGLSurface;
        this.b = i10;
        this.f38822c = i11;
    }

    @Override // z0.g
    public EGLSurface a() {
        return this.f38821a;
    }

    @Override // z0.g
    public int b() {
        return this.f38822c;
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
            if (this.f38821a.equals(gVar.a()) && this.b == gVar.c() && this.f38822c == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f38821a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f38822c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f38821a + ", width=" + this.b + ", height=" + this.f38822c + "}";
    }
}
