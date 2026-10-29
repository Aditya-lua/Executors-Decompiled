package be;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p489vd.InterfaceC12158a;

/* JADX INFO: renamed from: be.p1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1352p1 {

    /* JADX INFO: renamed from: a */
    public final Set f5399a = new HashSet();

    /* JADX INFO: renamed from: a */
    public final synchronized void m7202a(InterfaceC12158a interfaceC12158a) {
        this.f5399a.add(interfaceC12158a);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7203b(InterfaceC12158a interfaceC12158a) {
        this.f5399a.remove(interfaceC12158a);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m7204c(Object obj) {
        Iterator it = this.f5399a.iterator();
        while (it.hasNext()) {
            ((InterfaceC12158a) it.next()).mo1207a(obj);
        }
    }
}
