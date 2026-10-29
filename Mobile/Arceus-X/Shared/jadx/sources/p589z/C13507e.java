package p589z;

import android.util.Size;
import java.util.List;

/* JADX INFO: renamed from: z.e */
/* JADX INFO: loaded from: classes.dex */
public final class C13507e extends C13529g5.b {

    /* JADX INFO: renamed from: a */
    public final List<Size> f47260a;

    /* JADX INFO: renamed from: b */
    public final List<Size> f47261b;

    /* JADX INFO: renamed from: c */
    public final int f47262c;

    /* JADX INFO: renamed from: d */
    public final int f47263d;

    /* JADX INFO: renamed from: e */
    public final int f47264e;

    public C13507e(List<Size> list, List<Size> list2, int i10, int i11, int i12) {
        this.f47260a = list;
        this.f47261b = list2;
        this.f47262c = i10;
        this.f47263d = i11;
        this.f47264e = i12;
    }

    @Override // p589z.C13529g5.b
    /* JADX INFO: renamed from: a */
    public List<Size> mo49215a() {
        return this.f47260a;
    }

    @Override // p589z.C13529g5.b
    /* JADX INFO: renamed from: b */
    public List<Size> mo49216b() {
        return this.f47261b;
    }

    @Override // p589z.C13529g5.b
    /* JADX INFO: renamed from: c */
    public int mo49217c() {
        return this.f47264e;
    }

    @Override // p589z.C13529g5.b
    /* JADX INFO: renamed from: d */
    public int mo49218d() {
        return this.f47262c;
    }

    @Override // p589z.C13529g5.b
    /* JADX INFO: renamed from: e */
    public int mo49219e() {
        return this.f47263d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13529g5.b) {
            C13529g5.b bVar = (C13529g5.b) obj;
            List<Size> list = this.f47260a;
            if (list != null ? list.equals(bVar.mo49215a()) : bVar.mo49215a() == null) {
                List<Size> list2 = this.f47261b;
                if (list2 != null ? list2.equals(bVar.mo49216b()) : bVar.mo49216b() == null) {
                    if (this.f47262c == bVar.mo49218d() && this.f47263d == bVar.mo49219e() && this.f47264e == bVar.mo49217c()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        List<Size> list = this.f47260a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        List<Size> list2 = this.f47261b;
        return ((((((iHashCode ^ (list2 != null ? list2.hashCode() : 0)) * 1000003) ^ this.f47262c) * 1000003) ^ this.f47263d) * 1000003) ^ this.f47264e;
    }

    public String toString() {
        return "BestSizesAndMaxFpsForConfigs{bestSizes=" + this.f47260a + ", bestSizesForStreamUseCase=" + this.f47261b + ", maxFpsForBestSizes=" + this.f47262c + ", maxFpsForStreamUseCase=" + this.f47263d + ", maxFpsForAllSizes=" + this.f47264e + "}";
    }
}
