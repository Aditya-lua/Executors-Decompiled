package p418rn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p388qn.C10629y;

/* JADX INFO: renamed from: rn.j */
/* JADX INFO: loaded from: classes3.dex */
public class C10935j {

    /* JADX INFO: renamed from: a */
    public final List<C10934i> f38731a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static C10935j m41531b() {
        return new C10935j();
    }

    /* JADX INFO: renamed from: g */
    public static C10935j m41532g(List<C10934i> list) {
        C10935j c10935j = new C10935j();
        c10935j.f38731a.addAll(list);
        return c10935j;
    }

    /* JADX INFO: renamed from: h */
    public static C10935j m41533h(C10934i c10934i) {
        C10935j c10935j = new C10935j();
        c10935j.m41534a(c10934i);
        return c10935j;
    }

    /* JADX INFO: renamed from: a */
    public void m41534a(C10934i c10934i) {
        this.f38731a.add(c10934i);
    }

    /* JADX INFO: renamed from: c */
    public String m41535c() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f38731a.size(); i10++) {
            if (i10 != 0) {
                sb2.append('\n');
            }
            sb2.append(this.f38731a.get(i10).m41528a());
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d */
    public List<C10934i> m41536d() {
        return this.f38731a;
    }

    /* JADX INFO: renamed from: e */
    public List<C10629y> m41537e() {
        ArrayList arrayList = new ArrayList();
        Iterator<C10934i> it = this.f38731a.iterator();
        while (it.hasNext()) {
            C10629y c10629yM41529b = it.next().m41529b();
            if (c10629yM41529b != null) {
                arrayList.add(c10629yM41529b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public boolean m41538f() {
        return this.f38731a.isEmpty();
    }
}
