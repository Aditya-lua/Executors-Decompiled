package p590z0;

import android.opengl.EGLSurface;

/* JADX INFO: renamed from: z0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13674c extends AbstractC13678g {

    /* JADX INFO: renamed from: a */
    public final EGLSurface f47942a;

    /* JADX INFO: renamed from: b */
    public final int f47943b;

    /* JADX INFO: renamed from: c */
    public final int f47944c;

    public C13674c(EGLSurface eGLSurface, int i10, int i11) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f47942a = eGLSurface;
        this.f47943b = i10;
        this.f47944c = i11;
    }

    @Override // p590z0.AbstractC13678g
    /* JADX INFO: renamed from: a */
    public EGLSurface mo49863a() {
        return this.f47942a;
    }

    @Override // p590z0.AbstractC13678g
    /* JADX INFO: renamed from: b */
    public int mo49864b() {
        return this.f47944c;
    }

    @Override // p590z0.AbstractC13678g
    /* JADX INFO: renamed from: c */
    public int mo49865c() {
        return this.f47943b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13678g) {
            AbstractC13678g abstractC13678g = (AbstractC13678g) obj;
            if (this.f47942a.equals(abstractC13678g.mo49863a()) && this.f47943b == abstractC13678g.mo49865c() && this.f47944c == abstractC13678g.mo49864b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f47942a.hashCode() ^ 1000003) * 1000003) ^ this.f47943b) * 1000003) ^ this.f47944c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f47942a + ", width=" + this.f47943b + ", height=" + this.f47944c + "}";
    }
}
