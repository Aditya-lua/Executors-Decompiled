package z;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Size> f36478a;
    public final List<Size> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36481e;

    public e(List<Size> list, List<Size> list2, int i10, int i11, int i12) {
        this.f36478a = list;
        this.b = list2;
        this.f36479c = i10;
        this.f36480d = i11;
        this.f36481e = i12;
    }

    @Override // z.g5.b
    public List<Size> a() {
        return this.f36478a;
    }

    @Override // z.g5.b
    public List<Size> b() {
        return this.b;
    }

    @Override // z.g5.b
    public int c() {
        return this.f36481e;
    }

    @Override // z.g5.b
    public int d() {
        return this.f36479c;
    }

    @Override // z.g5.b
    public int e() {
        return this.f36480d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g5.b) {
            g5.b bVar = (g5.b) obj;
            List<Size> list = this.f36478a;
            if (list != null ? list.equals(bVar.a()) : bVar.a() == null) {
                List<Size> list2 = this.b;
                if (list2 != null ? list2.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f36479c == bVar.d() && this.f36480d == bVar.e() && this.f36481e == bVar.c()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        List<Size> list = this.f36478a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        List<Size> list2 = this.b;
        return ((((((iHashCode ^ (list2 != null ? list2.hashCode() : 0)) * 1000003) ^ this.f36479c) * 1000003) ^ this.f36480d) * 1000003) ^ this.f36481e;
    }

    public String toString() {
        return "BestSizesAndMaxFpsForConfigs{bestSizes=" + this.f36478a + ", bestSizesForStreamUseCase=" + this.b + ", maxFpsForBestSizes=" + this.f36479c + ", maxFpsForStreamUseCase=" + this.f36480d + ", maxFpsForAllSizes=" + this.f36481e + "}";
    }
}
