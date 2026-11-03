package z;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Size> f37173a;
    public final List<Size> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37176e;

    public e(List<Size> list, List<Size> list2, int i10, int i11, int i12) {
        this.f37173a = list;
        this.b = list2;
        this.f37174c = i10;
        this.f37175d = i11;
        this.f37176e = i12;
    }

    @Override // z.g5.b
    public List<Size> a() {
        return this.f37173a;
    }

    @Override // z.g5.b
    public List<Size> b() {
        return this.b;
    }

    @Override // z.g5.b
    public int c() {
        return this.f37176e;
    }

    @Override // z.g5.b
    public int d() {
        return this.f37174c;
    }

    @Override // z.g5.b
    public int e() {
        return this.f37175d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g5.b) {
            g5.b bVar = (g5.b) obj;
            List<Size> list = this.f37173a;
            if (list != null ? list.equals(bVar.a()) : bVar.a() == null) {
                List<Size> list2 = this.b;
                if (list2 != null ? list2.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f37174c == bVar.d() && this.f37175d == bVar.e() && this.f37176e == bVar.c()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        List<Size> list = this.f37173a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        List<Size> list2 = this.b;
        return ((((((iHashCode ^ (list2 != null ? list2.hashCode() : 0)) * 1000003) ^ this.f37174c) * 1000003) ^ this.f37175d) * 1000003) ^ this.f37176e;
    }

    public String toString() {
        return "BestSizesAndMaxFpsForConfigs{bestSizes=" + this.f37173a + ", bestSizesForStreamUseCase=" + this.b + ", maxFpsForBestSizes=" + this.f37174c + ", maxFpsForStreamUseCase=" + this.f37175d + ", maxFpsForAllSizes=" + this.f37176e + "}";
    }
}
