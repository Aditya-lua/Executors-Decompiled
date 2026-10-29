package n0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class m2 implements g0.r {
    public final int b;

    public m2(int i10) {
        this.b = i10;
    }

    @Override // g0.r
    public List<g0.t> b(List<g0.t> list) {
        ArrayList arrayList = new ArrayList();
        for (g0.t tVar : list) {
            x2.g.b(tVar instanceof o0, "The camera info doesn't contain internal implementation.");
            if (tVar.i() == this.b) {
                arrayList.add(tVar);
            }
        }
        return arrayList;
    }

    public int c() {
        return this.b;
    }
}
