package p388qn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: qn.z */
/* JADX INFO: loaded from: classes3.dex */
public class C10630z {

    /* JADX INFO: renamed from: a */
    public List<C10629y> f38107a;

    /* JADX INFO: renamed from: c */
    public static C10630z m40722c() {
        return new C10630z();
    }

    /* JADX INFO: renamed from: a */
    public void m40723a(List<C10629y> list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f38107a == null) {
            this.f38107a = new ArrayList();
        }
        if (this.f38107a.isEmpty()) {
            this.f38107a.addAll(list);
            return;
        }
        int size = this.f38107a.size() - 1;
        C10629y c10629y = this.f38107a.get(size);
        C10629y c10629y2 = list.get(0);
        if (c10629y.m40717b() + c10629y.m40718c() != c10629y2.m40717b()) {
            this.f38107a.addAll(list);
        } else {
            this.f38107a.set(size, C10629y.m40715e(c10629y.m40719d(), c10629y.m40716a(), c10629y.m40717b(), c10629y.m40718c() + c10629y2.m40718c()));
            this.f38107a.addAll(list.subList(1, list.size()));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m40724b(Iterable<? extends AbstractC10623s> iterable) {
        Iterator<? extends AbstractC10623s> it = iterable.iterator();
        while (it.hasNext()) {
            m40723a(it.next().m40702h());
        }
    }

    /* JADX INFO: renamed from: d */
    public List<C10629y> m40725d() {
        List<C10629y> list = this.f38107a;
        return list != null ? list : Collections.EMPTY_LIST;
    }
}
