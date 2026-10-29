package p038c2;

import java.util.ArrayList;
import java.util.Arrays;
import p065d2.C4415i;
import p065d2.C4421o;

/* JADX INFO: renamed from: c2.j */
/* JADX INFO: loaded from: classes.dex */
public class C1517j extends C1512e implements InterfaceC1516i {

    /* JADX INFO: renamed from: L0 */
    public C1512e[] f6009L0 = new C1512e[4];

    /* JADX INFO: renamed from: M0 */
    public int f6010M0 = 0;

    @Override // p038c2.InterfaceC1516i
    /* JADX INFO: renamed from: a */
    public void mo7920a(C1512e c1512e) {
        if (c1512e == this || c1512e == null) {
            return;
        }
        int i10 = this.f6010M0 + 1;
        C1512e[] c1512eArr = this.f6009L0;
        if (i10 > c1512eArr.length) {
            this.f6009L0 = (C1512e[]) Arrays.copyOf(c1512eArr, c1512eArr.length * 2);
        }
        C1512e[] c1512eArr2 = this.f6009L0;
        int i11 = this.f6010M0;
        c1512eArr2[i11] = c1512e;
        this.f6010M0 = i11 + 1;
    }

    @Override // p038c2.InterfaceC1516i
    /* JADX INFO: renamed from: b */
    public void mo7921b(C1513f c1513f) {
    }

    @Override // p038c2.InterfaceC1516i
    /* JADX INFO: renamed from: c */
    public void mo7922c() {
        this.f6010M0 = 0;
        Arrays.fill(this.f6009L0, (Object) null);
    }

    /* JADX INFO: renamed from: s1 */
    public void m7923s1(ArrayList<C4421o> arrayList, int i10, C4421o c4421o) {
        for (int i11 = 0; i11 < this.f6010M0; i11++) {
            c4421o.m22202a(this.f6009L0[i11]);
        }
        for (int i12 = 0; i12 < this.f6010M0; i12++) {
            C4415i.m22189a(this.f6009L0[i12], i10, arrayList, c4421o);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public int m7924t1(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.f6010M0; i13++) {
            C1512e c1512e = this.f6009L0[i13];
            if (i10 == 0 && (i12 = c1512e.f5850I0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = c1512e.f5852J0) != -1) {
                return i11;
            }
        }
        return -1;
    }
}
