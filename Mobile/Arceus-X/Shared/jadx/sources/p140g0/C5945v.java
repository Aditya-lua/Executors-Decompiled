package p140g0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p296n0.C8791m2;
import p296n0.InterfaceC8799o0;
import p296n0.InterfaceC8804p0;
import p533x2.C12637g;

/* JADX INFO: renamed from: g0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C5945v {

    /* JADX INFO: renamed from: c */
    public static final C5945v f22637c = new a().m26634b(0).m26633a();

    /* JADX INFO: renamed from: d */
    public static final C5945v f22638d = new a().m26634b(1).m26633a();

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet<InterfaceC5929r> f22639a;

    /* JADX INFO: renamed from: b */
    public final String f22640b;

    /* JADX INFO: renamed from: g0.v$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final LinkedHashSet<InterfaceC5929r> f22641a = new LinkedHashSet<>();

        /* JADX INFO: renamed from: b */
        public String f22642b;

        /* JADX INFO: renamed from: a */
        public C5945v m26633a() {
            return new C5945v(this.f22641a, this.f22642b);
        }

        /* JADX INFO: renamed from: b */
        public a m26634b(int i10) {
            C12637g.m47078j(i10 != -1, "The specified lens facing is invalid.");
            this.f22641a.add(new C8791m2(i10));
            return this;
        }
    }

    public C5945v(LinkedHashSet<InterfaceC5929r> linkedHashSet, String str) {
        this.f22639a = linkedHashSet;
        this.f22640b = str;
    }

    /* JADX INFO: renamed from: a */
    public LinkedHashSet<InterfaceC8804p0> m26626a(LinkedHashSet<InterfaceC8804p0> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC8804p0> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo22074d());
        }
        List<InterfaceC5937t> listM26627b = m26627b(arrayList);
        LinkedHashSet<InterfaceC8804p0> linkedHashSet2 = new LinkedHashSet<>();
        for (InterfaceC8804p0 interfaceC8804p0 : linkedHashSet) {
            if (listM26627b.contains(interfaceC8804p0.mo22074d())) {
                linkedHashSet2.add(interfaceC8804p0);
            }
        }
        return linkedHashSet2;
    }

    /* JADX INFO: renamed from: b */
    public List<InterfaceC5937t> m26627b(List<InterfaceC5937t> list) {
        List<InterfaceC5937t> arrayList = new ArrayList<>(list);
        Iterator<InterfaceC5929r> it = this.f22639a.iterator();
        while (it.hasNext()) {
            arrayList = it.next().mo26560b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public LinkedHashSet<InterfaceC5929r> m26628c() {
        return this.f22639a;
    }

    /* JADX INFO: renamed from: d */
    public Integer m26629d() {
        Integer num = null;
        for (InterfaceC5929r interfaceC5929r : this.f22639a) {
            if (interfaceC5929r instanceof C8791m2) {
                Integer numValueOf = Integer.valueOf(((C8791m2) interfaceC5929r).m35281c());
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    /* JADX INFO: renamed from: e */
    public final String m26630e(Set<InterfaceC8804p0> set) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cams:");
        sb2.append(set.size());
        Iterator<InterfaceC8804p0> it = set.iterator();
        while (it.hasNext()) {
            InterfaceC8799o0 interfaceC8799o0Mo6698k = it.next().mo6698k();
            sb2.append(String.format(" Id:%s  Lens:%s", interfaceC8799o0Mo6698k.mo6750e(), Integer.valueOf(interfaceC8799o0Mo6698k.mo26583i())));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: f */
    public final String m26631f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("PhyId:%s  Filters:%s", this.f22640b, Integer.valueOf(this.f22639a.size())));
        for (InterfaceC5929r interfaceC5929r : this.f22639a) {
            sb2.append(" Id:");
            sb2.append(interfaceC5929r.m26559a());
            if (interfaceC5929r instanceof C8791m2) {
                sb2.append(" LensFilter:");
                sb2.append(((C8791m2) interfaceC5929r).m35281c());
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC8804p0 m26632g(LinkedHashSet<InterfaceC8804p0> linkedHashSet) {
        Iterator<InterfaceC8804p0> it = m26626a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException(String.format("No available camera can be found. %s %s", m26630e(linkedHashSet), m26631f()));
    }
}
