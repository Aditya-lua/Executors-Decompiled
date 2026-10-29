package p156h1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p296n0.InterfaceC8721a2;
import p533x2.C12637g;

/* JADX INFO: renamed from: h1.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6268i implements InterfaceC8721a2 {
    /* JADX INFO: renamed from: h */
    public static AbstractC6268i m27525h(int i10, int i11, List<InterfaceC8721a2.a> list, List<InterfaceC8721a2.c> list2) {
        C12637g.m47070b(!list2.isEmpty(), "Should contain at least one VideoProfile.");
        return new C6260a(i10, i11, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)), !list.isEmpty() ? list.get(0) : null, list2.get(0));
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC6268i m27526i(InterfaceC8721a2 interfaceC8721a2) {
        return m27525h(interfaceC8721a2.mo27489a(), interfaceC8721a2.mo27491e(), interfaceC8721a2.mo27492f(), interfaceC8721a2.mo27490b());
    }

    /* JADX INFO: renamed from: j */
    public abstract InterfaceC8721a2.a mo27493j();

    /* JADX INFO: renamed from: k */
    public abstract InterfaceC8721a2.c mo27494k();
}
