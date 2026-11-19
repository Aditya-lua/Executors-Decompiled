package n0;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class o extends d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Surface f25059a;
    public final Size b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25060c;

    public o(Surface surface, Size size, int i10) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f25059a = surface;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.b = size;
        this.f25060c = i10;
    }

    @Override // n0.d3
    public int b() {
        return this.f25060c;
    }

    @Override // n0.d3
    public Size c() {
        return this.b;
    }

    @Override // n0.d3
    public Surface d() {
        return this.f25059a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d3) {
            d3 d3Var = (d3) obj;
            if (this.f25059a.equals(d3Var.d()) && this.b.equals(d3Var.c()) && this.f25060c == d3Var.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f25059a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f25060c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f25059a + ", size=" + this.b + ", imageFormat=" + this.f25060c + "}";
    }
}
