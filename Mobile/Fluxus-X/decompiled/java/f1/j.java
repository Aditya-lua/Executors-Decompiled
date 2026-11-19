package f1;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j extends x.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f14939k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f14940l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<Size> f14941m;

    public j(int i10, int i11, String str, List<Size> list) {
        this.f14938j = i10;
        this.f14939k = i11;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f14940l = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.f14941m = list;
    }

    @Override // f1.x.b
    public int c() {
        return this.f14939k;
    }

    @Override // f1.x.b
    public String d() {
        return this.f14940l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x.b) {
            x.b bVar = (x.b) obj;
            if (this.f14938j == bVar.g() && this.f14939k == bVar.c() && this.f14940l.equals(bVar.d()) && this.f14941m.equals(bVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // f1.x.b
    public List<Size> f() {
        return this.f14941m;
    }

    @Override // f1.x.b
    public int g() {
        return this.f14938j;
    }

    public int hashCode() {
        return ((((((this.f14938j ^ 1000003) * 1000003) ^ this.f14939k) * 1000003) ^ this.f14940l.hashCode()) * 1000003) ^ this.f14941m.hashCode();
    }

    public String toString() {
        return "ConstantQuality{value=" + this.f14938j + ", highSpeedValue=" + this.f14939k + ", name=" + this.f14940l + ", typicalSizes=" + this.f14941m + "}";
    }
}
