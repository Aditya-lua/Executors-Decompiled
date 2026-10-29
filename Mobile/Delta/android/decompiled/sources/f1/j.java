package f1;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j extends x.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f15865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f15866k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f15867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<Size> f15868m;

    public j(int i10, int i11, String str, List<Size> list) {
        this.f15865j = i10;
        this.f15866k = i11;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f15867l = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.f15868m = list;
    }

    @Override // f1.x.b
    public int c() {
        return this.f15866k;
    }

    @Override // f1.x.b
    public String d() {
        return this.f15867l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x.b) {
            x.b bVar = (x.b) obj;
            if (this.f15865j == bVar.g() && this.f15866k == bVar.c() && this.f15867l.equals(bVar.d()) && this.f15868m.equals(bVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // f1.x.b
    public List<Size> f() {
        return this.f15868m;
    }

    @Override // f1.x.b
    public int g() {
        return this.f15865j;
    }

    public int hashCode() {
        return ((((((this.f15865j ^ 1000003) * 1000003) ^ this.f15866k) * 1000003) ^ this.f15867l.hashCode()) * 1000003) ^ this.f15868m.hashCode();
    }

    public String toString() {
        return "ConstantQuality{value=" + this.f15865j + ", highSpeedValue=" + this.f15866k + ", name=" + this.f15867l + ", typicalSizes=" + this.f15868m + "}";
    }
}
