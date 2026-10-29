package m0;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0.b0<Bitmap> f23564a;
    public final int b;

    public a(x0.b0<Bitmap> b0Var, int i10) {
        if (b0Var == null) {
            throw new NullPointerException("Null packet");
        }
        this.f23564a = b0Var;
        this.b = i10;
    }

    @Override // m0.k.b
    public int a() {
        return this.b;
    }

    @Override // m0.k.b
    public x0.b0<Bitmap> b() {
        return this.f23564a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k.b) {
            k.b bVar = (k.b) obj;
            if (this.f23564a.equals(bVar.b()) && this.b == bVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f23564a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        return "In{packet=" + this.f23564a + ", jpegQuality=" + this.b + "}";
    }
}
