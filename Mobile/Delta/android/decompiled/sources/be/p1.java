package be;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f4031a = new HashSet();

    public final synchronized void a(vd.a aVar) {
        this.f4031a.add(aVar);
    }

    public final synchronized void b(vd.a aVar) {
        this.f4031a.remove(aVar);
    }

    public final synchronized void c(Object obj) {
        Iterator it = this.f4031a.iterator();
        while (it.hasNext()) {
            ((vd.a) it.next()).a(obj);
        }
    }
}
