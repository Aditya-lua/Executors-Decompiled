package de;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f12229a = new HashSet();

    public final synchronized void a(xd.a aVar) {
        this.f12229a.add(aVar);
    }

    public final synchronized void b(xd.a aVar) {
        this.f12229a.remove(aVar);
    }

    public final synchronized void c(Object obj) {
        Iterator it = this.f12229a.iterator();
        while (it.hasNext()) {
            ((xd.a) it.next()).a(obj);
        }
    }
}
