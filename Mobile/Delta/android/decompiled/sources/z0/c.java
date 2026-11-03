package z0;

import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EGLSurface f37716a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37717c;

    public c(EGLSurface eGLSurface, int i10, int i11) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f37716a = eGLSurface;
        this.b = i10;
        this.f37717c = i11;
    }

    @Override // z0.g
    public EGLSurface a() {
        return this.f37716a;
    }

    @Override // z0.g
    public int b() {
        return this.f37717c;
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
            if (this.f37716a.equals(gVar.a()) && this.b == gVar.c() && this.f37717c == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f37716a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f37717c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f37716a + ", width=" + this.b + ", height=" + this.f37717c + "}";
    }
}
