package c2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class m extends e {
    public ArrayList<e> L0 = new ArrayList<>();

    public void a(e eVar) {
        this.L0.add(eVar);
        if (eVar.K() != null) {
            ((m) eVar.K()).u1(eVar);
        }
        eVar.d1(this);
    }

    public ArrayList<e> s1() {
        return this.L0;
    }

    @Override // c2.e
    public void t0() {
        this.L0.clear();
        super.t0();
    }

    public void t1() {
        ArrayList<e> arrayList = this.L0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.L0.get(i10);
            if (eVar instanceof m) {
                ((m) eVar).t1();
            }
        }
    }

    public void u1(e eVar) {
        this.L0.remove(eVar);
        eVar.t0();
    }

    public void v1() {
        this.L0.clear();
    }

    @Override // c2.e
    public void w0(z1.c cVar) {
        super.w0(cVar);
        int size = this.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.L0.get(i10).w0(cVar);
        }
    }
}
