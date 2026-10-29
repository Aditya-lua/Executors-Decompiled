package p331og;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: og.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C9733c {

    /* JADX INFO: renamed from: a */
    public final C9731a f35424a;

    /* JADX INFO: renamed from: b */
    public final List<C9732b> f35425b;

    public C9733c(C9731a c9731a) {
        this.f35424a = c9731a;
        ArrayList arrayList = new ArrayList();
        this.f35425b = arrayList;
        arrayList.add(new C9732b(c9731a, new int[]{1}));
    }

    /* JADX INFO: renamed from: a */
    public final C9732b m38518a(int i10) {
        if (i10 >= this.f35425b.size()) {
            List<C9732b> list = this.f35425b;
            C9732b c9732bM38516g = list.get(list.size() - 1);
            for (int size = this.f35425b.size(); size <= i10; size++) {
                C9731a c9731a = this.f35424a;
                c9732bM38516g = c9732bM38516g.m38516g(new C9732b(c9731a, new int[]{1, c9731a.m38504c((size - 1) + c9731a.m38505d())}));
                this.f35425b.add(c9732bM38516g);
            }
        }
        return this.f35425b.get(i10);
    }

    /* JADX INFO: renamed from: b */
    public void m38519b(int[] iArr, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i10;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        C9732b c9732bM38518a = m38518a(i10);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrM38513d = new C9732b(this.f35424a, iArr2).m38517h(i10, 1).m38511b(c9732bM38518a)[1].m38513d();
        int length2 = i10 - iArrM38513d.length;
        for (int i11 = 0; i11 < length2; i11++) {
            iArr[length + i11] = 0;
        }
        System.arraycopy(iArrM38513d, 0, iArr, length + length2, iArrM38513d.length);
    }
}
