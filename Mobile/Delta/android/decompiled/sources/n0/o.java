package n0;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class o extends d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Surface f24761a;
    public final Size b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24762c;

    public o(Surface surface, Size size, int i10) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f24761a = surface;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.b = size;
        this.f24762c = i10;
    }

    @Override // n0.d3
    public int b() {
        return this.f24762c;
    }

    @Override // n0.d3
    public Size c() {
        return this.b;
    }

    @Override // n0.d3
    public Surface d() {
        return this.f24761a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d3) {
            d3 d3Var = (d3) obj;
            if (this.f24761a.equals(d3Var.d()) && this.b.equals(d3Var.c()) && this.f24762c == d3Var.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f24761a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f24762c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f24761a + ", size=" + this.b + ", imageFormat=" + this.f24762c + "}";
    }
}
