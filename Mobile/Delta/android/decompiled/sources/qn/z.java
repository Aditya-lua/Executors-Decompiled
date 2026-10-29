package qn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<y> f29505a;

    public static z c() {
        return new z();
    }

    public void a(List<y> list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f29505a == null) {
            this.f29505a = new ArrayList();
        }
        if (this.f29505a.isEmpty()) {
            this.f29505a.addAll(list);
            return;
        }
        int size = this.f29505a.size() - 1;
        y yVar = this.f29505a.get(size);
        y yVar2 = list.get(0);
        if (yVar.b() + yVar.c() != yVar2.b()) {
            this.f29505a.addAll(list);
        } else {
            this.f29505a.set(size, y.e(yVar.d(), yVar.a(), yVar.b(), yVar.c() + yVar2.c()));
            this.f29505a.addAll(list.subList(1, list.size()));
        }
    }

    public void b(Iterable<? extends s> iterable) {
        Iterator<? extends s> it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next().h());
        }
    }

    public List<y> d() {
        List<y> list = this.f29505a;
        return list != null ? list : Collections.EMPTY_LIST;
    }
}
