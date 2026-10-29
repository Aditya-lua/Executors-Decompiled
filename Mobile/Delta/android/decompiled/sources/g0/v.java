package g0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f17533c = new a().b(0).a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f17534d = new a().b(1).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet<r> f17535a;
    public final String b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashSet<r> f17536a = new LinkedHashSet<>();
        public String b;

        public v a() {
            return new v(this.f17536a, this.b);
        }

        public a b(int i10) {
            x2.g.j(i10 != -1, "The specified lens facing is invalid.");
            this.f17536a.add(new n0.m2(i10));
            return this;
        }
    }

    public v(LinkedHashSet<r> linkedHashSet, String str) {
        this.f17535a = linkedHashSet;
        this.b = str;
    }

    public LinkedHashSet<n0.p0> a(LinkedHashSet<n0.p0> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<n0.p0> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().d());
        }
        List<t> listB = b(arrayList);
        LinkedHashSet<n0.p0> linkedHashSet2 = new LinkedHashSet<>();
        for (n0.p0 p0Var : linkedHashSet) {
            if (listB.contains(p0Var.d())) {
                linkedHashSet2.add(p0Var);
            }
        }
        return linkedHashSet2;
    }

    public List<t> b(List<t> list) {
        List<t> arrayList = new ArrayList<>(list);
        Iterator<r> it = this.f17535a.iterator();
        while (it.hasNext()) {
            arrayList = it.next().b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public LinkedHashSet<r> c() {
        return this.f17535a;
    }

    public Integer d() {
        Integer num = null;
        for (r rVar : this.f17535a) {
            if (rVar instanceof n0.m2) {
                Integer numValueOf = Integer.valueOf(((n0.m2) rVar).c());
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final String e(Set<n0.p0> set) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cams:");
        sb2.append(set.size());
        Iterator<n0.p0> it = set.iterator();
        while (it.hasNext()) {
            n0.o0 o0VarK = it.next().k();
            sb2.append(String.format(" Id:%s  Lens:%s", o0VarK.e(), Integer.valueOf(o0VarK.i())));
        }
        return sb2.toString();
    }

    public final String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("PhyId:%s  Filters:%s", this.b, Integer.valueOf(this.f17535a.size())));
        for (r rVar : this.f17535a) {
            sb2.append(" Id:");
            sb2.append(rVar.a());
            if (rVar instanceof n0.m2) {
                sb2.append(" LensFilter:");
                sb2.append(((n0.m2) rVar).c());
            }
        }
        return sb2.toString();
    }

    public n0.p0 g(LinkedHashSet<n0.p0> linkedHashSet) {
        Iterator<n0.p0> it = a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException(String.format("No available camera can be found. %s %s", e(linkedHashSet), f()));
    }
}
