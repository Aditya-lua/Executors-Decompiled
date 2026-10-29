package p156h1;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import p115f1.C5279o;
import p115f1.C5306x;
import p140g0.C5902k0;
import p282m1.InterfaceC8389r1;
import p296n0.InterfaceC8721a2;
import p296n0.InterfaceC8855z1;
import p297n1.C8859b;
import p297n1.C8860c;
import p347p0.C10089e;
import p503w0.C12274d;
import p533x2.C12637g;

/* JADX INFO: renamed from: h1.h */
/* JADX INFO: loaded from: classes.dex */
public class C6267h implements InterfaceC8855z1 {

    /* JADX INFO: renamed from: c */
    public final InterfaceC8855z1 f23795c;

    /* JADX INFO: renamed from: d */
    public final Set<C5306x> f23796d;

    /* JADX INFO: renamed from: e */
    public final Set<Size> f23797e;

    /* JADX INFO: renamed from: f */
    public final Set<C5902k0> f23798f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC8389r1.a f23799g;

    /* JADX INFO: renamed from: h */
    public final Map<Integer, InterfaceC8721a2> f23800h = new HashMap();

    /* JADX INFO: renamed from: i */
    public final Map<C5902k0, C5279o> f23801i = new HashMap();

    public C6267h(InterfaceC8855z1 interfaceC8855z1, Collection<C5306x> collection, Collection<C5902k0> collection2, Collection<Size> collection3, InterfaceC8389r1.a aVar) {
        m27517c(collection2);
        this.f23795c = interfaceC8855z1;
        this.f23796d = new HashSet(collection);
        this.f23798f = new HashSet(collection2);
        this.f23797e = new HashSet(collection3);
        this.f23799g = aVar;
    }

    /* JADX INFO: renamed from: c */
    public static void m27517c(Collection<C5902k0> collection) {
        for (C5902k0 c5902k0 : collection) {
            if (!c5902k0.m26519e()) {
                throw new IllegalArgumentException("Contains non-fully specified DynamicRange: " + c5902k0);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private InterfaceC8721a2 m27518g(int i10) {
        if (this.f23800h.containsKey(Integer.valueOf(i10))) {
            return this.f23800h.get(Integer.valueOf(i10));
        }
        InterfaceC8721a2 interfaceC8721a2Mo27504b = this.f23795c.mo27504b(i10);
        C5306x.b bVarM27522e = m27522e(i10);
        if (bVarM27522e != null && !m27524h(interfaceC8721a2Mo27504b)) {
            interfaceC8721a2Mo27504b = m27520j(interfaceC8721a2Mo27504b, m27521d(bVarM27522e));
        }
        this.f23800h.put(Integer.valueOf(i10), interfaceC8721a2Mo27504b);
        return interfaceC8721a2Mo27504b;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m27519i(InterfaceC8721a2 interfaceC8721a2, C5902k0 c5902k0) {
        if (interfaceC8721a2 == null) {
            return false;
        }
        Iterator<InterfaceC8721a2.c> it = interfaceC8721a2.mo27490b().iterator();
        while (it.hasNext()) {
            if (C8859b.m35574f(it.next(), c5902k0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceC8721a2 m27520j(InterfaceC8721a2 interfaceC8721a2, InterfaceC8721a2 interfaceC8721a3) {
        if (interfaceC8721a2 == null && interfaceC8721a3 == null) {
            return null;
        }
        int iMo27489a = interfaceC8721a2 != null ? interfaceC8721a2.mo27489a() : interfaceC8721a3.mo27489a();
        int iMo27491e = interfaceC8721a2 != null ? interfaceC8721a2.mo27491e() : interfaceC8721a3.mo27491e();
        List<InterfaceC8721a2.a> listMo27492f = interfaceC8721a2 != null ? interfaceC8721a2.mo27492f() : interfaceC8721a3.mo27492f();
        ArrayList arrayList = new ArrayList();
        if (interfaceC8721a2 != null) {
            arrayList.addAll(interfaceC8721a2.mo27490b());
        }
        if (interfaceC8721a3 != null) {
            arrayList.addAll(interfaceC8721a3.mo27490b());
        }
        return InterfaceC8721a2.b.m34986h(iMo27489a, iMo27491e, listMo27492f, arrayList);
    }

    @Override // p296n0.InterfaceC8855z1
    /* JADX INFO: renamed from: a */
    public boolean mo27503a(int i10) {
        return m27518g(i10) != null;
    }

    @Override // p296n0.InterfaceC8855z1
    /* JADX INFO: renamed from: b */
    public InterfaceC8721a2 mo27504b(int i10) {
        return m27518g(i10);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC8721a2 m27521d(C5306x.b bVar) {
        AbstractC6268i abstractC6268iM24337c;
        C12637g.m47069a(this.f23796d.contains(bVar));
        InterfaceC8721a2 interfaceC8721a2Mo27504b = this.f23795c.mo27504b(bVar.m24595e(1));
        for (Size size : bVar.mo24325f()) {
            if (this.f23797e.contains(size)) {
                TreeMap treeMap = new TreeMap(new C10089e());
                ArrayList arrayList = new ArrayList();
                for (C5902k0 c5902k0 : this.f23798f) {
                    if (!m27519i(interfaceC8721a2Mo27504b, c5902k0) && (abstractC6268iM24337c = m27523f(c5902k0).m24337c(size)) != null) {
                        InterfaceC8721a2.c cVarMo27494k = abstractC6268iM24337c.mo27494k();
                        InterfaceC8389r1 interfaceC8389r1Mo34064a = this.f23799g.mo34064a(cVarMo27494k.mo34995i());
                        if (interfaceC8389r1Mo34064a != null && interfaceC8389r1Mo34064a.m34063e(size.getWidth(), size.getHeight())) {
                            treeMap.put(cVarMo27494k.m34997k(), abstractC6268iM24337c);
                            arrayList.add(C8860c.m35577a(cVarMo27494k, size, interfaceC8389r1Mo34064a.mo34057g()));
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    InterfaceC8721a2 interfaceC8721a2 = (InterfaceC8721a2) C12274d.m45569a(size, treeMap);
                    Objects.requireNonNull(interfaceC8721a2);
                    InterfaceC8721a2 interfaceC8721a3 = interfaceC8721a2;
                    return InterfaceC8721a2.b.m34986h(interfaceC8721a3.mo27489a(), interfaceC8721a3.mo27491e(), interfaceC8721a3.mo27492f(), arrayList);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final C5306x.b m27522e(int i10) {
        Iterator<C5306x> it = this.f23796d.iterator();
        while (it.hasNext()) {
            C5306x.b bVar = (C5306x.b) it.next();
            if (bVar.m24595e(1) == i10) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final C5279o m27523f(C5902k0 c5902k0) {
        if (this.f23801i.containsKey(c5902k0)) {
            C5279o c5279o = this.f23801i.get(c5902k0);
            Objects.requireNonNull(c5279o);
            return c5279o;
        }
        C5279o c5279o2 = new C5279o(new C6264e(this.f23795c, c5902k0), 1);
        this.f23801i.put(c5902k0, c5279o2);
        return c5279o2;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m27524h(InterfaceC8721a2 interfaceC8721a2) {
        if (interfaceC8721a2 == null) {
            return false;
        }
        Iterator<C5902k0> it = this.f23798f.iterator();
        while (it.hasNext()) {
            if (!m27519i(interfaceC8721a2, it.next())) {
                return false;
            }
        }
        return true;
    }
}
