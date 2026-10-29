package p296n0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: n0.v3 */
/* JADX INFO: loaded from: classes.dex */
public final class C8837v3 {

    /* JADX INFO: renamed from: a */
    public final List<SurfaceConfig> f32145a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8837v3() {
        this.f32145a = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public static void m35466b(List<int[]> list, int i10, int[] iArr, int i11) {
        if (i11 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = 0;
            while (true) {
                if (i13 >= i11) {
                    iArr[i11] = i12;
                    m35466b(list, i10, iArr, i11 + 1);
                    break;
                } else if (i12 == iArr[i13]) {
                    break;
                } else {
                    i13++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m35467a(SurfaceConfig surfaceConfig) {
        return this.f32145a.add(surfaceConfig);
    }

    /* JADX INFO: renamed from: c */
    public final List<int[]> m35468c(int i10) {
        ArrayList arrayList = new ArrayList();
        m35466b(arrayList, i10, new int[i10], 0);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[RETURN] */
    /* JADX INFO: renamed from: d */
    public List<SurfaceConfig> m35469d(List<SurfaceConfig> list) {
        int i10;
        boolean zM35485j;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.f32145a.size()) {
            return null;
        }
        List<int[]> listM35468c = m35468c(this.f32145a.size());
        SurfaceConfig[] surfaceConfigArr = new SurfaceConfig[list.size()];
        Iterator<int[]> it = listM35468c.iterator();
        do {
            i10 = 0;
            if (it.hasNext()) {
                int[] next = it.next();
                zM35485j = true;
                while (i10 < this.f32145a.size()) {
                    if (next[i10] < list.size()) {
                        zM35485j &= this.f32145a.get(i10).m35485j(list.get(next[i10]));
                        if (!zM35485j) {
                            break;
                        }
                        surfaceConfigArr[next[i10]] = this.f32145a.get(i10);
                    }
                    i10++;
                }
            }
            if (i10 != 0) {
                return Arrays.asList(surfaceConfigArr);
            }
            return null;
        } while (!zM35485j);
        i10 = 1;
        if (i10 != 0) {
            return Arrays.asList(surfaceConfigArr);
        }
        return null;
    }

    public C8837v3(SurfaceConfig... surfaceConfigArr) {
        ArrayList arrayList = new ArrayList();
        this.f32145a = arrayList;
        Collections.addAll(arrayList, surfaceConfigArr);
    }
}
