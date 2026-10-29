package p347p0;

import java.util.ArrayList;
import p140g0.C5910m0;
import p296n0.InterfaceC8812q3;

/* JADX INFO: renamed from: p0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C10108x {
    /* JADX INFO: renamed from: a */
    public static C5910m0 m39005a(InterfaceC8812q3 interfaceC8812q3, C5910m0 c5910m0) {
        boolean z10;
        if (interfaceC8812q3 == null) {
            return c5910m0;
        }
        C5910m0.a aVar = new C5910m0.a(c5910m0);
        boolean z11 = true;
        if (c5910m0.m26530c().isEmpty() || m39006b(interfaceC8812q3, 1, 2)) {
            z10 = false;
        } else {
            aVar.m26536d(1);
            z10 = true;
        }
        if (!c5910m0.m26529b().isEmpty() && !m39006b(interfaceC8812q3, 3)) {
            aVar.m26536d(2);
            z10 = true;
        }
        if (c5910m0.m26531d().isEmpty() || m39006b(interfaceC8812q3, 4)) {
            z11 = z10;
        } else {
            aVar.m26536d(4);
        }
        if (!z11) {
            return c5910m0;
        }
        C5910m0 c5910m0M26534b = aVar.m26534b();
        if (c5910m0M26534b.m26530c().isEmpty() && c5910m0M26534b.m26529b().isEmpty() && c5910m0M26534b.m26531d().isEmpty()) {
            return null;
        }
        return aVar.m26534b();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m39006b(InterfaceC8812q3 interfaceC8812q3, int... iArr) {
        if (interfaceC8812q3 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return interfaceC8812q3.m35379e().containsAll(arrayList);
    }
}
