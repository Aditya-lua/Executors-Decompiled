package p038c2;

import java.util.ArrayList;
import p591z1.C13681c;

/* JADX INFO: renamed from: c2.m */
/* JADX INFO: loaded from: classes.dex */
public class C1520m extends C1512e {

    /* JADX INFO: renamed from: L0 */
    public ArrayList<C1512e> f6025L0 = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public void m7948a(C1512e c1512e) {
        this.f6025L0.add(c1512e);
        if (c1512e.m7723K() != null) {
            ((C1520m) c1512e.m7723K()).m7950u1(c1512e);
        }
        c1512e.m7763d1(this);
    }

    /* JADX INFO: renamed from: s1 */
    public ArrayList<C1512e> m7949s1() {
        return this.f6025L0;
    }

    @Override // p038c2.C1512e
    /* JADX INFO: renamed from: t0 */
    public void mo7805t0() {
        this.f6025L0.clear();
        super.mo7805t0();
    }

    /* JADX INFO: renamed from: t1 */
    public void mo7848t1() {
        ArrayList<C1512e> arrayList = this.f6025L0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1512e c1512e = this.f6025L0.get(i10);
            if (c1512e instanceof C1520m) {
                ((C1520m) c1512e).mo7848t1();
            }
        }
    }

    /* JADX INFO: renamed from: u1 */
    public void m7950u1(C1512e c1512e) {
        this.f6025L0.remove(c1512e);
        c1512e.mo7805t0();
    }

    /* JADX INFO: renamed from: v1 */
    public void m7951v1() {
        this.f6025L0.clear();
    }

    @Override // p038c2.C1512e
    /* JADX INFO: renamed from: w0 */
    public void mo7811w0(C13681c c13681c) {
        super.mo7811w0(c13681c);
        int size = this.f6025L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f6025L0.get(i10).mo7811w0(c13681c);
        }
    }
}
