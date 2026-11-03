package f1;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j extends x.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f16461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f16462k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f16463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<Size> f16464m;

    public j(int i10, int i11, String str, List<Size> list) {
        this.f16461j = i10;
        this.f16462k = i11;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f16463l = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.f16464m = list;
    }

    @Override // f1.x.b
    public int c() {
        return this.f16462k;
    }

    @Override // f1.x.b
    public String d() {
        return this.f16463l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x.b) {
            x.b bVar = (x.b) obj;
            if (this.f16461j == bVar.g() && this.f16462k == bVar.c() && this.f16463l.equals(bVar.d()) && this.f16464m.equals(bVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // f1.x.b
    public List<Size> f() {
        return this.f16464m;
    }

    @Override // f1.x.b
    public int g() {
        return this.f16461j;
    }

    public int hashCode() {
        return ((((((this.f16461j ^ 1000003) * 1000003) ^ this.f16462k) * 1000003) ^ this.f16463l.hashCode()) * 1000003) ^ this.f16464m.hashCode();
    }

    public String toString() {
        return "ConstantQuality{value=" + this.f16461j + ", highSpeedValue=" + this.f16462k + ", name=" + this.f16463l + ", typicalSizes=" + this.f16464m + "}";
    }
}
