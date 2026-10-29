package p296n0;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: renamed from: n0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C8798o extends AbstractC8740d3 {

    /* JADX INFO: renamed from: a */
    public final Surface f31981a;

    /* JADX INFO: renamed from: b */
    public final Size f31982b;

    /* JADX INFO: renamed from: c */
    public final int f31983c;

    public C8798o(Surface surface, Size size, int i10) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f31981a = surface;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f31982b = size;
        this.f31983c = i10;
    }

    @Override // p296n0.AbstractC8740d3
    /* JADX INFO: renamed from: b */
    public int mo35061b() {
        return this.f31983c;
    }

    @Override // p296n0.AbstractC8740d3
    /* JADX INFO: renamed from: c */
    public Size mo35062c() {
        return this.f31982b;
    }

    @Override // p296n0.AbstractC8740d3
    /* JADX INFO: renamed from: d */
    public Surface mo35063d() {
        return this.f31981a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8740d3) {
            AbstractC8740d3 abstractC8740d3 = (AbstractC8740d3) obj;
            if (this.f31981a.equals(abstractC8740d3.mo35063d()) && this.f31982b.equals(abstractC8740d3.mo35062c()) && this.f31983c == abstractC8740d3.mo35061b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f31981a.hashCode() ^ 1000003) * 1000003) ^ this.f31982b.hashCode()) * 1000003) ^ this.f31983c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f31981a + ", size=" + this.f31982b + ", imageFormat=" + this.f31983c + "}";
    }
}
