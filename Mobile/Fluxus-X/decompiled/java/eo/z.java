package eo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<y> f13878a;

    public static z c() {
        return new z();
    }

    public void a(List<y> list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f13878a == null) {
            this.f13878a = new ArrayList();
        }
        if (this.f13878a.isEmpty()) {
            this.f13878a.addAll(list);
            return;
        }
        int size = this.f13878a.size() - 1;
        y yVar = this.f13878a.get(size);
        y yVar2 = list.get(0);
        if (yVar.b() + yVar.c() != yVar2.b()) {
            this.f13878a.addAll(list);
        } else {
            this.f13878a.set(size, y.e(yVar.d(), yVar.a(), yVar.b(), yVar.c() + yVar2.c()));
            this.f13878a.addAll(list.subList(1, list.size()));
        }
    }

    public void b(Iterable<? extends s> iterable) {
        Iterator<? extends s> it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next().h());
        }
    }

    public List<y> d() {
        List<y> list = this.f13878a;
        return list != null ? list : Collections.EMPTY_LIST;
    }
}
