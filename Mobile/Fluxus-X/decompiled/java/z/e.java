package z;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Size> f38278a;
    public final List<Size> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38281e;

    public e(List<Size> list, List<Size> list2, int i10, int i11, int i12) {
        this.f38278a = list;
        this.b = list2;
        this.f38279c = i10;
        this.f38280d = i11;
        this.f38281e = i12;
    }

    @Override // z.g5.b
    public List<Size> a() {
        return this.f38278a;
    }

    @Override // z.g5.b
    public List<Size> b() {
        return this.b;
    }

    @Override // z.g5.b
    public int c() {
        return this.f38281e;
    }

    @Override // z.g5.b
    public int d() {
        return this.f38279c;
    }

    @Override // z.g5.b
    public int e() {
        return this.f38280d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g5.b) {
            g5.b bVar = (g5.b) obj;
            List<Size> list = this.f38278a;
            if (list != null ? list.equals(bVar.a()) : bVar.a() == null) {
                List<Size> list2 = this.b;
                if (list2 != null ? list2.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f38279c == bVar.d() && this.f38280d == bVar.e() && this.f38281e == bVar.c()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        List<Size> list = this.f38278a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        List<Size> list2 = this.b;
        return ((((((iHashCode ^ (list2 != null ? list2.hashCode() : 0)) * 1000003) ^ this.f38279c) * 1000003) ^ this.f38280d) * 1000003) ^ this.f38281e;
    }

    public String toString() {
        return "BestSizesAndMaxFpsForConfigs{bestSizes=" + this.f38278a + ", bestSizesForStreamUseCase=" + this.b + ", maxFpsForBestSizes=" + this.f38279c + ", maxFpsForStreamUseCase=" + this.f38280d + ", maxFpsForAllSizes=" + this.f38281e + "}";
    }
}
