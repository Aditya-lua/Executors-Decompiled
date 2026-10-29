package n0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<SurfaceConfig> f24895a;

    public v3() {
        this.f24895a = new ArrayList();
    }

    public static void b(List<int[]> list, int i10, int[] iArr, int i11) {
        if (i11 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 0;
            while (true) {
                if (i13 >= i11) {
                    iArr[i11] = i12;
                    b(list, i10, iArr, i11 + 1);
                    break;
                } else if (i12 == iArr[i13]) {
                    break;
                } else {
                    i13++;
                }
            }
        }
    }

    public boolean a(SurfaceConfig surfaceConfig) {
        return this.f24895a.add(surfaceConfig);
    }

    public final List<int[]> c(int i10) {
        ArrayList arrayList = new ArrayList();
        b(arrayList, i10, new int[i10], 0);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[RETURN] */
    public List<SurfaceConfig> d(List<SurfaceConfig> list) {
        int i10;
        boolean zJ;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.f24895a.size()) {
            return null;
        }
        List<int[]> listC = c(this.f24895a.size());
        SurfaceConfig[] surfaceConfigArr = new SurfaceConfig[list.size()];
        Iterator<int[]> it = listC.iterator();
        do {
            i10 = 0;
            if (it.hasNext()) {
                int[] next = it.next();
                zJ = true;
                while (i10 < this.f24895a.size()) {
                    if (next[i10] < list.size()) {
                        zJ &= this.f24895a.get(i10).j(list.get(next[i10]));
                        if (!zJ) {
                            break;
                        }
                        surfaceConfigArr[next[i10]] = this.f24895a.get(i10);
                    }
                    i10++;
                }
            }
            if (i10 != 0) {
                return Arrays.asList(surfaceConfigArr);
            }
            return null;
        } while (!zJ);
        i10 = 1;
        if (i10 != 0) {
            return Arrays.asList(surfaceConfigArr);
        }
        return null;
    }

    public v3(SurfaceConfig... surfaceConfigArr) {
        ArrayList arrayList = new ArrayList();
        this.f24895a = arrayList;
        Collections.addAll(arrayList, surfaceConfigArr);
    }
}
