package ae;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f359a = new HashSet();

    public final synchronized void a(ud.a aVar) {
        this.f359a.add(aVar);
    }

    public final synchronized void b(ud.a aVar) {
        this.f359a.remove(aVar);
    }

    public final synchronized void c(Object obj) {
        Iterator it = this.f359a.iterator();
        while (it.hasNext()) {
            ((ud.a) it.next()).a(obj);
        }
    }
}
