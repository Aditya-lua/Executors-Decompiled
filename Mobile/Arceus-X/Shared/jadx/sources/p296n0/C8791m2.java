package p296n0;

import java.util.ArrayList;
import java.util.List;
import p140g0.InterfaceC5929r;
import p140g0.InterfaceC5937t;
import p533x2.C12637g;

/* JADX INFO: renamed from: n0.m2 */
/* JADX INFO: loaded from: classes.dex */
public class C8791m2 implements InterfaceC5929r {

    /* JADX INFO: renamed from: b */
    public final int f31973b;

    public C8791m2(int i10) {
        this.f31973b = i10;
    }

    @Override // p140g0.InterfaceC5929r
    /* JADX INFO: renamed from: b */
    public List<InterfaceC5937t> mo26560b(List<InterfaceC5937t> list) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC5937t interfaceC5937t : list) {
            C12637g.m47070b(interfaceC5937t instanceof InterfaceC8799o0, "The camera info doesn't contain internal implementation.");
            if (interfaceC5937t.mo26583i() == this.f31973b) {
                arrayList.add(interfaceC5937t);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public int m35281c() {
        return this.f31973b;
    }
}
