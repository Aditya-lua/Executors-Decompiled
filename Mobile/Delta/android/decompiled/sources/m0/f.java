package m0;

import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class f extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f23587a;
    public final int b;

    public f(Size size, int i10) {
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        this.f23587a = size;
        this.b = i10;
    }

    @Override // m0.k0
    public int b() {
        return this.b;
    }

    @Override // m0.k0
    public Size c() {
        return this.f23587a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            if (this.f23587a.equals(k0Var.c()) && this.b == k0Var.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f23587a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        return "PostviewSettings{resolution=" + this.f23587a + ", inputFormat=" + this.b + "}";
    }
}
